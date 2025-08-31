package BasicMaths;

import java.util.ArrayList;
import java.util.Arrays;

public class DivisorsOfANumber {

    static int[] divisors(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i<=n ; i++) {
            if(n%i==0){
               list.add(i);
            }
        }

        // Convert List<Integer> to int[]
        int[]arr= new int[list.size()];
        for (int i = 0; i <list.size() ; i++) {
            arr[i]= list.get(i);
        }

        return arr;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(divisors(36)));
    }
}
