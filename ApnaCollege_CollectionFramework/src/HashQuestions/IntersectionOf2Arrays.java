package HashQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOf2Arrays {
    public static void main(String[] args) {
        int[]arr1={7,3,9,9,9,3,2,1};
        int[]arr2={6,3,9,2,9,4};

        Set<Integer>  unique = new HashSet<>();
        Set<Integer>  unique2 = new HashSet<>();

        for(int num:arr1){
            unique.add(num);
        }
        for(int num:arr2){
            unique2.add(num);
        }


        System.out.println(unique);

        for (int i = 0; i < unique2.size(); i++) {
            if(unique.contains(unique2[i])){
                System.out.println(arr2[i]);
            }
        }




    }
}
