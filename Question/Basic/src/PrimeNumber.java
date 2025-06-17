import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean answer = isPrime(n);
        System.out.println(answer);
    }
    static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        int c =2;
        while(c*c<num){
            if(num%c==0){
                return false;
            }
            c++;


        }
        if(c*c>num){
            return true;
        }
        return false;
    }

}

