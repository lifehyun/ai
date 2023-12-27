package javaApp4.ch16.sec02;

public class LamdaEx02 {

    public static void main(String[] args) {
        // "서울" --> 서울대학교 , "인천" --> 인천대학교
        Colleague<String> s1 = name -> name + "대학교"; // 매개변수값이 1개이면 () 괄호는 생략가능
        System.out.println(s1.convertName("서울"));
        System.out.println(s1.convertName("인천"));

        // 사과 사세요 . 배 사세요.
        Colleague<String> s2 = a -> a + " 사세요";
        System.out.println(s2.convertName("사과"));
        System.out.println(s2.convertName("배"));

        // 3000원 이상이면 비싸요 . 미만이면 싸요
        Colleague<Integer> s3 = price -> (price >= 3000) ? "비싸요" : "싸요";
        System.out.println(s3.convertName(2000));
        System.out.println(s3.convertName(5000));
    }
}

@FunctionalInterface
interface Colleague<T> {
    String convertName(T name);
}