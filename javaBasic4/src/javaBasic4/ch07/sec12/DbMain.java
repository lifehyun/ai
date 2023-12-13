package javaBasic4.ch07.sec12;

public class DbMain {

	public static void main(String[] args) {
	Connect myConnect = new Connect();
	
	//오라클
	myConnect.db = new Oracle();	
	myConnect.dbRun();
	//MySQL
	myConnect.db = new MySQL();
	myConnect.dbRun();
	//몽고
	
	
	}

}

//필드를 선언하는데 부모타입 필드를 선언한다.
class Connect  {
	
	DB db;
	
	public void dbRun() {
		db.runDB();
	}
}