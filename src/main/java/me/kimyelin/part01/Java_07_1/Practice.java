package me.kimyelin.part01.Java_07_1;//  Practice
//  다음 클래스 직접 만든 후 객체 생성
//  클래스명: Animal
//  특성: 이름, 무게, 분류
//  기능: 먹기, 잠자기, 걷기, 뛰기

class Animal{
    String name;
    double weight;
    String classification;

    public Animal(String name, double weight, String classification) {
        this.name = name;
        this.weight = weight;
        this.classification = classification;
    }
    public void printInfo(){
        System.out.println("name = " + name);
        System.out.println("weight = " + weight);
        System.out.println("classification = " + classification);
    }

    public void eat(){
        System.out.println(this.name+" eat");
    }

    public void walk(){
        System.out.println(this.name+" walk");
    }

    public void run(){
        System.out.println(this.name+" run");
    }
}

public class Practice {
    public static void main(String[] args) {
        // Test code
        Animal animal1 = new Animal("강아지", 5.0, "포유류");
        Animal animal2 = new Animal("구피", 0.01, "어류");

        animal1.printInfo();
        animal1.eat();
        animal1.walk();
        animal1.run();
        System.out.println();

        animal2.printInfo();
        animal2.eat();
        animal2.walk();
        animal2.run();
    }
}
