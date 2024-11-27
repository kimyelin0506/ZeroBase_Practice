package me.kimyelin.part02.LinearDS_07.src;// Practice4
// 두 문자열 비교
// 단, #은 backspace 로 바로 이전의 문자를 삭제하는 기능이라고 가정

// 입출력 예시
// 입력: s1 = "tree", s2 = "th#ree"
// 출력: true

// 입력: s1 = "ab#a", s2 = "aab#"
// 출력: true

// 입력: s1 = "wo#w", s2 = "ww#o"
// 출력: false


import java.util.Stack;

public class Practice4 {

    public static boolean stringCompare(String s1, String s2) {
        Stack<String> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();

        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) == '#'){
                stack1.pop();
            }else{
                stack1.push(String.valueOf(s1.charAt(i)));
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            if(s2.charAt(i) == '#'){
                stack2.pop();
            }else{
                stack2.push(String.valueOf(s2.charAt(i)));
            }
        }

        while (!stack1.isEmpty() || !stack2.isEmpty()){
            String n1 = stack1.pop();
            String n2 = stack2.pop();
            if(!n1.equals(n2)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Test code
        String s1 = "tree";
        String s2 = "th#ree";
        System.out.println(stringCompare(s1, s2));

        s1 = "ab#a";
        s2 = "aab#";
        System.out.println(stringCompare(s1, s2));

        s1 = "wo#w";
        s2 = "ww#o";
        System.out.println(stringCompare(s1, s2));
    }
}
