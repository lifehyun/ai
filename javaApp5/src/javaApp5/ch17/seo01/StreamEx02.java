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
	//목표: 1단계 컬렉션,배열을 스트림으로 만든 방법을 상세하게 배움
	
		//리스트 만들기 --> ArrayList속에 <Product>주소가 들어간다.			
		 List<Product> list = new ArrayList<Product>();
		
		//자료넣기	
		for (int i=1; i<=5; i++) {
		Product product = new Product(i, "멋진회사", "상품"+i , (int)(10000*Math.random())); // 0.0<= Math.random() <1.0
		list.add(product);
		}
		
		
		//"컬렉션"으로 만든걸 --> 스트림으로 만들기
		Stream<Product> stream = list.stream();
		//출력하기.
		stream.forEach(p-> System.out.println(p)); 
		
		//위에코드를 더간단하게 코드짠것.(순서:컬렉션.오리지널스트림.출력하기)
		list.stream() 
			.forEach(p-> System.out.println(p));
		
		//"배열"을 스트림으로 만들기
		String[] strArr = {"홍길동","신용권","김미나","신주미"};
		Stream<String> stS = Arrays.stream(strArr); 	//배열이 오리지널 스트림으로 바뀐다.
		
		// boolean test(T t);이 생략되어있다. "신씨만 출력" 
		stS.filter(t-> t.startsWith("신"))
		   .forEach(p -> System.out.println( p + " 장학금 대상 " ));
		
		//숫자범위로 스트림열기
		//요구사랑 1~100까지 합을 구하기
		IntStream is = IntStream.range(1, 101); 	//1 <= IntSream.range(1,100) <100
		System.out.println(is.count());				//최종스트림으로 오리지널 스트림 자료 소멸된다.
		
		//최대값구하기
		is = IntStream.range(1, 101);				//다시 오리지널 스트림으로 만들어준다. 
		System.out.println(is.max().toString());
		
		//최솟값구하기
		is = IntStream.range(1, 101);				
		System.out.println(is.min().toString());
		
		//파일로부터 스트림 열기
		//지금현재파일에서 경로에 있는 파일을 가지고와라 -> 에러생길시 throws Exception main
		Path pt = Paths.get(StreamEx02.class.getResource("data.txt").toURI());
		//해당 경로의 파일을 스트림으로 바꾸어 준다. Charset.defaultCharset() 문자의 유니코드는 자바의 유니코드(UFT-8)를 이용한다.
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