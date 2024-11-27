package me.kimyelin.part02.LinearDS_07.src;// Practice3
// 후위표기법 연산
// 참고 설명) 전위/중위/후위 표기법

// 입출력 예시)
// 입력: "2 2 +"
// 출력: 4

// 입력: "2 2 -"
// 출력: 0

import java.util.Stack;

public class Practice3 {
    public static double calculate(String string) {
        Stack<Integer> stack = new Stack<>();
        String[] arr = string.split(" ");
        int tmp = 0;

        for (int i = 0; i < arr.length; i++) {
            if((arr[i].toCharArray()[0] >= '0' && arr[i].toCharArray()[0] <= '9')){
                stack.push(Integer.valueOf(arr[i]));
            }else {
                switch (arr[i]){
                    case "+":
                        int n2 = stack.pop();
                        int n1 = stack.pop();

                        tmp = n1+n2;
                        stack.push(tmp);
                        break;
                    case "-":
                        n2 = stack.pop();
                        n1 = stack.pop();

                        tmp = n1-n2;
                        stack.push(tmp);
                        break;
                    case "*":
                        n2 = stack.pop();
                        n1 = stack.pop();

                        tmp = n1*n2;
                        stack.push(tmp);
                        break;
                    case "/":
                        n2 = stack.pop();
                        n1 = stack.pop();

                        tmp = n1/n2;
                        stack.push(tmp);
                        break;
                }
            }
        }

        tmp = stack.pop();
        return tmp;
    }

    public static void main(String[] args) {
        // Test code
        System.out.println(calculate("2 2 +"));    // 4
        System.out.println(calculate("2 2 -"));    // 0
        System.out.println(calculate("2 2 *"));    // 4
        System.out.println(calculate("2 2 /"));    // 1

        System.out.println(calculate("1 1 + 2 * 3 * 2 / 5 -"));    // 1
        System.out.println(calculate("5 2 * 3 - 8 * 4 /"));        // 14

    }
}
