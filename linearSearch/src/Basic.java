import java.util.Scanner;


public class Basic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr ={5,7,6,9,3,2,1,89};
        int key = input.nextInt();

        boolean found = false;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==key) {
                System.out.println(arr[i] + "found  at index " + i);
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("not found");
        }
        input.close();
    }
}