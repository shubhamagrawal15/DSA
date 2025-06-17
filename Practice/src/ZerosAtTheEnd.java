import java.util.Arrays;

public class ZerosAtTheEnd {
    public static void main(String[] args) {
        int[] arr={1,2,0,3,4,0,5,8,0};
        changedArr(arr);
        System.out.println(Arrays.toString(arr));

    }

    static  void changedArr(int[]arr){
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0) {
                arr[index] = arr[i];
                index++;
            }
        }
        for(int i=index;i<arr.length;i++){
            arr[i]=0;
        }

    }
}
