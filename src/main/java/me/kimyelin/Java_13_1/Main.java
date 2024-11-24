package me.kimyelin.Java_13_1;// Java 프로그래밍 - 입출력_1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void referInputStream() throws IOException {
//      System.in
        System.out.println("== System.in ==");
//        System.out.print("입력: ");
//        int a = System.in.read() - '0'; // 아스키코드만큼 빼서 숫자로 변환하는 부분
//        System.out.println("a = " + a);
//        // 데이터를 하나만 가져오기 때문에 뒤에 엔터 키 하나가 남음 -> 없애줘야함
//        System.in.read(new byte[System.in.available()]);  // 입력에 남아있는 수만큼 바이트로 가져와 소진시켜줌

//      InputStreamReader
        System.out.println("== InputStreamReader ==");
//        InputStreamReader reader = new InputStreamReader(System.in);
//        char[] c = new char[3];
//        System.out.print("입력: ");
//        reader.read(c);  //배열에다가 읽은 입력값을 넣어줌
//        System.out.println(c);

//      BufferedReader
        System.out.println("== BufferedReader ==");  //배열을 지정해주지 않아도 알아서 읽음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("입력: ");
        String s1 = br.readLine();
        System.out.println("s1 = " + s1);
    }

    public static void main(String[] args) throws IOException {

//      1. 입력
//      1-1. 다른 입력 방식 참고
//        referInputStream();

//      1-2. Scanner
        System.out.println("== Scanner ==");
        Scanner sc = new Scanner(System.in);
//        System.out.print("입력: ");
//        System.out.println(sc.next());
//        sc.nextLine();

//        System.out.print("입력2: ");
//        System.out.println(sc.nextInt());
//        sc.nextLine();

//        System.out.print("입력3: ");
//        System.out.println(sc.nextLine());

//      참고) 정수, 문자열 변환
        int num = Integer.parseInt("123456");  // 문자열 -> 정수
        String str = Integer.toString(num);
        String a = String.valueOf(num);
        
//      2. 출력
        System.out.println("== 출력 ==");
        System.out.println("Hello");
        System.out.println("Hello!");

        System.out.print("hello ");
        System.out.print("world\n");

        System.out.printf("hello ");
        System.out.printf("hello!\n");

        String s = "JAVA";
        int n = 3;
        System.out.println(s + "는 언어 선호도 "+n+"위 입니다.");
        System.out.printf("%s는 언어 선호도 %d위 입니다\n", s, n);

        System.out.printf("%d\n", 10);  //10진수
        System.out.printf("%o\n", 10);  //8진수
        System.out.printf("%x\n", 10);  //16진수

        System.out.printf("%f\n", 4.1f);
        System.out.printf("%d\n", (int)'A');
        System.out.printf("%c\n", 'A');  //문자값
        System.out.printf("%s\n", "AA");  //문자열

        System.out.printf("%5d\n", 123);
        System.out.printf("%5d\n", 1234);
        System.out.printf("%5d\n", 12345);

        System.out.printf("%-5d\n", 123);
        System.out.printf("%-5d\n", 1234);
        System.out.printf("%-5d\n", 12345);

        System.out.printf("%.2f", 1.2133434f);  //반올림 출력

    }
}
