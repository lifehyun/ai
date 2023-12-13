# 온라인 서점의 책 결제 금액
price = 20000
discount = 10
delivery = 3000

#만약에 배송료가 2000이상이면 비싸다 출력하고 
#배송료 *0.02 추가할인해서 결제금액 다시 계사
#아니면 저렴하다
if delivery >= 2000 :
    print('비싸다')
    delivery  = delivery *(1- 0.02)#0.98*해주면 된다.
else : 
    print('저렴하다')

#만약에 배송료가 2000이상이면 비싸다 , 저렴하다
if delivery >= 2000 :
    print('비싸다')
else : 
    print('저렴하다')

pay = price-(price *(discount/100))+ delivery
print(f'책값은{price},할인율은{discount}%')
print(f'배송료{delivery},결제금액은{int(pay)}')
