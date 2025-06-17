import java.util.Arrays;

public class Seive {
    public static void main(String[] args) {
        int n=40;
        boolean[] primes = new boolean[n+1];
//        System.out.println(Arrays.toString(primes));
       sieve(40,primes);
    }

    // false in array means number is prime
    static void sieve(int n,boolean[] primes){
     for(int i=2;i*i<=n;i++){
         if(primes[i]==false){
             for (int j = 2*i; j <=n ; j=j+i) {
                 primes[j]=true;
             }
         }
     }
        for (int i = 2; i <=n ; i++) {
            if(primes[i]==false){
                System.out.println(i);
            }
        }
    }
}
