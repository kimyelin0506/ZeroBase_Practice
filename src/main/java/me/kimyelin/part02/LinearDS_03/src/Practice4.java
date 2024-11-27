package me.kimyelin.part02.LinearDS_03.src;// Practice4
// 배열 arr 에서 peek 값 모두 출력

// 입출력 예시)
// arr: 3, 1, 2, 6, 2, 2, 5, 1, 9, 10, 1, 11
// 결과: 3, 6, 5, 10, 11

public class Practice4 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 6, 2, 2, 5, 1, 9, 10, 1, 11};
        for (int i = 0; i < arr.length; i++) {
            int past;
            int cur;
            int next;
            if(i == 0){
                cur = arr[i];
                next = arr[i+1];

                if(cur > next){
                    System.out.print(cur+" ");
                }
            }else if(i < arr.length-2){
                past = arr[i-1];
                cur = arr[i];
                next = arr[i+1];

                if(cur > past && cur > next){
                    System.out.print(cur+" ");
                }
            }else if(i == arr.length-1){
                past = arr[i-1];
                cur = arr[i];

                if(cur > past){
                    System.out.print(cur+" ");
                }
            }
        }
    }

}
