package me.kimyelin.Java_18_1.src;

import java.util.stream.Stream;

public class Practice4 {
    public static void solution(int n, int type) {
        switch(type){
            case 1:
                type1(n);
                break;
            case 2:
                type2(n);
                break;
            case 3:
                type3(n);
                break;
            case 4:
                type4(n);
                break;
            case 5:
                type5(n);
                break;
            default:
                System.out.println("type이 범위를 벗어남");
        }
    }

    public static void type1(int n) {
        System.out.println("== Type1 ==");

        for (int i = 0; i < n; i++) {
            StringBuilder res = new StringBuilder();
            for (int j = 0; j < n; j++) {
                res.append("*");
            }
            System.out.println(res);
        }
        System.out.println();
    }

    public static void type2(int n) {
        System.out.println("== Type2 ==");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < n; i++) {
            res.append("*");
            System.out.println(res);
        }
        System.out.println();
    }

    public static void type3(int n) {
        System.out.println("== Type3 ==");

        for (int i = 0; i < n; i++) {
            StringBuilder res = new StringBuilder();
            StringBuilder space = new StringBuilder();
            for (int j = n-i; j > 1; j--) {
                space.append(" ");
            }
            res.append(space);
            for (int j = 0; j <= i; j++) {
                res.append("*");
            }
            System.out.println(res);
        }
        System.out.println("-------------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j<n-i-1){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void type4(int n) {
        System.out.println("== Type4 ==");

        for (int i = n; i > 0; i--) {
            StringBuilder star = new StringBuilder();
            StringBuilder res = new StringBuilder();
            StringBuilder space = new StringBuilder();
            for (int j = 0; j < i-1; j++) {
                space.append(" ");
            }
            res.append(space);
            for (int j = 0; j < n*2-i*2+1; j++) {
                star.append("*");
            }
            res.append(star);
            System.out.println(res);
        }
        System.out.println("-------------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i*2+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void type5(int n) {
        System.out.println("== Type5 ==");
        //증가
        for (int i = 0; i < n/2+1; i++) {
            StringBuilder space = new StringBuilder();
            StringBuilder star = new StringBuilder();
            StringBuilder res = new StringBuilder();
            for (int j = 0; j < n/2-i; j++) {
                space.append(" ");
            }
            res.append(space);
            for (int j = 0; j < i*2+1; j++) {
                star.append("*");
            }
            res.append(star);
            System.out.println(res);
        }
        //감소
        for (int i = n/2; i > 0; i--) {
            StringBuilder space = new StringBuilder();
            StringBuilder star = new StringBuilder();
            StringBuilder res = new StringBuilder();
            for (int j = 0; j < n/2-i+1; j++) {
                space.append(" ");
            }
            res.append(space);
            for (int j = i*2-1; j > 0; j--) {
                star.append("*");
            }
            res.append(star);
            System.out.println(res);
        }
        System.out.println("-------------");
        //상단부
        for (int i = 0; i < n/2+1; i++) {
            for (int j = 0; j < n/2-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i*2+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //하단부
        for (int i = n/2; i > 0; i--) {
            for (int j = 0; j < n/2+1-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Test code
        solution(3, 1);
        solution(3, 2);
        solution(3, 3);
        solution(3, 4);
        solution(7, 5);
        solution(3, 5);
        solution(8, 5);
    }
}
