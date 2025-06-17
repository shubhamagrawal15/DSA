import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
    int [] arr={1,2,3,4,5};
    swap(arr,0,arr.length-1);
    System.out.println(Arrays.toString(arr));
    }
    static void swap(int[]arr,int start,int end){
        if(start>=end){
            return;
        }else{
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
        swap(arr,start+1,end-1);

    }
}
