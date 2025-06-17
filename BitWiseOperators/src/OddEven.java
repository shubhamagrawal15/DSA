
public class OddEven {
    public static void main(String[] args) {
    int n = 68;
        System.out.println(oddEven(n));
    }

     static boolean oddEven(int n){

            return ((n&1)==1);

    }
}