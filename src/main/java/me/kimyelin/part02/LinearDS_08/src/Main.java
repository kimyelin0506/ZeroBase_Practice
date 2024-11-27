package me.kimyelin.part02.LinearDS_08.src;// 선형 자료구조 - 큐


import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new LinkedList();  // Queue가 인터페이스로 구현되어 있음 -> 바로 객체를 사용하지 못하기 때문에 LinkedList를 상속받아 구현되어 있기 때문에 이렇게 사용

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println("queue = " + queue);

        System.out.println(queue.poll());
        System.out.println("queue = " + queue);

        System.out.println(queue.poll());
        System.out.println("queue = " + queue);

        System.out.println(queue.peek());
        System.out.println("queue = " + queue);

        System.out.println(queue.contains(3));
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());

        queue.clear();
        System.out.println("queue = " + queue);
        System.out.println(queue.poll());  //stack은 예외 발생, queue는 null 리턴

    }
}
