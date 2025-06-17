import java.util.Arrays;

public class VariableLengthArguments {
    public static void main(String[] args) {
        fun(5,4484,4849,484,454,44,4,5,5);
        multipleArguments(2,3,"shubham","ssd");
    }

    static void fun(int ...v) // array of integer as arguments
    {
        System.out.println(Arrays.toString(v));
    }

    static void multipleArguments(int a,int b,String ...v){

    }
}
