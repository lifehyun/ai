package javaBasic3;

public class Ŭ������������ {

	public static void main(String[] args) {
	//��ü�������� ���� ���� �־��ֱ�
	Student s1 = new Student("20231201","ȫ�浿","AI",100,"010-123-1234");	
	
	Teacher t1 = new Teacher("A32","������","�İ�","����",10000000,20);
		
	//����ϱ�
	System.out.println(s1.get�й�());// "�й�"
	System.out.println(s1.get�а�());// "ai"
	System.out.println(t1.get�̸�());// "������"
	System.out.println(t1.get����());// "����"
	System.out.println(s1.get����());// "100"
	System.out.println(t1.get�ü�());// "20"
	System.out.println(s1.get��ȭ��ȣ()); //"��ȭ��ȣ"
	System.out.println(t1.get�ڵ�());//"�ڵ�"
	
	
	//�ʿ��Ҷ� ���� �ֱ�
	// �� ��ü �����ϱ�
	Student s2 = new Student();
	Teacher t2 = new Teacher();
	
	// �� �ֱ�
	s2.set�й�("2201");
	s2.set�̸�("�̼���");
	s2.set�а�("�濵�а�");
	s2.set����(85);
	s2.set��ȭ��ȣ("010-234-2345");
	
	t2.set�ڵ�("B101");
	t2.set�̸�("����");
	t2.set����("�ǾƳ�");
	t2.set�޿�(2000000);
	t2.set����("�ð�����");
	t2.set�ü�(30);
	
	System.out.println(s2.get�й�()+" "+ s2.get�̸�()+"  "+ s2.get�а�()+"  "+s2.get����()+"  "+s2.get��ȭ��ȣ());	
	System.out.println(t2.get�ڵ�()+" "+ t2.get�̸�()+"  "+ t2.get����()+"  "+t2.get�޿�()+"  "+t2.get����()+"  "+t2.get�ü�());	
	
	//�����ڷ� ���� �ֱ�
	�ڵ����Ǹ���Ȳ car1 = new �ڵ����Ǹ���Ȳ("��Ÿ��",35000000,15000000,20000000,36,55555556);
	
	//�� ��ü�� �����ϱ�
	�ڵ����Ǹ���Ȳ car2 = new �ڵ����Ǹ���Ȳ();
	
	// ��ü�� ���� �־��ֱ� *.set ;
	car2.set������("�ڶ���");
	car2.set�����Ѿ�(24000000);
	car2.set�ε���(5000000);
	car2.set�Һο���(19000000);
	car2.set��ȯ�Ⱓ��(24);
	car2.set�����Ա�(791666);
	
	//����ϱ� 
	System.out.println("       �ڵ��� �Ǹ� ��Ȳ ");
	System.out.println();
	System.out.println("������ �����Ѿ� �ε��� �Һο��� ��ȯ�Ⱓ�� �����Ա�");
	System.out.println(car1.get������()+"  "+car1.get�����Ѿ�()+"  "+car1.get�ε���()+"  "+car1.get�Һο���()+"  "+car1.get��ȯ�Ⱓ��()+"  "+car1.get�����Ա�());
	System.out.println(car2.get������()+"  "+car2.get�����Ѿ�()+"  "+car2.get�ε���()+"  "+car2.get�Һο���()+"  "+car2.get��ȯ�Ⱓ��()+"  "+car2.get�����Ա�());	
	System.out.println("���� �Ѿ��� �հ� " + (car1.get�����Ѿ�()+car2.get�����Ѿ�() ));	
	System.out.println("�� ���ӱ��� �Ѿ���"+ ( car1.get�����Ա�()+car2.get�����Ա�() ));	
	
	// ��Ÿ�䰡 �����Ѿ��� 4000000000���� ������ �ƴٸ� ? *.set�Է� ,���� �����ϴ�.
	car1.set�����Ѿ�(40000000);
	System.out.println(car1.get������()+"  "+car1.get�����Ѿ�()+"  "+car1.get�ε���()+"  "+car1.get�Һο���()+"  "+car1.get��ȯ�Ⱓ��()+"  "+car1.get�����Ա�());

	
	
	
	
	
	
	
	
	
	
	
	}

}
