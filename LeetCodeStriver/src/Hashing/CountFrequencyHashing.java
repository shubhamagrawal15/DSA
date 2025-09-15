package Hashing;

import java.util.Arrays;

public class CountFrequencyHashing {
    public static void main(String[] args) {
        int[]arr={1,2,3,2,1};
        int length= arr.length;
        int[] hash = new int[length];
//        System.out.println(Arrays.toString(hash));

        for (int i = 0; i <length; i++) {
            hash[arr[i]]++;
        }


        for (int i = 0; i <arr.length ; i++) {
            System.out.println(i+" : "+hash[i]);
        }

    }
}
