package BasicMaths;

public class CountPrimes {

   static boolean isPrime(int num){
       for (int i = 2; i*i <=num ; i++) {
           if(num%i==0){
               return false;
           }

       }
       return true;
   }

   static int count(int num){
       int count=0;
       for (int i = 2; i <num ; i++) {
           if(isPrime(i)){
               count++;
           }
       }
       return count;
   }

    public static void main(String[] args) {
        System.out.println(count(10));
    }
}
