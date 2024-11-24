package me.kimyelin.assignment.week1;

import java.util.Random;
import java.util.*;
/*
    김예린
*/
public class JavaAssignment_07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("[로또 당첨 프로그램]");
        System.out.println();

        System.out.print("로또 개수를 입력해 주세요.(숫자 1 ~ 10):");
        int cnt = sc.nextInt();

        ArrayList<int[]> myLotto = new ArrayList<>();
        myLotto = setMyLotto(cnt, myLotto);
        showLotto(myLotto);

        System.out.println("[로또 발표]");
        int[] lotto = setLotto();
        showLotto(lotto);

        System.out.println("[내 로또 결과]");
        int[] res = resultFunction(myLotto, lotto);
        showLotto(myLotto, res);
    }

    public static void showLotto(ArrayList<int[]> myLotto){
        for (int i = 0; i < myLotto.size(); i++) {
            char num = (char)(i+(int)'A');
            System.out.print(num+"    ");
            for(int j=0; j<myLotto.get(i).length; j++){
                System.out.printf("%02d", myLotto.get(i)[j]);
                if(j != myLotto.get(i).length-1){
                    System.out.print(",");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void showLotto(int[] lotto){
        System.out.println("    ");
        for(int i=0; i<lotto.length; i++){
            System.out.printf("%02d",lotto[i]);
            if(i != lotto.length-1){
                System.out.print(",");
            }
        }
        System.out.println("\n");
    }

    public static void showLotto(ArrayList<int[]> myLotto, int[] res){
        for (int i = 0; i < myLotto.size(); i++) {
            char num = (char)(i+'A');
            System.out.print(num+"  ");
            for(int j=0; j<myLotto.get(i).length; j++){
                System.out.printf("%02d",myLotto.get(i)[j]);
                if(j != myLotto.get(i).length-1){
                    System.out.print(",");
                }
            }
            System.out.printf(" => %d개 일치\n", res[i]);
        }
        System.out.println();
    }

    public static int[] resultFunction(ArrayList<int[]> myLotto, int[] lotto){
        int[] res = new int[myLotto.size()];

        for (int i = 0; i < myLotto.size(); i++) {
            for(int myValue : myLotto.get(i)){
                for(int value : lotto){
                    if(myValue == value){
                        res[i] += 1;
                    }
                }
            }
        }

        return res;
    }

    public static ArrayList<int[]> setMyLotto(int cnt, ArrayList<int[]> myLotto){
        if(cnt == 0){
            return myLotto;
        }

        Random random = new Random();
        int[] lotto = new int[6];
        int idx=0;
        while (idx < lotto.length){
            boolean isUnique = true;
            int tmp = random.nextInt(45)+1;
            for(int value : lotto){
                if(tmp == value){
                    isUnique = false;
                    break;
                }
            }
            if(isUnique){
                lotto[idx] = tmp;
                idx++;
            }
        }

        myLotto.add(lotto);
        return setMyLotto(cnt-1, myLotto);
    }

    public static int[] setLotto(){
        int[] lotto = new int[6];
        Random random = new Random();
        int cnt=0;
        while(cnt < lotto.length){
            boolean isUnique = true;
            int tmp = random.nextInt(45)+1;

            for (int value : lotto) {
                if(value == tmp){
                    isUnique = false;
                     break;
                }
            }
            if(isUnique){
                lotto[cnt] = tmp;
                cnt++;
            }
        }
        return lotto;
    }
}
