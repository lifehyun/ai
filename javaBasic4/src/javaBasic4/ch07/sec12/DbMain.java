package javaBasic4.ch07.sec12;

public class DbMain {

	public static void main(String[] args) {
	Connect myConnect = new Connect();
	
	//����Ŭ
	myConnect.db = new Oracle();	
	myConnect.dbRun();
	//MySQL
	myConnect.db = new MySQL();
	myConnect.dbRun();
	//����
	
	
	}

}

//�ʵ带 �����ϴµ� �θ�Ÿ�� �ʵ带 �����Ѵ�.
class Connect  {
	
	DB db;
	
	public void dbRun() {
		db.runDB();
	}
}