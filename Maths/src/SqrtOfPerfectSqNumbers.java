import java.util.Arrays;

public class SqrtOfPerfectSqNumbers {
    public static void main(String[] args) {
        int n=7;
        System.out.println(square(n));

    }

    static int square(int n){
        int start =0;
        int end = n;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid*mid==n){
                return mid;
            } else if (mid*mid>n) {
                end=mid-1;
            }else{
                start=mid+1;
            }

        }
        return -1;
    }
}
