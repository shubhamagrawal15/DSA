package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertFirst(6);
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);

        list.insertFirst(1);
        list.insertFirst(0);
        list.insertLast(7);
        list.insertLastWithoutHead(8);
        list.insert(2,2);

        list.insertAfterNode(8,9);



        list.display();
        list.displayReverse();

    }
}
