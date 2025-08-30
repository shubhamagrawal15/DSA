package Patterns;

public class Pattern15 {
    static void pattern(int n){
        /*
        ABCDE
        ABCD
        ABC
        AB
        A
         */
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n-i ; j++) {
                System.out.print((char)('A'+j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
