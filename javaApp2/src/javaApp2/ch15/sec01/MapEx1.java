package javaApp2.ch15.sec01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//p656
public class MapEx1 {

	public static void main(String[] args) {

		Map<Integer, String> map1 = new HashMap<Integer, String>();	
		//�տ��ִ� 123 &&"a""b"�� key�̴�
		
		//����,�ֱ�
		map1.put(1, "�̼���");
		map1.put(2, "�ڼ���");
		map1.put(3, "ȫ�浿");
		map1.put(3, "ȫ�浿1");
		map1.put(3, "ȫ�浿2");	
		
		
		//����ϱ�,ȫ�浿�� ������ ���� get()
		System.out.println(map1.get(3));
		
		//�����ϱ�
		map1.remove(3);
		
		//��ü����ϱ�
		//1�ܰ� Ű���� ������ KeySet()
		//2�ܰ� Ű 1���� ����Ѵ�
		Set<Integer> mapk1 = map1.keySet();
		
		Iterator<Integer> it1 = mapk1.iterator();
		while(it1.hasNext()) {
//			System.out.println(it1.next()+ "-_<");
			System.out.println(map1.get(it1.next())+"-_-"); //Values �� �μ�
		}

		Map<String, Double> map2 = new HashMap<String, Double>(); 
		//map2�� ���� �ֱ�
		map2.put("a", 2.5);
		map2.put("b", 3.5);
		map2.put("b", 3.5);
		map2.put("b", 3.5);
		map2.put("b", 13.5);
	
		//����ϱ�,3.5�� ������ ���� get()
		System.out.println(map2.get("b"));
		
		//ũ�� ���ϱ�
		System.out.println(map1.size()); //key�� �����ϸ� ���ü�� �Ǵ��ϰ� / ������ ���� ��µȴ� 
		
		
		Map<String, String> map3 = new HashMap<String, String>();
		map3.put("ȫ�浿","����");
		map3.put("�̼���","����");
		map3.put("�ְ��","���");
		map3.put("ȫ�浿","����");
		
		//ũ��� ? ȸ���ο���
		System.out.println(map3.size());
		
		//�̼����� ��å��?
		System.out.println(map3.get("�̼���"));
		
		//�ְ���� ��å��?
		System.out.println(map3.get("�ְ��"));
		
		//ȫ�浿�� ��å��?
		System.out.println(map3.get("ȫ�浿"));
		
		//�ְ�̰� ����ߴ� �����ϱ�
		map3.remove("�ְ��");
		
		//��ü����ϱ�
		System.out.println(map3.get("ȫ�浿"));
		System.out.println(map3.get("�̼���"));
		
		
		//��ü����Ϸ��� key�� �ݺ��ؼ� �־��ָ� �ȴ�
		//keySet() ��� Ű�� Set�� ��´�
		Set<String> map3k = map3.keySet();
		
		Iterator<String> it3 = map3k.iterator();
		while(it3.hasNext()) {
//			System.out.println(it.next());			//key�� ���� �ݺ��Ǿ� ��µȴ�.
			System.out.println(map3.get(it3.next())+ ">_��" );
		}
	}

}
