package SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertFirst(0);

        list.insertLast(6);
        list.insert(3,3);


//        list.deleteFirst();
//        list.deleteLast();
          list.delete(2);

           list.display();
        System.out.println(list.find(0));


    }
}
