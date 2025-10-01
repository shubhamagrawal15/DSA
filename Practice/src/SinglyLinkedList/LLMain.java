package SinglyLinkedList;

public class LLMain {
    public static void main(String[] args) {
        LL list = new LL();



        list.insertFirst(5);
        list.insertFirst(4);

        list.insertFirst(2);
        list.insertFirst(1);
        list.insertFirst(0);

        list.insertLast(6);
        list.insert(3,3);


//        list.deleteFirst();
//        list.deleteLast();



        list.display();



    }
}
