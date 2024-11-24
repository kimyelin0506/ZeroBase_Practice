package me.kimyelin.Java_15;// Practice
// 로또 번호 만들기

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class Practice {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        for (int i = 0; set.size() < 6; i++) {
            int n = (int)(Math.random()*45)+1;  //Math.random() -> 0~9
            set.add(n);
        }

        LinkedList ls = new LinkedList(set);
        Collections.sort(ls);
        System.out.println("로또 번호 :"+ ls);


    }
}
