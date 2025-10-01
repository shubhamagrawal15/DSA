package Arrays.Easy;

public class CheckArraySortedOrNot {
    public static void main(String[] args) {
        boolean sorted=true;
        int[]arr={10,20,30,9,8,11};
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i]<arr[i+1]){
               sorted=false;
               break;
            }
        }
        if(sorted){
            System.out.println("sorted");
        }else{
            System.out.println("not sorted");
        }

    }
}
