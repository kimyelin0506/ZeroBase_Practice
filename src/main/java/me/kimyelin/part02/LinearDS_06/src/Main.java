package me.kimyelin.part02.LinearDS_06.src;// 선형 자료구조 - 스택

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // 자바 제공
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("stack = " + stack);

        System.out.println(stack.pop());
        System.out.println("stack = " + stack);

        System.out.println(stack.pop());
        System.out.println("stack = " + stack);

        System.out.println(stack.peek());  // 반환하지만 삭제하지 않음
        System.out.println("stack = " + stack);

        System.out.println(stack.contains(1));
        System.out.println(stack.size());
        System.out.println(stack.empty());

        stack.clear();
        System.out.println("stack = " + stack);

        stack.pop();  //EmptyStackException
    }
}
