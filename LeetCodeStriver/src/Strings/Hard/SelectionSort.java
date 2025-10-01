package Strings.Hard;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[]arr={13,46,24,52,20,9};
        selecctionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selecctionSort(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            int min =i;
            for (int j = i+1; j <arr.length; j++) {
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
}
