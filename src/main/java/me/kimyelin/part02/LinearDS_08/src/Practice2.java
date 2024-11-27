package me.kimyelin.part02.LinearDS_08.src;// Practice2
// 배열을 이용한 기본 큐 직접 구현 (원형 큐)

class MyQueue2 {
    int[] arr;
    int front = 0;
    int rear = 0;

    MyQueue2(int size) {
        arr = new int[size+1];  //원형큐로 관리하기 위해 size+1로 초기화
    }

    public boolean isEmpty() {
        return this.rear == this.front;  //앞부분과 뒷부분이 같은 경우 비어 있음
    }

    public boolean isFull() {
        // 현재 길이는 원하는 size+1이므로 rear+1에서 size만큼 나눴을 때, 앞부분을 가리킨다면 꽉 차있다는 의미
        return ((this.rear+1) % this.arr.length) == this.front;
    }

    public void enqueue(int data) {
        if(this.isFull()){
            System.out.println("Queue is Full");
            return;
        }

        this.rear = (this.rear + 1) % this.arr.length;  //원형으로 관리하기 위해 나머지 계산
        this.arr[this.rear] = data;
    }

    public Integer dequeue() {
        if(this.isEmpty()){
            System.out.println("Queue is Empty");
            return null;
        }

        this.front = (this.front + 1) % this.arr.length;
        return this.arr[this.front];
    }

    public void printQueue() {
        int start = (this.front + 1) % this.arr.length;
        int end = (this.rear + 1) % this.arr.length;

        for (int i = start; i != end ; i = (i+1)%this.arr.length) {
            System.out.print(this.arr[i]+" ");
        }
        System.out.println();
    }
}

public class Practice2 {
    public static void main(String[] args) {
        // Test code
        MyQueue2 myQueue = new MyQueue2(5);
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);
        myQueue.enqueue(6); // Queue is full!

        myQueue.printQueue();   // 1, 2, 3, 4, 5

        System.out.println(myQueue.dequeue());  // 1
        myQueue.printQueue();   // 2, 3, 4, 5

        System.out.println(myQueue.dequeue());  // 2
        myQueue.printQueue();   // 3, 4, 5

        myQueue.enqueue(6);
        myQueue.enqueue(7);
        myQueue.printQueue();   // 3, 4, 5, 6, 7

        System.out.println(myQueue.dequeue());  // 3
        System.out.println(myQueue.dequeue());  // 4
        System.out.println(myQueue.dequeue());  // 5
        myQueue.printQueue();   // 6, 7
        System.out.println(myQueue.dequeue());  // 6
        System.out.println(myQueue.dequeue());  // 7
        myQueue.dequeue();      // Queue is empty!
    }
}
