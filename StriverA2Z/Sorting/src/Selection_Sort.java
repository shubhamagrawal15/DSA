import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[]arr={5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            int maxIndex= 0;
            for (int j = 0; j < arr.length-i; j++) {
                if(arr[j]>arr[maxIndex]){
                    maxIndex=j;
                }
            }
            // swap this max index with last position
            int temp=arr[maxIndex];
            arr[maxIndex]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;


        }
    }
}
