package me.kimyelin.part02.LinearDS_04.src;// Practice3
// 원형 연결 리스트 (Circular Linked List) 구현

class CircularLinkedList {
    NodeBi head;
    NodeBi tail;

    public CircularLinkedList(NodeBi node) {
        this.head = node;
        this.tail = node;
        node.prev = this.head;
    }

    public boolean isEmpty(){
        return this.head == null;
    }
    // 연결 리스트에 데이터 추가
    // before_data 가 null 인 경우, 가장 뒤에 추가
    // before_data 에 값이 있는 경우, 해당 값을 가진 노드 앞에 추가
    public void addData(int data, Integer beforeData){
        if(this.head == null){  //만약 헤드가 없을 때
            NodeBi newNodeBi = new NodeBi(data, null,null);  //헤드에 새로운 데이터 생성
            this.head = newNodeBi;  //헤드는 새로운 노드
            this.tail = newNodeBi;  //꼬리도 새로운 노드
            newNodeBi.next = newNodeBi;  //새로운 노드의 넥스트: 새로운 노드 -> 나자신
            newNodeBi.prev = newNodeBi;  //새로운 노드의 이전: 새로운 노드 -> 나자신
        }else if(beforeData == null){  //이전 데이터가 널로 들어오는 경우 -> 맨 마지막에 넣어줌
            NodeBi newNodeBi = new NodeBi(data, this.head, this.tail);  //새로운 노드는 꼬리에 연결
            this.tail.next = newNodeBi;  //꼬리의 넥스트: 새로운 노드
            this.head.prev = newNodeBi;  //헤드의 이전: 새로운 노드
            this.tail = newNodeBi;  //현재 꼬리: 새로운 노드
        } else{  //beforeData가 있는 경우
            NodeBi cur = this.head;
            NodeBi pre = cur;
            do {
                if(cur.data == beforeData){  //데이터를 찾으면
                    if(cur == this.head){  //헤드일때
                        NodeBi newNodeBi = new NodeBi(data, this.head, this.tail);  //새로운 노드 생성, 이전: 꼬리, 넥스트: 원래 헤드
                        this.tail.next = newNodeBi;  //꼬리의 다음: 새로운 노드
                        this.head.prev = newNodeBi;  //헤드의 이전: 새로운 노드
                        this.head = newNodeBi;  //새 해드: 새로운 노드
                    }else{  //헤드가 아닌 경우
                        NodeBi newNodeBi = new NodeBi(data, cur, pre);  //새로운 노드 생성, 다음: 현재, 이전: 이전
                        pre.next = newNodeBi;  //이전의 다음: 새로운 노드
                        cur.prev = newNodeBi;  //현재의 이전: 새로운 노드
                    }
                    break;
                }
                pre = cur;
                cur = cur.next;
            }while (cur != this.head);
        }
    }

    //  연결 리스트에서 특정 값을 가진 노드 삭제
    public void removeData(int data){
        if(this.isEmpty()){
            System.out.println("List is Empty");
            return;
        }

        NodeBi cur = this.head;
        NodeBi pre = cur;
        while (cur != null){
            if(cur.data == data){
                if(cur == this.head && cur == this.tail){  //데이터가 꼬리이자 헤드일때
                    this.head = null;
                    this.tail = null;
                }else if(cur == this.head){  //데이터가 헤드인 경우
                    cur.next.prev = this.head.prev;  //현재의 다음의 이전(즉, 지금 나의 자리)은 헤드의 이전 노드 == tail
                    this.head = cur.next;  //현재 헤드는 현재의 다음 노드
                    this.tail.next = this.head;  //꼬리의 다음은 새로 바뀐 현재 노드
                }else if(cur == this.tail){  //데이터가 꼬리인 경우
                    pre.next = this.tail.next;  // == this.tail.next
                    this.tail = pre;  //꼬리는 꼬리의 이전으로 바뀜
                    this.head.prev = this.tail;  //헤드의 이전, 즉 꼬리 다시 입력
                }else{  //데이터가 중간에 있는 경우
                    pre.next = cur.next;
                    cur.next.prev = pre;
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
        while (cur.next != this.head){  //원형이므로
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println(cur.data);  //가장 끝노드는 출력이 안되므로
    }
}

public class Practice3 {
    public static void main(String[] args) {
        // Test code
        CircularLinkedList myList = new CircularLinkedList(new NodeBi(1, null, null));
        myList.addData(2, null);
        myList.addData(3, null);
        myList.addData(4, null);
        myList.addData(5, null);
        myList.showData();  // 1 2 3 4 5

        myList.addData(100, 1);
        myList.addData(200, 2);
        myList.addData(300, 3);
        myList.addData(400, 4);
        myList.addData(500, 5);
        myList.showData();  // 100 1 200 2 300 3 400 4 500 5

        myList.removeData(300);
        myList.removeData(100);
        myList.removeData(500);
        myList.removeData(200);
        myList.removeData(400);
        myList.showData();          // 1 2 3 4 5

        myList.removeData(3);
        myList.removeData(1);
        myList.removeData(5);
        myList.removeData(2);
        myList.removeData(4);
        myList.showData();          // List is empty!
    }
}
