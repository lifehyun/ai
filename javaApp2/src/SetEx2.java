
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx2 {

	public static void main(String[] args) {
		//String ��ü set�ֱ�
		//���� ���� : ��� ��  �� �ٳ��� ��� �� �츮�� �Ȱ� �ִ� ���� ������ ����?
		//Set�� ��Ҹ� �ֱ� 
		//Set�� ����Ŭ������ (.HashSet && .TreeSet�� �ִ�.)
		//Ctrl + shift + o ������ import�� �ڵ����� �ȴ�
		Set<String> set = new HashSet<String>();
		
		set.add("���");
		set.add("��");
		set.add("��");
		set.add("��"); 		// ���߿� ���� ��� �ߺ������� �ȳ־��ش�.
		set.add("�ٳ���");
		set.add("���");
		
		//set�ȿ� ��� ���� ���ϱ� . �츮�� �Ȱ� �ִ� ���� ������ ������?
		System.out.println(set.size());
		
		//"�޷�" �Ⱦƿ�? .contains�� ����°�.
		System.out.println(set.contains("�޷�"));
		
		
		//set�ȿ� �ִ� ��� ����ϱ�
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//set�ȿ� �ִ� ��θ� �����ϱ�
		set.clear();
		System.out.println(set.size());
	}

}
