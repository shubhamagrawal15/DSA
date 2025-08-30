package Patterns;

public class Pattern14 {



    static void pattern(int n){
        /*
        A
        AB
        ABC
        ABCD
        ABCDE

         */

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print((char)('A'+j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
       pattern(5);
    }
}
