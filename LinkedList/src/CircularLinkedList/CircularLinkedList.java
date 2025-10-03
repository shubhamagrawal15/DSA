package CircularLinkedList;

public class CircularLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public int getSize() {
        return size;
    }
    public CircularLinkedList(){
        this.head=null;
        this.tail=null;
    }

    public void insertAfterTail(int value){
        Node node = new Node(value);
        if(head==null){
            head=node;
            tail=node;
            node.next=head;  // self loop
        }else{
            node.next=head;
            tail.next=node;
            tail=node;
        }
        size++;
    }

    // delete a particular value
    public void delete(int value){
        Node temp = head;
        if(temp==null){
            return;
        }
        if(temp.value==value){
            head=head.next;
            tail.next=head;
            return;
        }
        do{
            Node n = temp.next;
            if(n.value==value){
                temp.next=n.next;
                break;
            }
            temp=temp.next;
        }while (temp!=head);
    }

    public void display(){
        Node temp=head;
        if(head!=null){
            do{
                System.out.print(temp.value+"->");
                temp=temp.next;
            }while (temp!=head);
        }
        System.out.println("HEAD");

    }




    private class Node{

        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }

        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
}
