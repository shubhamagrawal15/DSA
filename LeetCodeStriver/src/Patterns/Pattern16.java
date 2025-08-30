package Patterns;

public class Pattern16 {
    static void pattern(int n){
        /*
        A
        BB
        CCC
        DDDD
        EEEEE
         */
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print((char)('A'+i));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
