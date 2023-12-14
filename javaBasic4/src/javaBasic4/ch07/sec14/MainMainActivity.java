package javaBasic4.ch07.sec14;
//손자메소드
public class MainMainActivity extends MainActivity{

	@Override
	public void onCreate() {
		super.onCreate(); //자식메소드
		System.out.println("추가 추가적인 실행내용");
	}
}
