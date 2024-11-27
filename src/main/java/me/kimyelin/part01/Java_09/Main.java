package me.kimyelin.part01.Java_09;// Java 프로그래밍 - 다형성

class Person {
    public void print() {
        System.out.println("Person.print");
    }
}

class Student extends Person {
    public void print() {
        System.out.println("Student.print");
    }

    public void print2() {
        System.out.println("Student.print2");
    }
}

class CollegeStudent extends Person {
    public void print() {
        System.out.println("CollegeStudent.print");
    }
}


public class Main {

    public static void main(String[] args) {

//      1. 다형성
        System.out.println("== 다형성 ==");
        Person p1 = new Person();
        Student s1 = new Student();

        Person p2 = new Student();    // 자식 -> 부모는 가능
//        Student s2 = new Person();  //부모 -> 자식은 안됨
        p1.print();
        s1.print();
        s1.print2();
        p2.print();  //type은 부모이지만 출력은 자식
//        p2.print2();  //부모객체에 넣었으니 부모가 아는 부분(오버라이딩 포함)까지만 출력가능

        Person p3 = new CollegeStudent();
//        CollegeStudent c1 = new Student();  //자식 -> 자식도 안됨

//      2. 타입 변환
        System.out.println("== 타입 변환 ==");
        Person pp1 = null;
        Student ss1 = null;

        Person pp2 = new Person();
        Student ss2 = new Student();
        Person pp3 = new Student(); //업캐스팅

        pp1 = pp2;
        pp1 = ss2;

        ss1 = ss2;
//        ss1 = pp2;
        ss1 = (Student) pp3;  //실객체: 자식 -> 타입변환  : 다운 캐스팅

        CollegeStudent cc1;
        CollegeStudent cc2 = new CollegeStudent();
//        ss1 = (Student) cc2;
//        cc1 = (CollegeStudent) ss1;

//      3. instanceof
        System.out.println("== instanceof ==");
        Person pe1 = new Person();
        Student st1 = new Student();
        Person pe2 = new Student();  //업캐스팅
        Person pe3 = new CollegeStudent();

        System.out.println(pe1 instanceof Person);  //true
        System.out.println(pe1 instanceof Student);  // false  a instanceof b --> a < b
        System.out.println("-----");
        System.out.println(st1 instanceof Person);  // true
        System.out.println(st1 instanceof Student);  //true
        System.out.println("-----");
        System.out.println(pe2 instanceof Person);  //true
        System.out.println(pe2 instanceof Student);  //true
        System.out.println("-----");
        System.out.println(pe3 instanceof Person); //true
        System.out.println(pe3 instanceof CollegeStudent);  //true

        if(pe1 instanceof Student){
            Student stu1 = (Student) pe1;
        }

        if(st1 instanceof Person){
            Person per1 = (Person) st1;
        }


    }
}
