package me.kimyelin.part02.LinearDS_04.src;// 선형 자료구조 - 연결 리스트
// 단순 연결 리스트 (simple ver.) 기본 구조 구현

// 노드
class Node {
    int data;
    Node next;  //다음 노드 가리킴

    Node(){}
    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}

class LinkedList {
    Node head;

    LinkedList(){}
    LinkedList(Node node){
        this.head = node;
    }

    //  연결 리스트 비어있는지 확인
    public boolean isEmpty(){
        return this.head == null;
    }

    //  연결 리스트의 맨 뒤에 데이터 추가
    public void addData(int data){
        if(this.head == null){  // 가장 처음에 노드가 없다면
            this.head = new Node(data, null);
        } else {  // 노드들이 존재하면
            Node cur = this.head;  // 처음부터
            while(cur.next != null){  // 끝까지 순회함
                cur = cur.next;
            }
            cur.next = new Node(data, null);  // 마지막에 노드를 추가함
        }
    }

    //  연결 리스트의 맨 뒤의 데이터 삭제
    public void removeData(){
        if(this.isEmpty()){
            System.out.println("List is Empty");
            return;
        }

        Node cur = this.head;
        Node prev = cur;

        while(cur.next != null){
            prev = cur;
            cur = cur.next;
        }

        if(cur == this.head){  // 헤드인 경우
            this.head = null;
        }else{  // 마지막을 찾은 경우
            prev.next = null;
        }
    }

    //  연결 리스트에서 데이터 찾기
    public void findData(int data){
        if(this.isEmpty()){
            System.out.println("List is Empty");
            return;
        }

        Node cur = this.head;
        while (cur.next != null){  // 처음부터 순회하며
            if(cur.data == data){  // 데이터가 존재하면
                System.out.println("Data Exits");  // 찾았다는 문구 출력
                return;
            }
            cur = cur.next;  //다음으로 넘어감
        }
        System.out.println("Data not found");  // 못 찾은 경우 문구 출력
    }

    //  연결 리스트의 모든 데이터 출력
    public void showData(){
        if(this.isEmpty()){
            System.out.println("List is Empty");
            return;
        }

        Node cur = this.head;
        while(cur != null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }

}


public class Main {

    public static void main(String[] args) {

//      Test Code
        LinkedList myList = new LinkedList(new Node(1, null));
        myList.showData();      // 1

        myList.addData(2);
        myList.addData(3);
        myList.addData(4);
        myList.addData(5);
        myList.showData();      // 1 2 3 4 5

        myList.findData(3);     // Data exist!
        myList.findData(100);   // Data not found!

        myList.removeData();
        myList.removeData();
        myList.removeData();
        myList.showData();      // 1 2

        myList.removeData();
        myList.removeData();
        myList.removeData();    // List is empty

    }

}
