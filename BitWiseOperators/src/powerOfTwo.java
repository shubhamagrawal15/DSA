public class powerOfTwo {
    public static void main(String[] args) {
        int n=0; // fix for n=0;

        boolean ans = (n&(n-1))==0;
        if(n==0){
            ans = false;
        }
        System.out.println(ans);
    }
}
