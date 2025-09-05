package Recursion;

public class NthFibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fibonacciNumber(7));
    }

    static int fibonacciNumber(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibonacciNumber(n-1)+fibonacciNumber(n-2);
    }
}
