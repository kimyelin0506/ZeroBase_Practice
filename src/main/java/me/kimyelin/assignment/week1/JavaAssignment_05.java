package me.kimyelin.assignment.week1;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.*;

/*
    김예린

*/
public class JavaAssignment_05 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("[달력 출력 프로그램]");
        System.out.print("달력의 년도를 입력해 주세요.(yyyy):");
        int year = sc.nextInt();
        System.out.print("달력의 월을 입력해 주세요.(mm):");
        int month = sc.nextInt();
        printCalendar(year,month);
    }
    public static void printCalendar(int year, int month) throws ParseException {
        LocalDate now = LocalDate.of(year, month,1);
        LocalDate past = now.minusMonths(1);
        LocalDate next = now.plusMonths(1);
        int[][] cal = new int[5][7];

        getCalender(past, past.getDayOfWeek().toString(), past.lengthOfMonth(), cal);
        getCalender(now, now.getDayOfWeek().toString(), now.lengthOfMonth(), cal);
        getCalender(next, next.getDayOfWeek().toString(), next.lengthOfMonth(), cal);

    }

    public static void getCalender(LocalDate date, String week, int len, int[][] cal){
        int startIdx = getIdxWeek(week);
        int day = 1;

        for (int i = 0; i < cal.length; i++) {

            for (int j = 0; j < cal[i].length; j++) {
                if(i == 0 && j < startIdx){
                    continue;
                }
                cal[i][j] = day++;
                if(len < day){
                    break;
                }
            }
        }

        System.out.printf("[%d년 %02d월]\n", date.getYear(), date.getMonthValue());
        Week[] w = Week.values();
        for(Week value : w){
            System.out.printf("%-2s%-1s",value.korea, "");
        }
        System.out.println();
        for (int i = 0; i < cal.length; i++) {
            for (int j = 0; j < cal[i].length; j++) {
                if(cal[i][j] == 0){
                    System.out.printf("%4s", "");
                }else{
                    System.out.printf("%02d%2s", cal[i][j], "");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int getIdxWeek(String week){
        Week[] weekend = Week.values();
        int tmp = -1;
        for(Week w : weekend){
            tmp++;
            if(w.eng.equals(week)){
                break;
            }
        }
        return tmp;
    }
}
enum Week{
    SUNDAY("SUNDAY","일"),
    MONDAY("MONDAY","월"),
    TUESDAY("TUESDAY","화"),
    WEDNESDAY("WEDNESDAY","수"),
    THURSDAY("THURSDAY","목"),
    FRIDAY("FRIDAY","금"),
    SATURDAY("SATURDAY","토");

    final String eng;
    final String korea;
    Week(String eng, String korea) {
        this.eng = eng;
        this.korea = korea;
    }



}