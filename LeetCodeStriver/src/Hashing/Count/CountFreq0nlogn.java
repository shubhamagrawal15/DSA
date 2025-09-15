package Hashing.Count;

import java.util.Arrays;

public class CountFreq0nlogn {
    public static void main(String[] args) {
        int[]arr={1,2,3,1,2,1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        // [1, 1, 1, 2, 2, 3]

        int count=1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]==arr[i-1]){
                count++;
            }
            else {
                System.out.println(arr[i-1]+"->"+count);
                count=1;
            }
        }
    }
}
