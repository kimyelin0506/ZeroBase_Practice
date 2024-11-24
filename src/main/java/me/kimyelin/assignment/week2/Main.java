package me.kimyelin.assignment.week2;

import java.util.LinkedList;
import java.util.Queue;
class Stack{
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();
    void push(int x){
        queue1.offer(x);
    }

    int pop(){
        if(queue1.size() == 0){
            System.out.println("Queue is empty");
            return -1;
        }

        while(queue1.size() > 1){
            queue2.offer(queue1.poll());
        }
        int res = queue1.poll();
        while (queue2.size() > 0){
            queue1.offer(queue2.poll());
        }
        return res;
    }

    int count(){
        return queue1.size();
    }
}
public class Main {
    public static void main(String[] args){
       Stack stack = new Stack();
       stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println("count:"+stack.count());
        System.out.println(stack.pop());

        stack.push(100);
        stack.push(200);
        stack.push(300);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
