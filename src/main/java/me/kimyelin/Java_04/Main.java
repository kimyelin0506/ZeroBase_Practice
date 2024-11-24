package me.kimyelin.Java_04;// Java 프로그래밍 - 조건문

public class Main {
    public static void main(String[] args) {

//      1. 조건문 - if
        System.out.println("== if ==");
        int waterTemp = 99;

        if(waterTemp >= 100){
            System.out.println("물이 끓음");
        }else{
            System.out.println("물을 끓이는중");
        }

        int score = 90;
        char grade= 0;

        if(score >= 90){
            grade='A';
        }else if( score >= 70){
            grade='B';
        }else{
            grade='F';
        }
        System.out.println("grade = " + grade);

//      2. 조건문 - switch
        System.out.println("== switch ==");
        String fruit = "apple";
        switch(fruit){
            case "apple":
                System.out.println(fruit +"는 5000 ");
                break;
            case "blueberry":
                System.out.println(fruit +"는 50000 ");
                break;
            default:
                System.out.println("해당 과일이 없음");
                break;
        }


//      Q1. number의 값이 홀수인지 짝수인지 판단하는 코드를 작성하세요.
        int num = 5;
        if(num % 2 == 0){
            System.out.println("짝수");
        }else{
            System.out.println("홀수");
        }


//      Q2. 아래 주석은 위의 실습에서 진행한 score에 따라 grade를 출력하는 코드이다.
//        이를 switch 조건문 기반으로 바꿔보세요.
//        int score = 90;
//        char grade = 0;
//        if (score >= 90) {
//            grade = 'A';
//        } else if (score >= 80) {
//            grade = 'B';
//        } else if (score >= 70) {
//            grade = 'C';
//        } else {
//            grade = 'F';
//        }
//        System.out.println("grade = " + grade);
        switch(score / 10){
            case 10:
            case 9:
                grade='A';break;
            case 8:
                grade='B';break;
            case 7:
                grade='C';break;
            default:
                grade='F';break;
        }
        System.out.println("grade = " + grade);
    }
}
