package SortingTechniques;

import java.util.Arrays;

public class InsertionTwo {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));


    }

    static void insertionSort(int[]arr){
        for (int i = 0; i<=arr.length-1 ; i++) {
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
}
