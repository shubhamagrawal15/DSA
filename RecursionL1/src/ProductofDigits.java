public class ProductofDigits {
    public static void main(String[] args) {
        System.out.println(productRecursion(1234));
    }

    static int productRecursion(int n){
        if(n%10==n){
            return n;
        }
        int rem=n%10;
        return rem*productRecursion(n/10);
    }
}
