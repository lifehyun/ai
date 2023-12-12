package javaBasic4.ch07.sec01;
//p.284 부모클래스 
public class SmartPhoneExample {

	public static void main(String[] args) {
		
	//벨이 올립니다
	Phone p = new Phone();
	p.bell();
	
	//자기야 잘잤어
	p.sendVoice("잘 잤어!");
	//상대방 잘잤어 너도 잘잤어	
	p.receiveVoice("잘잤어 너도 잘잤어?");	
		
	SmartPhone sp = new SmartPhone();		
	sp.sendVoice("오늘 뭐할거야?");
	sp.receiveVoice("오늘은 공부 할거야");
	sp.hangUp(" ");	
	
	
	SmartPhone sp2 =new SmartPhone("아이폰","흰색");
	System.out.println(sp.model);	
	sp.setWifi(false);	
	if(sp2.wifi){
		System.out.println("와이파이가 됩니다");
	}else {
		System.out.println("와이파이가 안됩니다");
	}
	
	if(sp2.wifi) {
		System.out.println(sp2.model+"와이파이가 됩니다.");
	}else{
		System.out.println(sp2.color+"핸드폰은 와이파이가 안됩니다.");
	}
	
	//아이폰은 흰색이고 벨이 울립니다
	System.out.println(sp2.model +"은"+sp2.color+"이고");
	sp2.bell();
	
	//아이폰의 메세지가 왔습니다 "자기: 핸드폰 샀어?"
	System.out.println(sp2.model+"의 메세지가 왔습니다");
	sp.sendVoice("핸드폰 샀어?");
	
	
	//부모클래스에서 자식의 wifi 필드,메소드 사용하기 
	//부모클래스는 자식필드는 사용하지 못한다.
	//자식클래스는 부모꺼 사용할수있다.
//	p.wifi = true;  
//	p.setwifi(true);
//	p.internet();
	
	
	

}
	
	
}