package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class Basic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        // add elements
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        // get elements
        System.out.println( list.get(0));

        //add elements in between
        list.add(2,2);
        System.out.println(list);

        // Modify Elements
        list.set(0,5);
        System.out.println(list);

        // Delete Element
        list.remove(0);
        System.out.println(list);

        System.out.println(list.size());


        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");

        }
        System.out.println();

        // sorting
//        list.sort(null);
//        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}
