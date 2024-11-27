package me.kimyelin.part02.LinearDS_07.src;// Practice2
// 괄호 짝 검사

// 입출력 예시)
// 입력: "("
// 출력: Fail

// 입력: ")"
// 출력: Fail

// 입력: "()"
// 출력: Pass

import java.util.Stack;

public class Practice2 {
    public static void checkParenthesis(String str) {
        int len = str.length();
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < len; i++) {
            String tmp = String.valueOf(str.charAt(i));
            if(tmp.equals("(")){
                stack.push("(");
            }else if(tmp.equals(")")){
                if(stack.isEmpty()){
                    System.out.println("FAIL");
                    return;
                }
                stack.pop();
            }
        }

        if(stack.isEmpty()){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

    }

    public static void main(String[] args) {
        // Test code
        checkParenthesis("(");          // FAIL!
        checkParenthesis(")");          // FAIL!
        checkParenthesis("()");         // PASS!
        checkParenthesis("()()()");     // PASS!
        checkParenthesis("(())()");     // PASS!
        checkParenthesis("(((()))");    // FAIL!
    }
}
