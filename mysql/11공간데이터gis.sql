-- P569 14장 지리 정보 시스템 (https://map.ngii.go.kr/mi/emapApi/searchApiGuid.do)
-- mysql 5.0 이후 geometry 자료형을 지원함

DROP DATABASE IF EXISTS GisDB;
CREATE DATABASE GisDB;

USE GisDB;

CREATE TABLE StreamTbl (
   MapNumber CHAR(10),  -- 지도일련번호
   StreamName CHAR(20),  -- 하천이름
   Stream GEOMETRY ); -- 공간데이터(하천개체)


INSERT INTO StreamTbl VALUES ( '330000001' ,  '한류천', 
   ST_GeomFromText('LINESTRING (-10 30, -50 70, 50 70)')); -- x축과 y축을 연결한다.
INSERT INTO StreamTbl VALUES ( '330000001' ,  '안양천', 
   ST_GeomFromText('LINESTRING (-50 -70, 30 -10, 70 -10)'));
INSERT INTO StreamTbl VALUES ('330000002' ,  '일산천', 
   ST_GeomFromText('LINESTRING (-70 50, -30 -30, 30 -60)'));

SELECT * FROM StreamTbl; 
-- 좌표점을 보려면  building -> BLOB에서 오른쪽 마우스 누르고 open values in viewer

CREATE TABLE BuildingTbl (
   MapNumber CHAR(10),  -- 지도일련번호
   BuildingName CHAR(20),  -- 건물이름
   Building GEOMETRY ); -- 공간데이터(건물개체)
   
INSERT INTO BuildingTbl VALUES ('330000005' ,  '하나은행', 
   ST_GeomFromText('POLYGON ((-10 50, 10 30, -10 10, -30 30, -10 50))'));
INSERT INTO BuildingTbl VALUES ( '330000001' ,  '우리빌딩', 
   ST_GeomFromText('POLYGON ((-50 -70, -40 -70, -40 -80, -50 -80, -50 -70))'));
INSERT INTO BuildingTbl VALUES ( '330000002' ,  '디티오피스텔', 
   ST_GeomFromText('POLYGON ((40 0, 60 0, 60 -20, 40 -20, 40 0))'));
-- POLYGON을 만들때는 처음 좌료와 마지막 좌표가 동일해야한다.


-- 두개다 보고싶을때 
SELECT * FROM BuildingTbl
union all
select * from streamtbl;

SELECT * FROM StreamTbl WHERE ST_Length(Stream) > 140 ; -- ST_Length()길이구하는 함수

SELECT BuildingName, ST_AREA(Building) FROM BuildingTbl 
   WHERE ST_AREA(Building) < 500;

-- p583 
SELECT StreamName, BuildingName, Building, Stream
   FROM BuildingTbl , StreamTbl 
   WHERE ST_Intersects(Building, Stream) = 1   AND StreamName = '안양천';

SELECT ST_Buffer(Stream,5) FROM StreamTbl; -- 하천의 폭이 5만큼 커진다.