import java.util.ArrayList;
import java.util.Arrays;

public class DivisorsOfANumber {
    public static void main(String[] args) {
        int n=6;
//        divisors(n);
//        System.out.println(arr);
        int[] ans = divisorsArr(n);
        System.out.println(Arrays.toString(ans));
    }

    static ArrayList<Integer>arr = new ArrayList<>();
    static void divisors(int n){
        for (int i = 1; i <=n; i++) {
            if(n%i==0){
                arr.add(i);
            }
        }
    }

    static int[] divisorsArr(int n) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                arrlist.add(i);
            }
        }
        int[] arr = new int[arrlist.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arrlist.get(i);
        }

        return arr;
    }
}
