package Arrays.Easy;

public class RemoveDuplicates {
    /*
    public static void main(String[] args) {
        int count=1;
        int[] arr={-2, 2, 4, 4, 4, 4, 5, 5};

        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]!=arr[i-1]){
                count++;
            }
        }
        System.out.println(count);
    }
    */


    public static void main(String[] args) {
        int[]arr={0,0,3,3,5,6};
        int j=0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];
            }
        }
        System.out.println("no of unique elements = "+(j+1));

        for (int i = 0; i <=j ; i++) {
            System.out.println(arr[i]);
        }
    }
}
