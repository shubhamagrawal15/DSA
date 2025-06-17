public class PalindromeNumber {
    public static void main(String[] args) {
        int n=-121;
        System.out.println(check(n));
    }
    static boolean check(int n ){
             if(n<0){
                 return false;
             }
                int original=n;
                int answer=0;
                while(n!=0){
                    int rem=n%10;
                    //overflow condition
                    if(answer>Integer.MAX_VALUE/10 || answer==Integer.MAX_VALUE/10&rem>7){
                        return false;
                    }


                    answer=answer*10+rem;
                    n=n/10;
                }
                if(answer==original){
                    return true;
                }else{
                    return false;
                }
    }
}

