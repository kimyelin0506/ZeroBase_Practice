package me.kimyelin.part05.ProblemSolving_01.src;

public class Practice3 {
    public static int solution(int[][] roads) {

        return 0;
    }

    public static void main(String[] args) {
        // Test code
        int[][] roads = {{0, 0, 0},
                         {1, 2, 0},
                         {0, 0, 0}};
        System.out.println(solution(roads));

        roads = new int[][]{{2, 0, 0, 0, 1, 1, 0},
                            {0, 0, 1, 0, 1, 0, 0},
                            {0, 1, 1, 0, 1, 0, 0},
                            {0, 1, 0, 1, 1, 0, 0},
                            {0, 0, 0, 0, 0, 1, 1},
                            {0, 0, 0, 0, 0, 0, 0},
                            {0, 0, 0, 0, 1, 2, 0}};
        System.out.println(solution(roads));
    }
}
