package eg;

import java.util.Arrays;

public class StringExample {
    public static void main(String[] args) {
        int[]arr = {6,4,5,3,1,2};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int result=0;
        for(int i=0; i<arr.length;i=i+2){
            result=result+arr[i];
        }
        System.out.println(result);
    }
}
