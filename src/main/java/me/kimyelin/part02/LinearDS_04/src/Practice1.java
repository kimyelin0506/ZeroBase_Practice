package me.kimyelin.part02.LinearDS_04.src;// Practice1
// 단순 연결 리스트 구현 완성

class LinkedList2 extends LinkedList{
    LinkedList2(Node node){
        this.head = node;
    }

    //연결리스트에 데이터 추가
    // beforeData가 null인 경우, 가장 뒤에 추가
    // beforeData에 값이 있는 경우. 해당 값을 가진 노드 앞에 추가
    public void addData(int data, Integer beforeData){
        if(this.head == null){
            this.head = new Node(data, null);
        }else if(beforeData == null){
            Node cur = this.head;
            while (cur.next != null){
                cur = cur.next;
            }
            cur.next = new Node(data, null);
        }else{
            Node cur = this.head;
            Node prev = cur;  // cur을 쫓아다니는 prev
            while(cur != null){  // cur을 이동시킴
                if(cur.data == beforeData){  // 같은 경우 앞에 추가
                    if(cur == this.head){  // 헤드에 같은 데이터가 존재하면
                        this.head = new Node(data, this.head);  //헤드는 새로운 데이터, 새로운 헤드는 이전 헤드를 넥스트로 가짐
                    }else{  // 헤드가 아닌 경우에 데이터가 존재하면
                        // prev는 cur의 앞이므로 prev의 넥스트에 값이 추가됨,
                        // 넥스트에 노드는 다음 노드로 현재 노드를 가리킴
                        prev.next = new Node(data, cur);
                    }
                    break;
                }
                cur = cur.next;
            }
        }
    }

    // 데이터 지우기
    public void removeData(int data){
        if(this.isEmpty()){
            System.out.println("List is Empty");
            return;
        }

        Node cur = this.head;
        Node pre = cur;

        while(cur != null){
            if(cur.data == data){  // 데이터를 찾으면
                if(cur == this.head){  // 만약 데이터가 헤드라면
                    this.head = cur.next;  //헤드는 다음 노드가 되고
                }else{  // 아닌 경우
                    pre.next = cur.next;  // 이전의 노드의 다음은 현재의 노드의 다음을 가리키면서 가운데에 있는 노드를 삭제함
                }
                break;
            }
            pre = cur;
            cur = cur.next;
        }
    }
}

public class Practice1 {
    public static void main(String[] args) {

//      Test code
        LinkedList2 myList = new LinkedList2(new Node(1, null));
        myList.showData();         // 1

        myList.addData(2);
        myList.addData(3);
        myList.addData(4);
        myList.addData(5);
        myList.showData();         // 1 2 3 4 5

        myList.addData(100, 1);
        myList.addData(200, 2);
        myList.addData(300, 3);
        myList.addData(400, 4);
        myList.addData(500, 5);
        myList.showData();         // 100 1 200 2 300 3 400 4 500 5

        myList.removeData(300);
        myList.removeData(100);
        myList.removeData(500);
        myList.removeData(200);
        myList.removeData(400);
        myList.showData();         // 1 2 3 4 5

        myList.removeData(3);
        myList.removeData(1);
        myList.removeData(5);
        myList.removeData(2);
        myList.removeData(4);
        myList.showData();         // List is empty!
    }
}
