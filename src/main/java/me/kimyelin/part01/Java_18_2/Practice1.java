package me.kimyelin.part01.Java_18_2;

import java.util.HashMap;

public class Practice1 {

    public static void solution(String s) {
        Lome[] lome = Lome.values();
        int len = s.length();
        int res = 0;
        int past = 0;
        int cur = 0;

        for (int i = len-1; i >= 0; i--) {
            for(Lome value : lome){
                if(String.valueOf(s.charAt(i)).equals(value.s)){
                    cur = value.toInt;

                    if(cur > past){
                        res += cur;
                    }else if(cur < past){
                        res = Math.abs(res-cur);
                    }else{
                        res += cur;
                    }
                    past = cur;
                    break;
                }
            }
        }

        System.out.println(res);
        System.out.println("-------");
    }

    public static void solution2(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int sum = 0;
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length-1; i++) {
            if(map.get(arr[i]) < map.get(arr[i+1])){
                sum -= map.get(arr[i]);
            }else{
                sum += map.get(arr[i]);
            }
        }
        sum += map.get(arr[arr.length-1]);
        System.out.println(sum);
        System.out.println("-------");
    }

    public enum Lome{
        I("I",1),
        V("V",5),
        X("X",10),
        L("L",50),
        C("C",100),
        D("D",500),
        M("M",1000);

        private final String s;
        private final int toInt;
        Lome(String s, int toInt){
            this.s = s;
            this.toInt = toInt;
        }
    }
    public static void main(String[] args) {
        // Test code
        solution("III");
        solution("IV");
        solution("VI");
        solution("XIII");
        solution("XXVI");
        solution("MCMXCIV");
        System.out.println("=============");

        solution2("III");
        solution2("IV");
        solution2("VI");
        solution2("XIII");
        solution2("XXVI");
        solution2("MCMXCIV");
    }


}
