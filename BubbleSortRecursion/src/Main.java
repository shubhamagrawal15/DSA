import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] arr={4,3,2,1};
       bubbleSort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));

    }

    static void bubbleSort(int[]arr,int row,int col){
        if(row==0){
            return;
        }
        if(col<row){
            if(arr[col]>arr[col+1]){
                // swap
                int temp=arr[col];
                arr[col]=arr[col+1];
                arr[col+1]=temp;
            }
            bubbleSort(arr,row,col+1);
        }
        else{
            bubbleSort(arr,row-1,0);
        }
    }
}