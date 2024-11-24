package me.kimyelin.Java_18_3.src;

import java.util.ArrayList;
import java.util.List;

public class Practice1 {
    public static void solution(int[] nums) {
//        List<Integer> ls = new ArrayList<>();
//
//        for(int n : nums){
//            boolean isContains = false;
//            for (Integer l : ls) {
//                if (l == n) {
//                    isContains = true;
//                    break;
//                }
//            }
//
//            if(!isContains){
//                ls.add(n);
//            }
//        }
//
//        System.out.println(ls);

        int cur = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if(cur == nums[i]){
                continue;
            }
            System.out.print(cur + " ");
            cur = nums[i];
        }
        System.out.print(cur);
        System.out.println();
    }

    public static void main(String[] args) {
        // Test code
        solution(new int[] {1, 1, 2});
        solution(new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
    }
}
