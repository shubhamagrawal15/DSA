package Arrays.Easy;

import java.util.Arrays;

public class LeftRotateArrayByD {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int d = 2;
        reverseByD(arr, d);
        System.out.println(Arrays.toString(arr));

        int[]arr2={1,2,3,4,5,6,7};
        int k=3;
        reverseby(arr2,k);
        System.out.println(Arrays.toString(arr2));
    }
    static void reverseByD(int[]arr,int d){
        int[]temp= new int[d];
        for (int i = 0; i <d ; i++) {
            temp[i]=arr[i];
        }
        System.out.println(Arrays.toString(temp));

        for (int i = d; i < arr.length ; i++) {
            arr[i-d]=arr[i];
        }


        for (int i = arr.length-d; i <arr.length ; i++) {
            arr[i]=temp[i-((arr.length)-d)];
        }
    }
    static void reverseby(int[]arr,int d){
        int n=arr.length;
        d=d%n;
        if(d==0) return;

        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);


    }
    static void reverse(int[]arr,int left,int right){
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}
