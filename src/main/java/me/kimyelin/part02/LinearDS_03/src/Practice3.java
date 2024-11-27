package me.kimyelin.part02.LinearDS_03.src;// Practice3
// 배열 arr 의 데이터 순서를 거꾸로 변경하세요.
// 추가 배열을 사용하지 않고 구현

// 입출력 예시)
// arr: 1, 3, 5, 7, 9
// 결과: 9, 7, 5, 3, 1

import java.util.Arrays;

public class Practice3 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int cur = 0;
        int tmp = 0;
        int len = arr.length;
        for (int i = 0; i < arr.length/2; i++) {
            cur = arr[i];
            tmp = cur;
            arr[i] = arr[len-i-1];
            arr[len-i-1] = tmp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
