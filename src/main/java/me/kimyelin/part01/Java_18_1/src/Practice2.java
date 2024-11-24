package me.kimyelin.part01.Java_18_1.src;

import java.util.Scanner;

public class Practice2 {
    public static void solution() throws Exception{
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        if(n.charAt(0) >= 'a' && n.charAt(0) <= 'z'){
            System.out.println(n.toUpperCase());
            return;
        }else if(n.charAt(0) >= 'A' && n.charAt(0) <= 'Z'){
            System.out.println(n.toLowerCase());
            return;
        }

        System.out.println(n+"는 영어가 아님");
    }

    public static void solution2() throws Exception{
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);
        int output = 0;

        int step = 'a' - 'A';
        if(input >= 'a' && input <= 'z'){
            output = (int)input-step;
            System.out.println("대문자 변환 = " + (char)output);
        }else if(input >= 'A' && input <= 'Z'){
            output = (int)input+step;
            System.out.println("소문자 변환 = " + (char)output);
        }else{
            System.out.println("영어가 아님2");
        }

    }

    public static void reference() {
        int a = (int)'a';
        System.out.println("a = " + a);
        int z = (int)'z';
        System.out.println("z = " + z);
        int A = (int)'A';
        System.out.println("A = " + A);
        int Z = (int)'Z';
        System.out.println("Z = " + Z);
        int etc = (int)'%';
        System.out.println("etc = " + etc);
    }

    public static void main(String[] args) throws Exception {
        reference();    // 아스키 코드 참고
        solution();
        solution2();
    }
}
