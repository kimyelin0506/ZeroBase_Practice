package me.kimyelin.part02.LinearDS_04.src;// Practice2
// 양방향 연결 리스트 (Doubly Linked List) 구현

class NodeBi {
    int data;
    NodeBi next;
    NodeBi prev;

    public NodeBi(int data, NodeBi next, NodeBi prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}

class DoublyLinkedList extends LinkedList{
    NodeBi head;
    NodeBi tail;

    DoublyLinkedList(NodeBi node){
        this.head = node;
        this.tail = node;
    }

    public boolean isEmpty(){
        return this.head==null;
    }

    public void addData(int data, Integer beforeData){
        if(this.head == null){
            this.head = new NodeBi(data, null, null);
            this.tail = this.head;  // 가장끝을 관리하고 있음
        }else if(beforeData == null){
            this.tail.next = new NodeBi(data, null, this.tail);  //새로운 노드도 이전의 꼬리를 이전으로 가짐
        }else{
            NodeBi cur = this.head;
            NodeBi pre = cur;
            while(cur != null){
                if(cur.data == beforeData){  //데이터가 있음
                    if(cur == this.head){  //헤드에 있다면
                        //헤드는 새로운 노드를 가리킴, 새로운 노드는 넥스트로: 이전 헤드, 이전으로: null을 가짐
                        this.head = new NodeBi(data, this.head, null);
                        this.head.next.prev = this.head;  //헤드의 다음의 이전은 원래 null -> 새로 만들어진 헤드를 가리킴
                    }else{  //헤드가 아닌 경우
                        pre.next = new NodeBi(data, cur, pre);  //이전의 넥스트, 즉 현재 자리에 새로운 노드 추가
                        cur.prev = pre.next;  //현재의 이전은 이전의 넥스트
                    }
                    break;
                }
                pre = cur;
                cur = cur.next;
            }
        }
    }

    public void removeData(int data){
        if(this.isEmpty()){
            System.out.println("List is Empty");
            return;
        }

        NodeBi cur = this.head;
        NodeBi pre = cur;

        while(cur != null){
            if(cur.data == data){// 찾는 데이터가
                if(cur == this.head && cur == this.tail){  // 헤드임과 동시에 마지막일때
                    this.head = null;
                    this.tail = null;
                }else if(cur == this.head){  //헤드일때
                    this.head = cur.next;  //헤드를 현재의 넥스트로 지정
                    this.head.prev = null;  //새로 바뀐 헤드의 이전은 없앰
                }else if(cur == this.tail){  //꼬리일때
                    this.tail = this.tail.prev;  //꼬리의 이전을 꼬리로 지정
                    this.tail.next = null;  //새로 바뀐 꼬리의 넥스트는 없앰
                }else{  //중간에 있을 때
                    pre.next = cur.next;  //이전의 다음은 현재의 다음
                    cur.next.prev = pre;  //현재의 다음의 이전은 이전꺼
                }
                break;
            }
            pre = cur;
            cur = cur.next;
        }
    }

    public void showData(){
        if(this.isEmpty()){
            System.out.println("List is Empty");
            return;
        }

        NodeBi cur = this.head;
        while(cur != null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void showDataFromTail(){
        if(this.isEmpty()){
            System.out.println("List is Empty");
            return;
        }

        NodeBi cur = this.tail;
        while(cur != null){
            System.out.print(cur.data+" ");
            cur = cur.prev;
        }
        System.out.println();
    }
}

public class Practice2 {
    public static void main(String[] args) {

//      Test code
        DoublyLinkedList myList = new DoublyLinkedList(new NodeBi(1, null, null));
        myList.showData();          // 1

        myList.addData(2, null);
        myList.addData(3, null);
        myList.addData(4, null);
        myList.addData(5, null);
        myList.showData();          // 1 2 3 4 5
        myList.showDataFromTail();  // 5 4 3 2 1

        myList.addData(100, 1);
        myList.addData(200, 2);
        myList.addData(300, 3);
        myList.addData(400, 4);
        myList.addData(500, 5);
        myList.showData();          // 100 1 200 2 300 3 400 4 500 5
        myList.showDataFromTail();  // 5 500 4 400 3 300 2 200 1 100

        myList.removeData(300);
        myList.removeData(100);
        myList.removeData(500);
        myList.removeData(200);
        myList.removeData(400);
        myList.showData();          // 1 2 3 4 5
        myList.showDataFromTail();  // 5 4 3 2 1

        myList.removeData(3);
        myList.removeData(1);
        myList.removeData(5);
        myList.removeData(2);
        myList.removeData(4);
        myList.showData();          // List is empty!
        myList.showDataFromTail();  // List is empty!
    }
}
