public class countPrimes {
    public static void main(String[] args) {

    }
        static int countPrimes(int n) {
            boolean[] primes=new boolean[n+1];
            for(int i=2;i*i<=n;i++){
                if(primes[i]==true){
                    for(int j=2*i;j<=n;j++){
                        primes[j]=true;
                    }
                }
            }
            for(int i=2;i<=n;i++){
                if(primes[i]==false){
                    System.out.println(i);
                }
            }



    }
}
