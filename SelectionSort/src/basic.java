import java.util.Arrays;

public class basic {
    public static void main(String[] args) {
        int[] arr={5,4,8,9,11,7};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[]arr){
        for (int i = 0; i < arr.length ; i++) {
            // find the max item in the remaining array and swap with correct index
            int lastElementIndex=arr.length-i-1;
            int startElement=0;
            int maxIndex=getMaxIndex(arr,startElement,lastElementIndex);
            swap(arr,maxIndex,lastElementIndex);
        }
    }

    static int getMaxIndex(int[]arr,int start,int end){
        int max = start;
        for (int i = start; i <=end ; i++) {
            if(arr[max]<arr[i]){
                max =i;
            }
        }
        return max;
    }

    static void swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}