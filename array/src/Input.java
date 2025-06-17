import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];


        // input using for loop
        for (int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }

        // output

        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
        }

        for(int item :arr){
//            System.out.println(item);  // here item represents the item in the array arr
        }

        System.out.println(Arrays.toString(arr));


        String[] str = new String[4];
        for (int i =0;i<str.length;i++){
            str[i] = input.next();
        }

        System.out.println(Arrays.toString(str));

    }
}
