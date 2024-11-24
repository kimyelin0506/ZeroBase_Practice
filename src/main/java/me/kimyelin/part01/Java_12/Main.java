package me.kimyelin.part01.Java_12;// Java 프로그래밍 - 내부 클래스

class Outer{
    public void print(){
        System.out.println("Outer.print()");
    }

    class Inner{
        public void innerPrint(){
            Outer.this.print();
        }
    }

    static class InnnerStaticClass{
        void innerPrint(){
//            Outer.this.print();  //정적 특성을 가짐 -> 바로 메모리에 올라가기 때문에
        }
    }
}

abstract class Person{
    public void a(){
        System.out.println("aaa");
    }
    public abstract void printInfo();
}

class Student extends Person{
    public void printInfo(){
        System.out.println("Student,printInfo()");
    }
}
public class Main {

    public static void main(String[] args) {

//      외부 클래스
        Outer o1 = new Outer();
//      내부 클래스 - 인스턴스
        Outer.Inner i1 = new Outer().new Inner();  //외부 -> 내부 순서로 객체 생성
//      내부 클래스 - 정적
        Outer.InnnerStaticClass is1 = new Outer.InnnerStaticClass(); // 정적 -> 선언 없이 바로 사용 가능
//      익명 클래스
        Person p1 = new Person() {
            @Override
            public void printInfo() {
                System.out.println("main.printInfo()");
            }
        };

        p1.printInfo();
    }

}
