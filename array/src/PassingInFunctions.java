import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {
        int[] nums = {3,4,5,12};
        System.out.println(Arrays.toString(nums));
        changeArr(nums);
        System.out.println(Arrays.toString(nums));

        int a = 10;
        System.out.println(a);
        changeint(a);
        System.out.println(a);
    }

    static void changeArr(int[] arr){
        arr[0] =99;
    }

    static void changeint(int a){
        a=15;
    }
}
