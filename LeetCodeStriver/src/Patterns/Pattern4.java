package Patterns;

public class Pattern4 {
    static void pattern(int n){
        /*
        1
        22
        333
        4444
        55555
         */

        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
