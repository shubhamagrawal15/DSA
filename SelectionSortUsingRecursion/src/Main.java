import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int [] arr={4,3,2,1};
        selectionSort(arr,4,0,0);
        System.out.println(Arrays.toString(arr));


    }



    static void selectionSort(int[]arr,int row,int col,int max){
        if(row==0){
            return;
        }

        if(col<row){
               if(arr[col]>arr[max])
               {
                selectionSort(arr,row,col+1,col);
               }
               else{
                selectionSort(arr,row,col+1,max);
               }

        }
        else{
            int temp=arr[max];
            arr[max]=arr[row-1];
            arr[row-1]=temp;
            selectionSort(arr,row-1,0,0);
        }

    }
}