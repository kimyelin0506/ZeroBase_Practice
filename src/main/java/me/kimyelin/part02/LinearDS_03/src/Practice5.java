package me.kimyelin.part02.LinearDS_03.src;// Practice5
// 배열 arr 의 값을 오름차순으로 출력

// 입출력 예시)
// arr: 5, 3, 1, 4, 6, 1
// 결과: 1, 1, 3, 4, 5, 6

import java.util.Arrays;

public class Practice5 {
    public static void main(String[] args) {
        int[] arr = {4,2,5,67,78,45,2,13,5,6,8,76,8,9,45,42};
        int target;
        int idx;

        for (int i = 0; i < arr.length; i++) {
            target = arr[i];
            idx = i;

            for (int j = i; j < arr.length; j++) {
                if(target >= arr[j]){
                    target = arr[j];
                    idx = j;
                }
            }
            int tmp = arr[i];
            arr[i] = target;
            arr[idx] = tmp;
        }
        System.out.println(Arrays.toString(arr));

    }
}
