package me.kimyelin.part01.Java_02_2;// Java 프로그래밍 - 변수와 자료형_2

public class Main {
    public static void main(String[] args) {

//      1. 자료형 - 숫자
        System.out.println("== 숫자 ==");
//      1-1. 정수
        int intNum = 10;
        System.out.println("intNum = "+intNum);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        //최대 값을 넘었을 경우
        int intNum2 = Integer.MAX_VALUE;
        int intNum3 = intNum2+1;

        System.out.println(intNum2);
        System.out.println(intNum3);

        long longNum = (long)Integer.MAX_VALUE+1;
        System.out.println(longNum);

//      1-2. 실수
        float floatNum = 1.23f;
        double doubleNum = 1.23;
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

//      1-3. 2진수 / 8진수 / 16진수
        int numBase2 = 0b1100;
        System.out.println("numBase2 = " + numBase2);
        int numBase8 = 014;
        System.out.println("numBase8 = " + numBase8);
        int numBase15 = 0xC;
        System.out.println("numBase15 = " + numBase15);

        System.out.println("0b"+Integer.toBinaryString(numBase2));
        System.out.println("0"+Integer.toOctalString(numBase8));
        System.out.println("0x"+Integer.toHexString(numBase15));


//      2. 자료형 - 부울
        System.out.println("== 부울 ==");
        boolean isPass = true;
        System.out.println("isPass = " + isPass);
        boolean isOk = false;
        System.out.println("isOk = " + isOk);


//      3. 자료형 - 문자
        System.out.println("== 문자 ==");
        char keyFirst = 'a';
        System.out.println("keyFirst = " + keyFirst);
        char keyLast = 'z';
        System.out.println("keyLast = " + keyLast);
        System.out.println((int)keyFirst);  //아스키코드
    }
}
