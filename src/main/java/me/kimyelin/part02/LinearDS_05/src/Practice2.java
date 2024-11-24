package me.kimyelin.part02.LinearDS_05.src;// Practice2
// Palindrome 연결 리스트
// 추가 자료구조 없이 연결 리스트만으로 풀어보기
// Palindrome: 앞으로 읽어도 뒤로 읽어도 같은 문자열

// 입력 예시)
// 입력 연결 리스트: 1, 3, 5, 3, 1
// 결과: true

// 입력 연결 리스트: 3, 5, 5, 3
// 결과: true

// 입력 연결 리스트: 1, 3, 5, 1
// 결과: false


import me.kimyelin.part02.Practice.LinearDS_12.src.LinkedList;

public class Practice2 {
    public static boolean checkPalindrome(me.kimyelin.part02.Practice.LinearDS_12.src.LinkedList list) {
        return false;
    }

    public static void main(String[] args) {
        // Test code
        me.kimyelin.part02.Practice.LinearDS_12.src.LinkedList linkedList = new me.kimyelin.part02.Practice.LinearDS_12.src.LinkedList();
        linkedList.addData(1);
        linkedList.addData(3);
        linkedList.addData(5);
        linkedList.addData(3);
        linkedList.addData(1);
        System.out.println(checkPalindrome(linkedList));

        me.kimyelin.part02.Practice.LinearDS_12.src.LinkedList linkedList2 = new me.kimyelin.part02.Practice.LinearDS_12.src.LinkedList();
        linkedList2.addData(3);
        linkedList2.addData(5);
        linkedList2.addData(5);
        linkedList2.addData(3);
        System.out.println(checkPalindrome(linkedList2));

        me.kimyelin.part02.Practice.LinearDS_12.src.LinkedList linkedList3 = new me.kimyelin.part02.Practice.LinearDS_12.src.LinkedList();
        linkedList3.addData(1);
        linkedList3.addData(3);
        linkedList3.addData(5);
        linkedList3.addData(1);
        System.out.println(checkPalindrome(linkedList3));

    }
}
