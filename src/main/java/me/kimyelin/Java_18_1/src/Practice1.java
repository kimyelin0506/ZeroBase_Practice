package me.kimyelin.Java_18_1.src;

import java.util.stream.Stream;

public class Practice1 {
    public static void solution(int num) {
        if(num < 0){
            String tmp = String.valueOf(Math.abs(num));
            StringBuilder res = new StringBuilder();
            for (int i = tmp.length(); i > 0; i--) {
                res.append(tmp.charAt(i - 1));
            }
            System.out.println("-"+res);
        }else if(num > 0){
            String tmp = String.valueOf(num);
            StringBuilder res = new StringBuilder();
            for (int i = tmp.length(); i > 0; i--) {
                if(tmp.charAt(i-1) == '0'){
                    continue;
                }
                res.append(tmp.charAt(i-1));
            }

            System.out.println(res);
        }else{
            System.out.println(num);
        }


    }

    public static void solution2(int n){
        int numReverse = 0;
        boolean isMinus = false;

        if(n < 0){
            isMinus = true;
            n *= -1;
        }

        while(n > 0){
            int r = n % 10;  //마지막 자릿수 구하기
            n /= 10;  //셋팅
            numReverse = numReverse*10+r;  //끝(왼)자리에 넣기
        }
        System.out.println(isMinus ? numReverse*-1 : numReverse);
    }

    public static void main(String[] args) {
        // Test code
        solution(12345);
        solution(-12345);
        solution(100);
        solution(0);
        System.out.println();

        solution2(12345);
        solution2(-12345);
        solution2(100);
        solution2(0);
    }
}
