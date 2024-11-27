package me.kimyelin.part05.ProblemSolving_02.src;

public class Practice2 {

    public static int solution(int[][] map, int[] startPos) {

        return 0;
    }

    public static int solution2(int[][] map, int[] startPos) {

        return 0;
    }

    public static void main(String[] args) {
        // Test code
        int[][] map = {{1, 1, 1, 1, 1},
                       {1, 0, 0, 0, 1},
                       {1, 0, 0, 0, 1},
                       {1, 0, 0, 0, 1},
                       {1, 1, 1, 1, 1}};
        int[] startPos = {1, 1, 0};
        System.out.println(solution(map, startPos));

        map = new int[][] { {1, 1, 1, 1, 1},
                            {1, 0, 0, 0, 1},
                            {1, 0, 0, 0, 1},
                            {1, 0, 0, 0, 1},
                            {1, 1, 1, 1, 1}};
        System.out.println(solution2(map, startPos));

        System.out.println();
        map = new int[][]{  {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                            {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                            {1, 0, 1, 0, 1, 1, 1, 1, 1, 1},
                            {1, 0, 1, 0, 1, 1, 1, 1, 1, 1},
                            {1, 0, 1, 0, 0, 0, 0, 0, 0, 1},
                            {1, 0, 1, 0, 0, 0, 0, 0, 0, 1},
                            {1, 0, 1, 0, 0, 0, 1, 1, 0, 1},
                            {1, 0, 1, 0, 0, 0, 1, 1, 0, 1},
                            {1, 0, 1, 0, 0, 0, 1, 1, 0, 1},
                            {1, 1, 1, 1, 1, 0, 0, 0, 0, 1},
                            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};
        startPos = new int[]{1, 1, 2};
        System.out.println(solution(map, startPos));

        map = new int[][]{  {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                            {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                            {1, 0, 1, 0, 1, 1, 1, 1, 1, 1},
                            {1, 0, 1, 0, 1, 1, 1, 1, 1, 1},
                            {1, 0, 1, 0, 0, 0, 0, 0, 0, 1},
                            {1, 0, 1, 0, 0, 0, 0, 0, 0, 1},
                            {1, 0, 1, 0, 0, 0, 1, 1, 0, 1},
                            {1, 0, 1, 0, 0, 0, 1, 1, 0, 1},
                            {1, 0, 1, 0, 0, 0, 1, 1, 0, 1},
                            {1, 1, 1, 1, 1, 0, 0, 0, 0, 1},
                            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};
        System.out.println(solution2(map, startPos));
    }
}
