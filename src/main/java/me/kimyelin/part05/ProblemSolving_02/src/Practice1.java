package me.kimyelin.part05.ProblemSolving_02.src;

public class Practice1 {

    public static int solution(int[][] maps, int stairLen) {

        return 0;
    }

    public static void main(String[] args) {
        // Test code
        int[][] maps = {{2, 2, 2, 2, 2, 2},
                {2, 2, 3, 3, 3, 3},
                {2, 2, 2, 3, 2, 3},
                {2, 1, 1, 1, 1, 2},
                {2, 1, 1, 3, 3, 1},
                {2, 1, 2, 3, 3, 2}};
        System.out.println(solution(maps, 2));
        System.out.println(solution(maps, 3));
    }
}
