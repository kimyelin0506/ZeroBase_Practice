package me.kimyelin.part02.LinearDS_03.src;// Practice7
// 2차원 배열 arr 을 시계방향 90도 회전시킨 결과를 출력하세요.

// 입출력 예시:
// arr:
// 1 2 3 4 5
// 6 7 8 9 10
// 11 12 13 14 15
// 결과:
// 11 6 1
// 12 7 2
// 13 8 3
// 14 9 4
// 15 10 5


import java.util.Arrays;

public class Practice7 {
    static void printArr(int[][] arr){
        for(int[] itemId : arr){
            for(int item : itemId){
                System.out.print(item+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5},{6, 7, 8, 9, 10},{11, 12, 13, 14, 15}};
        int row = arr.length;
        int col = arr[0].length;
        int[][] newArr = new int[col][row];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int r = arr.length-1-i;
                newArr[j][r] = arr[i][j];
            }
        }
        printArr(arr);
        System.out.println();
        printArr(newArr);

    }
}
