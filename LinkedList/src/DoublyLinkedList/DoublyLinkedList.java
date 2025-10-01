package DoublyLinkedList;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList(){
        this.size=0;
    }

    public int getSize(){
        return size;
    }


   public void insertFirst(int value){
        Node node = new Node(value);
        node.next=head;
        node.prev=null;
       if(head!=null){
           head.prev=node;
       }else {
           tail=node;
       }
        head=node;
       size++;
   }

   public  void insertLast(int value){
       Node node = new Node(value);
        if(tail==null){
            head=tail=node;
            node.prev=null;
        }else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
   }

   public void insertLastWithoutHead(int value){
       Node node = new Node(value);
        if(head==null){  // empty list
            head=node;
            node.prev=null;

        }else {
            Node temp = head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
            node.prev=temp;

        }
       node.next=null;
        tail= node;
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

        Node temp=head;
       for (int i = 1; i <=index-1 ; i++) {
           temp=temp.next;
       }
       Node node = new Node(value,temp.next,temp);
       temp.next.prev=node;
       temp.next=node;
       size++;
   }



   public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
       System.out.println("end");
   }
   public void displayReverse(){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.value+"<-");
            temp=temp.prev;
        }
       System.out.println("end");
   }


    private  class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value){
            this.value=value;
        }
        public Node (int value,Node next){
            this.value=value;
            this.next=next;
        }
        public Node(int value,Node next,Node prev){
            this.value=value;
            this.next = next;
            this.prev=prev;
        }

    }
}

