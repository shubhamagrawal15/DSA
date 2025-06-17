
public class PrimeNos {
    public static void main(String[] args) {

        int n = 31;
        for (int i = 1; i <= n; i++) {
            System.out.println(i +" " + isprime(i));
        }
    }

    static boolean isprime(int n){
        if(n<=1){
            return  false;
        }
        for (int i=2;i<=Math.sqrt(n);i++){

            if(n%i==0){
                return false;
            }
        }
        return true;
    }
     static boolean prime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return  false;
            }
            c++;
        }
        return true;
     }


}