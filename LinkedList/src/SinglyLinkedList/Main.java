package SinglyLinkedList;

public class Main {
    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();

        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertFirst(0);
        list.insertFirst(-1);

        list.display();



    }
}
