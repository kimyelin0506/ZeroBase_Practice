package me.kimyelin.part01.Java_03_1;// Java 프로그래밍 - 여러가지 연산자_1

public class Main {
    public static void main(String[] args) {

//      1. 대입 연산, 부호 연산자
        int num = 100;
        num = +10;
        num = 10;
        num = -10;

//      2. 산술 연산자, 증가/감소 연산자
        System.out.println("== 산술 연산자, 증가/감소 연산자 ==");
        int numX = 10;
        int numY = 3;
        int res = 0;
        res = numX + numY;
        res = numX - numY;
        res = numX * numY;
        res = numX / numY;
        res = numX % numY;
        System.out.println("res = " + res);

        int num2 = 1;
        System.out.println(num2++);
        System.out.println(num2);

        num2 = 1;
        System.out.println(++num2);
        System.out.println(num2);

        System.out.println("=====");

        num2 = 1;
        System.out.println(num2--);
        System.out.println(num2);

        num2 = 1;
        System.out.println(--num2);
        System.out.println(num2);

//      3. 관계 연산자
        System.out.println("== 관계 연산자 ==");
        int numA = 10;
        int numB = 9;
        System.out.println(numA > numB);
        System.out.println(numA < numB);
        System.out.println(numA == numB);
        System.out.println(numA != numB);

//      4. 논리 연산자
        System.out.println("== 논리 연산자 ==");
        System.out.println(10 > 9 && 1 == 0);
        System.out.println(10 > 9 || 1 == 0);

//      5. 복합 대입 연산자
        System.out.println("== 복합 대입 연산자 ==");
        int n1 = 10;
        int n2 = 5;
        n1 += n2;
        System.out.println("n1 = " + n1);

        n1 -= n2;
        n1 *= n2;

//      6. 삼항 연산자
        System.out.println("== 삼항 연산자 ==");
        int a = 100;
        String aRes = (a==100) ? "yes" : "no";
        System.out.println("aRes = " + aRes);

    }

}
