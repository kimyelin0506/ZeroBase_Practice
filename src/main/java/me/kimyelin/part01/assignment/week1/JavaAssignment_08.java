package me.kimyelin.part01.assignment.week1;

import java.util.*;
/*
    김예린
*/
public class JavaAssignment_08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("[과세금액 계산 프로그램]");
        System.out.print("연소득을 입력해 주세요.:");
        long money = sc.nextLong();
        ArrayList<int[]> resList = new ArrayList<>();

        double tariff = dutyWithTariff(money, resList);
        double progressive = progressiveDeduction(money);

        System.out.printf("[세율에 의한 세금]:        %d\n", Math.round(tariff));
        System.out.printf("[누진공제 계산에 의한 세금]: %d", Math.round(progressive));
    }

    public static double dutyWithTariff(long money, ArrayList<int[]> list){
        if(money < 0){
            int res = 0;
            for (int i = list.size()-1; i > -1; i--) {
                System.out.printf("%10d * %2d%% = %10d\n", list.get(i)[0],list.get(i)[1],list.get(i)[2]);
            }
            System.out.println();
            for (int[] ints : list) {
                res += ints[2];
            }
            return res;
        }
        int[] arr = new int[3];
        double res=0;

        if(money <= table.STANDARD_1.standard){
            res = money*table.STANDARD_1.percent;
            arr[0] = (int)money;
            arr[1] = (int)Math.round(table.STANDARD_1.percent*100);
            arr[2] = (int)Math.round(res);
            list.add(arr);

            return dutyWithTariff(-1, list);
        }else if(money <= table.STANDARD_2.standard){
            res = (money-table.STANDARD_1.standard)*table.STANDARD_2.percent;
            arr[0] = (int)money;
            arr[1] = (int)Math.round(table.STANDARD_2.percent*100);
            arr[2] = (int)Math.round(res);
            list.add(arr);

            return dutyWithTariff(table.STANDARD_1.standard, list);
        }else if(money <= table.STANDARD_3.standard){
            res = (money-table.STANDARD_2.standard)*table.STANDARD_3.percent;
            arr[0] = (int)money;
            arr[1] = (int)Math.round(table.STANDARD_3.percent*100);
            arr[2] = (int)Math.round(res);
            list.add(arr);

            return dutyWithTariff(table.STANDARD_2.standard, list);
        }else if(money <= table.STANDARD_4.standard){
            res = (money-table.STANDARD_3.standard)*table.STANDARD_4.percent;
            arr[0] = (int)money;
            arr[1] = (int)Math.round(table.STANDARD_4.percent*100);
            arr[2] = (int)Math.round(res);
            list.add(arr);

            return dutyWithTariff(table.STANDARD_3.standard, list);
        }else if(money <= table.STANDARD_5.standard){
            res = (money-table.STANDARD_4.standard)*table.STANDARD_5.percent;
            arr[0] = (int)money;
            arr[1] = (int)Math.round(table.STANDARD_5.percent*100);
            arr[2] = (int)Math.round(res);
            list.add(arr);

            return dutyWithTariff(table.STANDARD_4.standard, list);
        }else if(money <= table.STANDARD_6.standard){
            res = (money-table.STANDARD_5.standard)*table.STANDARD_6.percent;
            arr[0] = (int)money;
            arr[1] = (int)Math.round(table.STANDARD_6.percent*100);
            arr[2] = (int)Math.round(res);
            list.add(arr);

            return dutyWithTariff(table.STANDARD_5.standard, list);
        }else if(money <= table.STANDARD_7.standard){
            res = (money-table.STANDARD_6.standard)*table.STANDARD_7.percent;
            arr[0] = (int)money;
            arr[1] = (int)Math.round(table.STANDARD_7.percent*100);
            arr[2] = (int)Math.round(res);
            list.add(arr);

            return dutyWithTariff(table.STANDARD_6.standard, list);
        }else{
            res = (money-table.STANDARD_7.standard)*table.STANDARD_8.percent;
            arr[0] = (int)money;
            arr[1] = (int)Math.round(table.STANDARD_8.percent*100);
            arr[2] = (int)Math.round(res);
            list.add(arr);

            return dutyWithTariff(table.STANDARD_7.standard, list);
        }
    }
    public static double progressiveDeduction(long money){
        double res = 0;
        if(money <= table.STANDARD_1.standard){
            res = money*table.STANDARD_1.percent - table.STANDARD_1.progress;
        }else if(money <= table.STANDARD_2.standard){
            res = money*table.STANDARD_2.percent - table.STANDARD_2.progress;
        }else if(money <= table.STANDARD_3.standard){
            res = money*table.STANDARD_3.percent - table.STANDARD_3.progress;
        }else if(money <= table.STANDARD_4.standard){
            res = money*table.STANDARD_4.percent - table.STANDARD_4.progress;
        }else if(money <= table.STANDARD_5.standard){
            res = money*table.STANDARD_5.percent - table.STANDARD_5.progress;
        }else if(money <= table.STANDARD_6.standard){
            res = money*table.STANDARD_6.percent - table.STANDARD_6.progress;
        }else if(money <= table.STANDARD_7.standard){
            res = money*table.STANDARD_7.percent - table.STANDARD_7.progress;
        }else{
            res = money*table.STANDARD_8.percent - table.STANDARD_8.progress;
        }
        return res;
    }
}
enum table{
    STANDARD_1(0.06, 12000000, 0),
    STANDARD_2(0.15, 46000000, 1080000),
    STANDARD_3(0.24, 88000000, 5220000),
    STANDARD_4(0.35, 150000000, 14900000),
    STANDARD_5(0.38, 300000000, 19400000),
    STANDARD_6(0.40, 500000000, 25400000),
    STANDARD_7(0.42, 1000000000, 35400000),
    STANDARD_8(0.45, 1000000000, 65400000);

    final double percent;
    final int standard;
    final int progress;
    table(double percent, int standard, int progressive) {
        this.percent = percent;
        this.standard = standard;
        this.progress = progressive;
    }
}
