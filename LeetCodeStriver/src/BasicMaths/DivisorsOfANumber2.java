package BasicMaths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class DivisorsOfANumber2 {

    static int[] divisors(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <=Math.sqrt(n) ; i++) {
            if (n % i == 0) {
                list.add(i);
                if ((n / i) != i) {
                    list.add(n / i);
                }
            }
        }

            int[] result = new int[list.size()];
            Collections.sort(list);
            for (int j = 0; j <list.size() ; j++) {
                result[j]=list.get(j);
            }


        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(divisors(36)));
    }
}
