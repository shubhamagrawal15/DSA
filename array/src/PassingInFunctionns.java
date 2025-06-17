import java.util.Arrays;

public class PassingInFunctionns {

    public static void main(String[] args) {

        int[] nums = {3,4,5,12};
        System.out.println(Arrays.toString(nums));
        changedArr(nums);
        System.out.println(Arrays.toString(nums));

        String name="Shubham";
        System.out.println(name);
        changedStr(name);
        System.out.println(name);

        int rollno =5;
        System.out.println(rollno);
        changedInt(rollno);
        System.out.println(rollno);
    }

    static void changedArr(int[] arr){
        arr[0]=99;

    }

    static  void changedStr(String name){
        name = "ShubhamAgrawal";
    }

    static void changedInt( int rollno){
        rollno=85;
    }


}
