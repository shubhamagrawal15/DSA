public class NoOfZeroes {
    public static void main(String[] args) {
//        System.out.println(count(202020));
        count2(20202);
        System.out.println(TotalCount);
    }

    static int count(int n){
        return helper(n,0);
    }
    // special example to return , same value to above functional call

    static int helper(int n,int c)
    {
        if(n==0){
            return c;
        }
        int rem = n%10;
        if(rem==0){
            return helper(n/10,c+1);
        }
        return helper(n/10,c);
    }


    // using external variable;
    static int TotalCount=0;
    static int  count2(int n){
        if (n == 0) {
            return TotalCount;
        }
        int rem=n%10;
        if(rem==0){
            TotalCount++;
        }
        return count2(n/10);
    }
}
