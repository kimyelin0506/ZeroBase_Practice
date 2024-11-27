package me.kimyelin.part02.LinearDS_03.src;// Practice6
// 배열 arr 에서 중복 값을 제거한 새 배열을 만드시오.

// 입출력 예시)
// arr: 1, 5, 3, 2, 2, 3, 1, 4, 1, 2, 3, 5
// 결과: 1, 5, 3, 2, 4

import java.util.Arrays;

public class Practice6 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 2, 3, 1, 4, 1, 2, 3, 5};
        int[] newArr = new int[arr.length];
        boolean isSame = false;
        int idx = 0;

        for(int value : arr){
            isSame = false;
            for(int newVal : newArr){
                if(newVal == value){
                    isSame = true;
                    break;
                }
            }

            if(!isSame){
                newArr[idx] = value;
                idx++;
            }
        }

        for (int i = 0; i < idx; i++) {
            System.out.print(newArr[i]+" ");

        }
    }
}
