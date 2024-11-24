package me.kimyelin.Java_18_3.src;

import java.util.ArrayList;

public class Practice4 {
    public static ArrayList<Integer> solution(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int rowIdx = 0;
        int colIdx = 0;
        boolean[][] isThrow = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = colIdx; j < col; j++) {
                if(!isThrow[i][j]){
                    isThrow[i][j] = true;
                    System.out.print(matrix[i][j]+" ");
                    rowIdx = i;
                    colIdx = j;
                }
            }
            if(isThrow[rowIdx][colIdx]){
                for (int j = rowIdx; j < row; j++) {
                    if(!isThrow[j][colIdx]){
                        isThrow[j][colIdx] = true;
                        System.out.print(matrix[j][colIdx]+" ");
                        rowIdx = j;
                    }
                }
            }
            if(isThrow[rowIdx][colIdx]){
                for (int j = colIdx; j >= 0; j--) {
                    if(!isThrow[rowIdx][j]){
                        isThrow[rowIdx][j] = true;
                        System.out.print(matrix[rowIdx][j]+" ");
                        colIdx = j;
                    }
                }
            }
            if(isThrow[rowIdx][colIdx]){
                for (int j = rowIdx; j >= 0; j--) {
                    if(!isThrow[j][colIdx]){
                        isThrow[j][colIdx] = true;
                        System.out.print(matrix[j][colIdx]+" ");
                        rowIdx = j;
                    }
                }
            }

        }

        System.out.println();
        return null;
    }
    
    public static void main(String[] args) {
        // Test code
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println((solution(matrix)));

        matrix = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10 ,11 ,12}};
        System.out.println((solution(matrix)));
    }
}
