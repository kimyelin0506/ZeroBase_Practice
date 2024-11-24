package me.kimyelin.Java_02_3;// Java 프로그래밍 - 변수와 자료형_3

import java.util.Locale;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

//      1. 자료형 - 문자열
        System.out.println("== 문자열 ==");
        String s1 = "hello world";
        System.out.println("s1 = " + s1);
        String s2 = "01234";
        System.out.println("s2 = " + s2);

//      1-1. equals
        String s3 = "hi";
        String s4 = "hi";
        System.out.println(s3.equals(s4));
        System.out.println(s3 == s4);
        String s5 = new String("hi");
        System.out.println(s3.equals(s5));  //값을 비교
        System.out.println(s3 == s5);  //객체 비교

//      1-2. indexOf
        String s6 = "hello! world!";
        System.out.println(s6.indexOf("!"));
        System.out.println(s6.indexOf("1", s6.indexOf("!")+1));

//      1-3. replace
        String s7 = s6.replace("hello", "bye");
        System.out.println("s7 = " + s7);

//      1-4. substring
        System.out.println(s7.substring(0, 3));
        System.out.println(s7.substring(0, s7.indexOf("!")+1));

//      1-5. toUpperCase
        System.out.println(s7.toUpperCase());

//      2. 자료형 - StringBuffer
        System.out.println("== StringBuffer ==");
        //빈번하게 데이터가 변경되는 경우 - 기존의 데이터를 변경하기에 메모리와 속도 딜레이 차이가 듬
        StringBuffer sb1 = new StringBuffer();
        sb1.append("01234");
        System.out.println("sb1 = " + sb1);
        sb1.append("56789");
        System.out.println("sb1 = " + sb1);

        String a = "1234";
        String b = "56789";
        String bak = a;
        System.out.println(a==bak);
        a+=b;
        System.out.println(a);
        System.out.println(a==bak);

//      3. 자료형 - 배열
        System.out.println("== 배열 ==");
        int[] myArr1 = IntStream.range(1,6).toArray();
        System.out.println(myArr1[0]);
        System.out.println(myArr1[1]);
        System.out.println(myArr1[2]);
        System.out.println(myArr1[3]);
        System.out.println(myArr1[4]);
        char[] myArr2 = {'a','b','c','d','e'};
        System.out.println(myArr2[2]);

        String[] myArray3 = new String[3];
        myArray3[0]="hello";
        myArray3[1]=" ";
        myArray3[2]="world";
        System.out.println(myArray3[0]+myArray3[1]+myArray3[2]);
    }
}
