package me.kimyelin.part01.Java_07_1;// Java 프로그래밍 - 클래스와 객체_1

// Car 클래스 - 객체변수, 메소드
class Car{
    String name;
    String type;

    public void printCaInfo(){
        System.out.println("== Car Info ==");
        System.out.println("name = " + name);
        System.out.println("type = " + type);
    }

    public void move(){
        System.out.println("move");
    }

    public void brake(){
        System.out.println("stop");
    }
}

// Car2 클래스 - 생성자, this
class Car2{
    String name;
    String type;

    public void printCaInfo(){
        System.out.println("== Car Info ==");
        System.out.println("name = " + name);
        System.out.println("type = " + type);
    }

    Car2(String name, String type){
        this.name = name;
        this.type = type;
        System.out.println("생성자 출력");
    }

    public void load(){
        System.out.println("짐을 주세요");
    }

    public void horn(){
        System.out.println("빵빵");
    }
}

public class Main {

    public static void main(String[] args) {
//      Car 클래스 사용
        Car myCar1 = new Car();
        myCar1.name = "a";
        myCar1.type = "suv";
        myCar1.printCaInfo();
        myCar1.move();
        myCar1.brake();
        System.out.println();

//      Car2 클래스 사용
        Car2 myCar2 = new Car2("b", "sedan");
        myCar2.printCaInfo();
        myCar2.load();
        myCar2.horn();

    }
}
