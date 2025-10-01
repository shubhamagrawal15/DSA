package SinglyLinkedList;

public class SinglyLinkedList {

    private Node head;
    private Node tail;

    private int size;

    public SinglyLinkedList() {
        this.size=0;
    }

    public int getSize(){
        return size;
    }

    public void insert(int value,int index){
        if(index==0){
            insertFirst(value);
            return;
        };
        if(index==size){
            insertLast(value);
            return;
        }
       // finding where to place the element
        Node temp = head;
        for (int i = 1; i < 3; i++) {
            temp=temp.next;
        }

        Node node= new Node(value,temp.next);
        temp.next=node;
        size++;

    }

    public int deleteFirst(){
        int val = head.value;
        if(head==tail){
            head=null;
            tail=null;
        }
        else {
            head=head.next;
        }
        size--;
        return val;

    }

    public Node get(int index){
        Node node=head;
        for (int i = 0; i <index ; i++) {
            node = node.next;

        }
        return node;
    }



    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head; // connect
        head=node;     // change head

        if(tail==null){
            tail= head;
        }
        size=size+1;
    }

    public void  insertLast(int val){
        Node node= new Node(val);
        if(tail==null){
            head=node;
            tail=node;
        }else{
            tail.next=node;  // connect
            tail=node;     // change tail
        }
        size++;
    }

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int value= tail.value;

       tail=secondLast;
       tail.next=null;
       return value;


    }

    public int delete(int index){
        if(index==0){
          return   deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node prev = get(index-1);
        int value= prev.next.value;

        prev.next=prev.next.next;

        return value;
    }


    // find a particular Node that has this value
    public Node find(int value){
        Node temp = head;
        while(temp!=null){
            if(temp.value==value){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }


    private class Node{

        private int value;
        private Node next;


        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
