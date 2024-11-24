package me.kimyelin.assignment.week1;

import java.util.Scanner;
/*
    김예린
*/
public class JavaAssignment_02 {
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.println("[캐시백 계산]");
        System.out.print("결제 금액을 입력해주세요.(금액):");
        int money = sc.nextInt();
        int cashBack = cashbackFunction(money);
        System.out.printf("결제 금액은 %d원이고, 캐시백은 %d원 입니다.",money,cashBack);
    }

    public static int cashbackFunction(int m){
        int cash = (int)Math.round(m*0.1);
        if(cash >= 300){
            return 300;
        }else if(cash >= 200){
            return 200;
        }else if(cash >= 100){
            return 100;
        }else{
            return 0;
        }
    }
}
