package javaBasic4.ch07.sec14;
//부모메소드
public class  MainActivity extends Activity {

	@Override
	public void onCreate() {
	super.onCreate(); //부모메소드 호출
		System.out.println("추가적인 실행 내용");
	}
}
 