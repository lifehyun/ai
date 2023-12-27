package javaApp3.ch13.sec05;


public class GenericEx02 {


public static void main(String[] args) {
   
   Course.registerCourse1( new Applicant<GenericEx02>(new GenericEx02()));
   Course.registerCourse1( new Applicant<Worker>(new Worker()));
   Course.registerCourse1( new Applicant<Student>(new Student()));
   Course.registerCourse1( new Applicant<HightStudent>(new HightStudent()));
   Course.registerCourse1( new Applicant<MiddleStudent>(new MiddleStudent()));
   
   }

}
class Person{
   
}

class Worker extends Person{
}

class Student extends Person{
}

class HightStudent extends Student{
}

class MiddleStudent extends Student{
   
}

class Applicant<T> {
   public T kind;
   public Applicant(T kind) {
   this.kind = kind;
   }
}

class Course {
   public static void registerCourse1(Applicant<?> applicant) {
      System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course1을 등록함");
   }
   
   public static void registerCourse2(Applicant<? extends Student> applicant) {
      System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course2을 등록함");
   }
   
   public static void registerCourse3(Applicant<? extends Student> applicant) {
      System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course3을 등록함");
   }
}