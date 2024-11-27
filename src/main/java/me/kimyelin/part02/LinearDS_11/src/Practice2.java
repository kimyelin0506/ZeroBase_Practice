package me.kimyelin.part02.LinearDS_11.src;// Practice1
// Palindrome 찾기
// Palindrome 이면 true, 아니면 false 를 반환하세요.
// Palindrome: 앞으로 읽어도 거꾸로 읽어도 같은 문자열

// 입출력 예시)
// 입력: a
// 결과: true

// 입력: madam
// 결과: true

// 입력: abab
// 결과: false


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.IntStream;

public class Practice2 {
    public static boolean checkPalindrome(String str) {
        int len = str.length();
        Deque<String> deque = new ArrayDeque<>();
        IntStream.range(0,len).forEach(x->deque.addLast(String.valueOf(str.charAt(x))));

        while(!deque.isEmpty()){
            String front;
            String rear;
            if(deque.size() == 1){
                front = deque.peek();
                rear = deque.peek();
                deque.poll();
            }else{
                front = deque.pollFirst();
                rear = deque.pollLast();
            }

            if(!front.equals(rear)){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Test code
        System.out.println(checkPalindrome("a"));       // true
        System.out.println(checkPalindrome("aba"));     // true
        System.out.println(checkPalindrome("abba"));    // true
        System.out.println(checkPalindrome("abab"));    // false
        System.out.println(checkPalindrome("abcba"));   // true
        System.out.println(checkPalindrome("abccba"));  // true
        System.out.println(checkPalindrome("madam"));  // true
    }
}
