package javaApp4.ch16.sec02;

public class LamdaEx02 {

    public static void main(String[] args) {
        // "����" --> ������б� , "��õ" --> ��õ���б�
        Colleague<String> s1 = name -> name + "���б�"; // �Ű��������� 1���̸� () ��ȣ�� ��������
        System.out.println(s1.convertName("����"));
        System.out.println(s1.convertName("��õ"));

        // ��� �缼�� . �� �缼��.
        Colleague<String> s2 = a -> a + " �缼��";
        System.out.println(s2.convertName("���"));
        System.out.println(s2.convertName("��"));

        // 3000�� �̻��̸� ��ο� . �̸��̸� �ο�
        Colleague<Integer> s3 = price -> (price >= 3000) ? "��ο�" : "�ο�";
        System.out.println(s3.convertName(2000));
        System.out.println(s3.convertName(5000));
    }
}

@FunctionalInterface
interface Colleague<T> {
    String convertName(T name);
}