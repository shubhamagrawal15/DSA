import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // syntax
        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(67);
//        list.add(54);
//        list.add(456);
//        list.add(54);

//        System.out.println(list.contains(456));

//        list.set(0,99);   // updation

//        list.remove(2);   // index-->2


//        System.out.println(list);


        // input

        for(int i=0;i<5;i++){
            list.add(input.nextInt());
        }

        // output
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));
        }

    }
}


