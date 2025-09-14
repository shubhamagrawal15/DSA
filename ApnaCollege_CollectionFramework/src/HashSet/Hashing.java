package HashSet;
import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {
        // Creation
        HashSet<Integer> set = new HashSet<>();
        // same as arrayList

        // insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        // search
        System.out.println( set.contains(1));

        // remove
        set.remove(2);



        for(int num:set){
            System.out.println(num);
        }

        System.out.println("the size of the set is "+set.size());
        System.out.println(set);



        // sets have iterator

        Iterator it = set.iterator();
        // it has two functions  1) hasNext   2) next


        while(it.hasNext()){
            System.out.println(it.next());
        }




    }
}
