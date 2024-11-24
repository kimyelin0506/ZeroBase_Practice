package me.kimyelin.part01.assignment.week2;

public class Main2 {
    public static void main(String[] args){
        int sum =0;
        for (int i = 2; i <= 100; i++) {
            int isPrime = 1;

            for (int j = 2; j*j <= i; j++) {
                if(i%j == 0){
                    isPrime = 0;
                    break;
                }
            }
            if(isPrime == 1){
                sum +=i;
            }
        }

        System.out.println(sum);
    }
}
