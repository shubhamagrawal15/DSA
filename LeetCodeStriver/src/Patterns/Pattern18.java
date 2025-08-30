package Patterns;

public class Pattern18 {
    static void pattern(int n){
        /*
        E
        D E
        C D E
        B C D E
        A B C D E
         */

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print((char)('A'+(n-i-1)+j)
                +" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
