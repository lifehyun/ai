
import p328

print( p328.add(10,20))
print( p328.sub(10,20))
print( p328.mul(10,20))
print( p328.div(10,20))

#애칭으로 부르는것 ( p328를 p라고 불러줘 )

import p328 as p

print( p.add(10,20))
print( p.sub(10,20))
print( p.mul(10,20))
print( p.div(10,20))

#해당하는 모듈의 전부를 쓰는게 아니라 필요한 함수만 (import) 사용하겟다.
#impor안에
from p328 import sub , mul , mm , ss

#사용하지 않을함수
# print( add(10,20))
# print( div(10,20))

#사용할 함수
print( sub(10,20))
print( mul(10,20))
print(mm(10,30))      #30의 제곱에다 10을 더하기
print(ss(3,2,1))      #가장 작은수 출력하기