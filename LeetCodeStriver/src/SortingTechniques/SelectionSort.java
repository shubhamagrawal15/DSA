package SortingTechniques;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={13,46,24,52,20,9};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[]arr){

        for (int i = 0; i <=arr.length-2 ; i++) {
            // for the interval i to arr.length check the min
            // let the very first index carries  the minimum
            int minimum=i;
            for (int j = i; j <=arr.length-1 ; j++) {
                if(arr[minimum]>arr[j]){
                    minimum=j;
                }
            }
            int temp = arr[minimum];
            arr[minimum]=arr[i];
            arr[i]=temp;

        }
    }

}
