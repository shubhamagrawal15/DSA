public class BSSqrt {
    public static void main(String[] args) {
         int n =40;
         int p=3;

        System.out.printf("%.3f",sqrt(n,p));
    }
    static  double sqrt(int n,int p){
        int s=0;
        int e=n;
        double root =0.0;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(mid*mid==n){
                root =mid;
                return mid;
            }
            if(mid*mid>n){
                e=mid-1;
            }else{
                root=mid;  // tracks the floor of the root
                s=mid+1;
            }
        }
        double incr = 0.1;
        for (int i = 0; i <p ; i++) {
            while (root*root<=n){
                root=root+incr;
            }
            root= root-incr;

            incr=incr/10;
        }


        return root;

    }
}
