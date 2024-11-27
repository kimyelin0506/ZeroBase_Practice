package me.kimyelin.part02.LinearDS_13.src;// Practice3
// 참고 - Hashtable? HashMap?

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Practice3 {
    public static void main(String[] args) {
        // HashTable
        Hashtable<Integer, Integer> ht = new Hashtable<>();
        ht.put(0, 10);
        System.out.println(ht.get(0));

        //HashMap
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0,10);
        System.out.println(hm.get(0));

        Map<Integer, Integer> map1 = ht;
        Map<Integer, Integer> map2 = hm;
        System.out.println(map1.get(0));
        System.out.println(map2.get(0));

//        ht.put(null, -999);
        System.out.println("ht = " + ht);  //null 키값 불가능

        hm.put(null, -999);
        System.out.println("hm = " + hm.get(null));

        //HashMap vs HashTable
        // 공통 : 둘 다 Map 인터페이스를 구현한 것
        // 차이:
            // Key에 Null 사용 여부
            // HashTable: X
            // HashMap: O

            // Thread-safe
            // HashTable: O (멀티 스레드 환경에서 우수)
            // HashMap: X (싱글 스레드 환경에서 우수)
            // 참고) synchronizeMap, ConcurrentHashMap
    }
}
