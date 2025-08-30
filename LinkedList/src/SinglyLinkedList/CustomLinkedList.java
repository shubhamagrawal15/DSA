package SinglyLinkedList;

import javax.xml.transform.Source;
import java.util.LinkedList;

public class CustomLinkedList {

     private Node head;
     private Node tail;


     private int size;

     public CustomLinkedList(){
         this.size=0;
     }

     public void InsertFirst(int value){
         Node node = new Node(value);
         node.next=head;
         head=node;


         if(tail==null){
             // it means it is the first element being added
             tail=head;
         }

         size++;
     }

     public void display(){
         Node temp = head;
         while(temp!=null){
             System.out.print(temp.value + " -> ");
             temp=temp.next;
         }
         System.out.println("END");
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
