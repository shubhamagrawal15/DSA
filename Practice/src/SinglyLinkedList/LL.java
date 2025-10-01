package SinglyLinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size=0;
    }

    public int getSize(){
        return size;
    }

    public void insertFirst(int value){
        Node  node  = new Node(value);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size++;
    }

    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next=node;
        tail=node;
        size++;

    }

    public void insert(int value,int index){
        if(index==0){
            insertFirst(value);
            return;
        }
        if(index==size){
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 0; i <index-1 ; i++) {
            temp=temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next=node;
        size++;
    }

    public int deleteFirst(){
        int value=head.value;
        if(head==tail){
            head=null;
            tail=null;
        }else{
            head=head.next;
        }
        size--;
        return value;

    }

    public int deleteLast(){
        int value= tail.value;
        if(head==tail){
            deleteFirst();
            return  value;
        }
        Node temp = head;
        while(temp.next!=tail){
            temp=temp.next;
        }
        tail=temp;
        tail.next=null;
        size--;
        return value;
    }

    public Node get(int index){
        Node temp=head;
        for (int i = 1; i <=index ; i++) {
            temp=temp.next;
        }
        return temp;
    }

    public int DeleteLast(){
        if(size<=1){
            return  deleteFirst();
        }
        Node secondLast = get(size-2);
        int value= tail.value;

        tail=secondLast;
        tail.next=null;
        size--;
        return value;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("end");
    }


    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }
        public Node (int value,Node next){
            this.value=value;
            this.next = next;
        }
    }

}
