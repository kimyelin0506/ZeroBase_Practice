package me.kimyelin.Java_06;// Java 프로그래밍 - 다차원 배열

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        
        // 1. 일차원 배열
        System.out.println("== 일차원 배열 ==");
        int[] arr = {1,2,3};
        System.out.println("arr[1] = " + arr[1]);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        for (int i: arr){
            System.out.print(i);
        }
        System.out.println();

        // 2. 이차원 배열
        System.out.println("== 이차원 배열 ==");
        int[][] arr2 = {IntStream.range(1,4).toArray(), IntStream.range(4,7).toArray()};
        System.out.println("arr2[1][2] = " + arr2[1][2]);

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        for(int[] i : arr2){
            for(int j : i){
                System.out.print(j);
            }
            System.out.println();
        }


//      Q1. 아래와 같이 3x3 행렬이 2차원 배열로 초기화 되어있다.
//          모든 원소를 1로 변경하고, 대각 원소는 10으로 변경하시오.
        int [][] testArray1 = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        for (int i = 0; i < testArray1.length; i++) {
            for (int j = 0; j < testArray1[i].length; j++) {
                 testArray1[i][j] = 1;
                 if(i == j){
                    testArray1[i][j] = 10;
                }
            }
        }

        for(int[] i : testArray1){
            for(int j : i){
                System.out.print(j+" ");
            }
            System.out.println();
        }


    }
}
