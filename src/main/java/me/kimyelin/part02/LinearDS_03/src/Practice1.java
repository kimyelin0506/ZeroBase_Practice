package me.kimyelin.part02.LinearDS_03.src;// Practice1
// 배열 arr 의 모든 데이터에 대해서,
// 짝수 데이터들의 평균과 홀수 데이터들의 평균을 출력하세요.

// 입출력 예시)
// 배열 arr: 1, 2, 3, 4, 5, 6, 7, 8, 9
// 결과:
// 짝수 평균: 5.0
// 홀수 평균: 5.0

public class Practice1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum1 = 0;
        int sum2 = 0;
        int cnt1 = 0;
        int cnt2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if(i%2 == 0){
                sum1 += arr[i];
                cnt1++;
            }else{
                sum2 += arr[i];
                cnt2++;
            }
        }

        System.out.println("짝수 평균: "+sum1/(double)cnt1);
        System.out.println("홀수 평균: "+sum2/(double)cnt2);
    }

}
