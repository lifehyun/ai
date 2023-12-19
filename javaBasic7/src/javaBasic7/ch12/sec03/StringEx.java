package javaBasic7.ch12.sec03;

import java.util.Arrays;

// P520
public class StringEx {

	public static void main(String[] args) {

		String data = "자바"; 
		byte[] arr1 = data.getBytes();
		System.out.println(arr1[1] ); // 유니코드로 출력된 값
		System.out.println(arr1.length); 
		//배열의 길이는? 물어보는것임
		//한글의 한글자는 2byte를 차지하고 있어서 4byte값이 나옴.
		
		//모든배열의 관한걸 물어보는것이 Arrays.임
		//여기서 to는 ~~로 라는 뜻임. to.String:[]괄호안을 string으로 바꿔라
		String str1 = Arrays.toString(arr1);
		System.out.println(str1); // 유니코드로 출력된 값 [,,,,4개로 나눠짐]
		
		//StringBuilder 클래스
		data = data + "java";
		System.out.println(data);
		
		StringBuilder sb = new StringBuilder();
		sb.append("자바");
		System.out.println(sb);
		sb.append("java");
		System.out.println(sb);
		//0번 인덱스에 "a"를 삽입하기
		sb.insert(0,"a");
		System.out.println(sb);
		sb.delete(1, 3);
		System.out.println(sb);
		
		
		
		
		
	}

}
