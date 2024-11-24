package me.kimyelin.Java_10;// Java 프로그래밍 - 추상 클래스

// 추상 클래스 Person
abstract class Person {
    abstract void printInfo();
}


// 추상 클래스 상속
class Student extends Person {

    @Override
    void printInfo() {
        System.out.println("Student.printInfo");
    }
}


public class Main {

    public static void main(String[] args) {
        
//        추상 클래스의 사용

        // 익명 클래스
        Person p1 = new Person() {
            @Override
            void printInfo() {
                System.out.println("Person.p1.printInfo");
            }
        };
        p1.printInfo();
        Student st1 = new Student();
        st1.printInfo();
    }

}
