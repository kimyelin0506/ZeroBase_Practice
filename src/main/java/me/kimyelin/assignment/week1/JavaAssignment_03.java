package me.kimyelin.assignment.week1;

import java.util.Locale;
import java.util.Scanner;
/*
    김예린
*/
public class JavaAssignment_03 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("[입장권 계산]");
        System.out.print("나이를 입력해 주세요.(숫자):");
        int age = sc.nextInt();
        System.out.print("입장 시간을 입력해 주세요.(숫자 입력):");
        int time = sc.nextInt();
        System.out.print("국가유공자 여부를 입력해 주세요.(y/n):");
        String merit = sc.next();
        System.out.print("복지 카드 여부를 입력해 주세요.(y/n):");
        String card = sc.next();

        int entranceFee = entranceFeeFunction(age, time, merit, card);
        System.out.println("입장료:"+entranceFee);
    }

    public static int entranceFeeFunction(int age,int time,String merit,String card){
        int[] Discount = new int[4];
        Discount[0] = ageFunction(age);
        Discount[1] = timeFunction(time);
        Discount[2] = meritFunction(merit);
        Discount[3] = cardFunction(card);

        int maxDis = Integer.MIN_VALUE;
        for(int dis : Discount){
            if(dis > maxDis){
                maxDis = dis;
            }
        }
        return maxDis;
    }

    public static int ageFunction(int age){
        if(age < 3){
            return 10000;
        }else if(age < 13){
            return 4000;
        }
        return 0;
    }

    public static int timeFunction(int time){
        return time >=17 ? 4000 : 0;
    }

    public static int meritFunction(String merit){
        merit = merit.toUpperCase();
        return merit.equals("Y") ? 8000 : 0;
    }

    public static int cardFunction(String card){
        card = card.toUpperCase();
        return card.equals("Y") ? 8000 : 0;
    }
}
