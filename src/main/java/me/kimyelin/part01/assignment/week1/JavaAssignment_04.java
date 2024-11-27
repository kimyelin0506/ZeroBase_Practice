package me.kimyelin.part01.assignment.week1;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
/*
    김예린
*/
public class JavaAssignment_04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("[주민등록번호 계산]");
        System.out.print("출생년도를 입력해 주세요.(yyyy):");
        int year = sc.nextInt();
        System.out.print("출생월을 입력해 주세요.(mm):");
        int month = sc.nextInt();
        System.out.print("출생일을 입력해 주세요.(dd):");
        int day = sc.nextInt();
        System.out.print("성별을 입력해 주세요.(m/f):");
        String gender = sc.next();

        String residentNumber = residentNumberFunction(year, month, day, gender);
        System.out.println(residentNumber);
    }

    public static String residentNumberFunction(int year,int month,int day,String gender){
        String res;
        String yy = String.valueOf(year).substring(2,4);
        String mm = monthFunction(month);
        String dd = dayFunction(day);
        String gen = gender.equalsIgnoreCase("M") ? "3" : "4";
        String ran = randomNumbers(6);
        res = yy+mm+dd+"-"+ gen+ran;
        return res;
    }
    public static String monthFunction(int mm){
        return mm < 10 ? "0" + mm :String.valueOf(mm);
    }

    public static String dayFunction(int dd){
        return dd < 10 ? "0" + dd : String.valueOf(dd);
    }

    public static String randomNumbers(int n){
        Random random = new Random();
        return String.valueOf(Math.abs(random.nextInt())).substring(0,n+1);
    }
}
