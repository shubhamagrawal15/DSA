package SortingTechniques;

import java.util.Arrays;

import java.util.*;

public class InsertionOne {
    public static void main(String[] args) {
        int[]arr={5,4,3,2,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void insertionSort(int[]arr){
        for (int i = 0; i <= arr.length-2 ; i++) {
            for (int j = i+1; j>0 ; j--) {
                if(arr[j]<arr[j-1]){
                    // swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }


//    String [] modified = str.split();
//    int length=0;
//    for(int i=0;i<modified.length();i++){
//        String substring = modified[i];
//        for (int j = 0; j <substring.length() ; j++) {
//            if(length<substring.)
//        }
//    }
}
