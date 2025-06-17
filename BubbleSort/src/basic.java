import java.util.Arrays;

public class basic {
    public static void main(String[] args) {
    int[]arr = {1,2,0,6,5};
    bubbleSort(arr);
    System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[]arr){function
        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < arr.length ; i++) {

            // for each step max item will come at the last respective index
            for (int j = 1; j < arr.length-i; j++) {
                // swap if the item is smaller than the previous item
                if(arr[j]<arr[j-1]){
                    // swap
                    int temp =arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }

            }
            // if you didnt swap for a particular value of i ,it means the array is sorted when stop the prorgam;
            if(swapped==false){
                break;
            }
        }
    }
}