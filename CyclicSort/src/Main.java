import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    int[] arr={3,5,2,1,4};
    cyclicSort(arr);
    System.out.println(Arrays.toString(arr));
    }


    static void cyclicSort(int[]arr){
     // check swap and move i to the beginning;
        int i=0;
        while(i<arr.length){
            int CorrectIndex = arr[i]-1;
            if(arr[i]!=arr[CorrectIndex]){
                swap(arr,i,CorrectIndex);
            }else{
                i++;
            }
        }
    }

    static void swap(int[]arr,int first,int second)
    {
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

}

