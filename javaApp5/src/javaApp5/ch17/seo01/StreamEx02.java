package javaApp5.ch17.seo01;



import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx02 {

	public static void main(String[] args) throws Exception {
	//��ǥ: 1�ܰ� �÷���,�迭�� ��Ʈ������ ���� ����� ���ϰ� ���
	
		//����Ʈ ����� --> ArrayList�ӿ� <Product>�ּҰ� ����.			
		 List<Product> list = new ArrayList<Product>();
		
		//�ڷ�ֱ�	
		for (int i=1; i<=5; i++) {
		Product product = new Product(i, "����ȸ��", "��ǰ"+i , (int)(10000*Math.random())); // 0.0<= Math.random() <1.0
		list.add(product);
		}
		
		
		//"�÷���"���� ����� --> ��Ʈ������ �����
		Stream<Product> stream = list.stream();
		//����ϱ�.
		stream.forEach(p-> System.out.println(p)); 
		
		//�����ڵ带 �������ϰ� �ڵ�§��.(����:�÷���.�������ν�Ʈ��.����ϱ�)
		list.stream() 
			.forEach(p-> System.out.println(p));
		
		//"�迭"�� ��Ʈ������ �����
		String[] strArr = {"ȫ�浿","�ſ��","��̳�","���ֹ�"};
		Stream<String> stS = Arrays.stream(strArr); 	//�迭�� �������� ��Ʈ������ �ٲ��.
		
		// boolean test(T t);�� �����Ǿ��ִ�. "�ž��� ���" 
		stS.filter(t-> t.startsWith("��"))
		   .forEach(p -> System.out.println( p + " ���б� ��� " ));
		
		//���ڹ����� ��Ʈ������
		//�䱸��� 1~100���� ���� ���ϱ�
		IntStream is = IntStream.range(1, 101); 	//1 <= IntSream.range(1,100) <100
		System.out.println(is.count());				//������Ʈ������ �������� ��Ʈ�� �ڷ� �Ҹ�ȴ�.
		
		//�ִ밪���ϱ�
		is = IntStream.range(1, 101);				//�ٽ� �������� ��Ʈ������ ������ش�. 
		System.out.println(is.max().toString());
		
		//�ּڰ����ϱ�
		is = IntStream.range(1, 101);				
		System.out.println(is.min().toString());
		
		//���Ϸκ��� ��Ʈ�� ����
		//�����������Ͽ��� ��ο� �ִ� ������ ������Ͷ� -> ��������� throws Exception main
		Path pt = Paths.get(StreamEx02.class.getResource("data.txt").toURI());
		//�ش� ����� ������ ��Ʈ������ �ٲپ� �ش�. Charset.defaultCharset() ������ �����ڵ�� �ڹ��� �����ڵ�(UFT-8)�� �̿��Ѵ�.
		Stream<String> filesS = Files.lines(pt);
		filesS.forEach(p -> System.out.println(p));
		filesS.close();
		
	} 

}

class Product{
	private int pno;
	private String name;
	private String Company;
	private int price;
	
	@Override
	public String toString() {
		return pno + " " + Company + " " + name + " " + price;
	}
	
	public Product(int pno,String company , String name,int price) {
		super();
		this.pno = pno;
		this.Company = company;
		this.name = name;
		this.price = price;
	}

	
	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	

	
	
	
}