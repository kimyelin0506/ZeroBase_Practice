package me.kimyelin.Java_18_2;

import java.util.*;
import java.util.stream.Stream;

public class Practice2 {

    public static String solution(int num){
        if(num <= 0){
            System.out.println("숫자 1부터 변환 가능합니다");
            return Integer.toString(num);
        }
        String result = "";
        Rome[] romes = Rome.values();
        HashMap<String, Integer> map = new HashMap<>();
        map.put(String.valueOf('I'),1);
        map.put("IV",4);
        map.put(String.valueOf('V'),5);
        map.put("IX",9);
        map.put(String.valueOf('X'),10);
        map.put("XL",50);
        map.put(String.valueOf('L'),50);
        map.put("XC",90);
        map.put(String.valueOf('C'),100);
        map.put("CD",400);
        map.put(String.valueOf('D'),500);
        map.put("CM",900);
        map.put(String.valueOf('M'),1000);

        List<Map.Entry<String, Integer>> ls = new LinkedList<>(map.entrySet());
        ls.sort((o1, o2)-> map.get(o2.getKey()) - map.get(o1.getKey()));

        while(num > 0){
            for(Map.Entry<String, Integer> m : ls){
                if(num >= m.getValue()){
                    result += m.getKey();
                    num -= m.getValue();
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Test code
        System.out.println(solution(3));
        System.out.println(solution(4));
        System.out.println(solution(6));
        System.out.println(solution(13));
        System.out.println(solution(26));
        System.out.println(solution(1994));
    }
    public enum Rome{
        I("I",1),
        V("V",5),
        X("X",10),
        L("L",50),
        C("C",100),
        D("D",500),
        M("M",1000);

        private final String str;
        private final int toInt;
        Rome(String str, int toInt){
            this.str = str;
            this.toInt = toInt;
        }
    }
}
