package HashQuestions;
import java.util.ArrayList;
import java.util.Set;

import java.util.HashSet;

public class UnionOf2Arrays {
    public static void main(String[] args) {

        /*
        int[]arr1={1,2,3,4,5};
        int[]arr2={2,1,7,6,10,9,8,5,6};

        ArrayList<Integer> list= new ArrayList<>();
        for (int i = 0; i < arr1.length ; i++) {
            list.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length ; i++) {
            list.add(arr2[i]);
        }
        System.out.println(list);

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i <list.size(); i++) {
            set.add(list.get(i));
        }

        System.out.println(set);

         */

        // more optimized approach
        int[]arr1={1,2,3,4,5};
        int[]arr2={2,1,7,6,10,9,8,5,6};

        Set<Integer> set = new HashSet<>();

        for(int num:arr1){
            set.add(num);
        }
        for (int num:arr2){
            set.add(num);
        }

        System.out.println(set);
        System.out.println(set.size());



    }
}
