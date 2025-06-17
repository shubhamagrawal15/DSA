public class SumofDigits {
    public static void main(String[] args) {
//        System.out.println(sum(12345));
//        System.out.println(div(12345));
          System.out.println(sumRecursion(12345));
    }

    static int sum(int n) {
        int ans = 0;
        while (n > 0) {
            int rem = n % 10;
            ans=ans+rem;
            n=n/10;
            System.out.println(n);
        }
        return ans;
    }

    static int div(int n){
        return n/10;
    }


    static int sumRecursion(int n){
        if(n==0){
            return 0;
        }
        int rem=n%10;
        return rem+sumRecursion(n/10);
    }
}

