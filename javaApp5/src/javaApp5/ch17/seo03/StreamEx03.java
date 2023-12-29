package javaApp5.ch17.seo03;
//p742
import java.util.*;

public class StreamEx03 {

	public static void main(String[] args) {
	//�߰���Ʈ��
		List<String> list = new ArrayList<>();
		list.add("this is java");
		list.add("i am a best developer");
		
		/*
		String a = "this is java";
		String[] as = a.split(" ");
		for (String s : as) {
			System.out.println(s);
		}
		*/ 
		
		//�䱸����:������ �־ " "���� �� �κ��� �߶� �ܾ ����ϱ�
		list.stream()
		.flatMap(t -> Arrays.stream(t.split(" ")))
		.forEach(p -> System.out.println(p));
		
		//
		List<String> list2 = Arrays.asList("	10, 20,  30"," 40,	50");
		int result2 = 
				list2.stream()
				.flatMapToInt(t -> {
					String[] sa = t.split(",");				// �߶��ִ¹迭�� �����Ͷ�
					int[] intArr = new int[sa.length];		// �߶��ִ� sa�� �迭�� �����Ͷ�.
					for(int i = 0; i < sa.length; i++) { 
						intArr[i]= Integer.parseInt( sa[i].trim() );	//trim���ϸ� �������ִ����� �߶��ش�.
					}
					return Arrays.stream(intArr);
				})
				.sum() ;
		System.out.println(result2);
	
			 	
		
		
		//�䱸����:������ �־ " "���� �� �κ��� �߶� �ܾ ����ϱ�
		list.stream()
		.flatMap(t -> Arrays.stream(t.split(" ")))
		.forEach(p -> System.out.println(p));
		
		//
		List<String> list3 = Arrays.asList("	10.5, 20.7,  30.9"," 40.1,	50.7");
		double result3 = 
				list3.stream()
					 .flatMapToDouble(t -> {
					String[] sa = t.split(",");				// �߶��ִ¹迭�� �����Ͷ�
					double[] dbArr = new double[sa.length];		// �߶��ִ� sa�� �迭�� �����Ͷ�.
					for(int i = 0; i < sa.length; i++) { 
						dbArr[i]= Double.parseDouble( sa[i].trim() );	//trim���ϸ� �������ִ����� �߶��ش�.
					}
					return Arrays.stream(dbArr);
				})
				.sum() ;
		System.out.println(result3);
	}
}
