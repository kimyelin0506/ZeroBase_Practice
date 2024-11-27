package me.kimyelin.part01.Java_09;// Practice
// 아래의 클래스와 상속 관계에서 다형성을 이용하여
// Car 객체를 통해 아래와 같이 출력될 수 있도록 Test code 부분을 구현해보세요.
// 빵빵!
// 위이잉!
// 삐뽀삐뽀!

class Car {
    Car(){}
    public void horn() {
        System.out.println("빵빵!");
    }
}

class FireTruck extends Car {
    public void horn() {
        System.out.println("위이잉!");
    }
}

class Ambulance extends Car {
    public void horn() {
        System.out.println("삐뽀삐뽀!");
    }
}

public class Practice {
    public static void main(String[] args) {
        // Test code
        Car c = new Car();
        c.horn();
        c = new FireTruck();
        c.horn();
        c = new Ambulance();
        c.horn();
        
        Car[] cars = {new Car(), new FireTruck(), new Ambulance()};
        for(Car item : cars){
            item.horn();
        }

    }
}
