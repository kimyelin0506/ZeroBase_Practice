package me.kimyelin.part01.Java_03_2;// Java 프로그래밍 - 여러가지 연산자_2

public class Main {
    public static void main(String[] args) {

//      1. 비트 논리 연산자
        System.out.println("== 비트 논리 연산자 ==");
//      1-1. AND 연산자 (&)
        int n1 = 5;
        int n2 = 3;
        int res = 0;

        res = n1 & n2;
        System.out.println("res = " + res);
        System.out.println(Integer.toBinaryString(n1));
        //4개로 채울것 -> 남는 자리는 앞에서부터 0으로 채움
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(n1)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(n2)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(res)));

//      1-2. OR 연산자 (|)
        System.out.println("== | ==");
        res = n1 | n2;

        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(n1)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(n2)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(res)));

//      1-3. XOR 연산자 (^)
        System.out.println("== XOR ==");

        res = n1 ^ n2;
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(n1)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(n2)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(res)));

//      1-4. 반전 연산자 (~)
        System.out.println("== ~ ==");

        res = ~n1;
        System.out.println("res = " + res);
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(n1)));
        System.out.printf("%s\n", Integer.toBinaryString(res));

//      2. 비트 이동 연산자
        System.out.println("== 비트 이동 연산자 ==");
//      2-1. << 연산자
        int nA = 3;
        res = nA << 1;
        System.out.println("res = " + res);
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(nA)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(res)));


//      2-2. >> 연산자
        res = nA >> 1;

        System.out.println("res = " + res);
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(nA)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(res)));

//      2-3. >>> 연산자
        nA = -5;
        res = nA >> 1;
        System.out.printf("%s\n", Integer.toBinaryString(nA));
        System.out.printf("%s\n", Integer.toBinaryString(res));

        res = nA >>> 1;

        System.out.printf("%s\n", Integer.toBinaryString(nA));
        System.out.printf("%s\n", Integer.toBinaryString(res));


    }

}
