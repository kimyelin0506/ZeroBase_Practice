package me.kimyelin.part01.Java_18_1.src;

public class Practice5 {
    public static int solution(int[] height) {
        int res = 0;
        for(int i=0; i<height.length; i++){
            for (int j = 0; j < height.length; j++) {
                if(i==j){
                    continue;
                }
                int small = Math.min(height[i], height[j]);
                int size = small*(Math.abs(i-j));
                if(size > res){
                    res = size;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        // Test code
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(solution(height));

        height = new int[]{5, 3, 9, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2};
        System.out.println(solution(height));

    }
}
