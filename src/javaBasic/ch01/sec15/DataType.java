package javaBasic.ch01.sec15;

public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자료형 = 기본형(정수형 byte, int ,long, 실수형 - float double, 논리형- boolean 문자형 - char )
		//정수처리 이것이자바다 p.39 
		byte b1 = 127; //-128 ~ 127
		System.out.println( b1 );
		
		short s1 = 32767; // -32768 ~32767
		//long  l01 = 9000000000000000000l;
		
		byte b2=10;
		byte b3=20;
		
		int b23 = b2 + b3; // 연산자 int형으로 처리함 byte형(1) int형(4) byte형(1)
		
		short s2 = -20;
		short s3 = +20;
		
		int resul123 = s2 - s3; // -40
		
		byte b4 = 20;
		short s4 = 30;
		
		long sumb4s4 = b4 + s4;
		
		float f1 = 3.14f;
		float f2 = 3.123456789f; // 소수점 7자까지 출력
	
		System.out.println(f1+" "+f2);
		
		double d1 = 3.123456789012345; //15자리까지 출력하기
		System.out.println( d1 );
		
		
		//실수형은 float - 4byte 와 double형 - 8byte
		
		float f3=10.23f;
		float f4=2.45f;
		float mulf3f4= f3 * f4;
		System.out.println(mulf3f4);
		
		double mulf3f4d = f3 * f4;
		System.out.println(mulf3f4);
		
		double d3=3.14;
		double d4=12.65;
		
		double muld3d4 = d3 * d4 ;
		System.out.println(muld3d4);
		
		double muld3d4f = d3 * d4 ;
		
		//float muld3d4f = d3 * d4; 에러발생 왜? 작은타입으로 넣어주니까
		
		double resulf3f4 = f3 / f4; // float자료형이 double형으로 변환됨 - 형변환 cast연산 자동형변환
		
		int ii1=10;
		short ss1=20;
	
		float ff1= ii1;
		
		//실수형 -->정수형  30평아파트--> 8평원룸 구구를 버려야한다. 데이터손실
		//형식  정수형  변수형 = (정수형타입) 실수형변수  byte 실수 , 

		double d10 = 3.14;
		int chang10 =(int) d10; //소숫점 .14를 손실했다.
		System.out.println(d10+" "+chang10);
		
		float f10 = 10.25f;
		byte chagef10 = (byte) f10;

		int i10 = 3000;
		short chi10 = (short) i10;
		
		
		//문 정수형으로 국어점수 수학점수 영어점수 변수 담으세요.
		
		int  kor=80;
		int  mat=90;
		int  eng=100;
		
		//합계구하기
		int sum = kor+mat+eng;
				
		//평균구하기 실수형
		double avg = sum / 3.0; //253 / 3.0  정수나누기실수면 실수가 나온다 
		double avg1 = (double)(sum) / 3;
		
		//수학점수의 거듭제곱 90**2
		int matdouble = mat*mat;
		
	
		
		
        //출력하기
        System.out.println("합계" + sum / 3);
        System.out.println("평균은"+ avg);//84.3이 왜 안나오나요?
        System.out.println("평균은"+ avg1);
        System.out.println("수학점수의 거듭제곱"+ matdouble);
		
        char ch1 = 'a'; // a, 97은 동일 [유니코드]
        System.out.println(ch1 - 27 );
        System.out.println((int) ch1 );

        System.out.println((char) ch1 +3 );
        System.out.printf("%c",ch1 + 3); //"%c"는 문자형으로 ch1+3의 100유니코드숫자를 문자형으로 출력하기
		
        //korea를 출력하기[유니코드,캐릭터]
        System.out.printf("%c%c%c%c%c", 75,111,114,101,97);
       
		
		
		
	}

}
