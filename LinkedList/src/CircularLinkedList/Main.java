package CircularLinkedList;

public class Main {
    public static void main(String[] args) {

        CircularLinkedList list = new CircularLinkedList();
        list.insertAfterTail(5);
        list.insertAfterTail(6);
        list.insertAfterTail(7);

        list.delete(7);

        list.display();
    }
}
