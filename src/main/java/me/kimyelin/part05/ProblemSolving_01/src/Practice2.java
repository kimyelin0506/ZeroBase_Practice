package me.kimyelin.part05.ProblemSolving_01.src;

public class Practice2 {
    public static int solution(int n, int[] days, int[] prices) {

        return 0;
    }

    public static int solution2(int n, int[] days, int[] prices) {

        return 0;
    }

    public static void main(String[] args) {
        // Test code
        int[] days = {2, 1, 3, 2, 2};
        int[] prices = {10, 20, 30, 40, 60};
        System.out.println(solution(5, days, prices));
        System.out.println(solution2(5, days, prices));

        System.out.println();
        days = new int[]{3, 3, 3, 1, 2, 3, 2, 2};
        prices = new int[]{50, 150, 20, 30, 10, 10, 30, 30};
        System.out.println(solution(8, days, prices));
        System.out.println(solution2(8, days, prices));
    }
}
