package Patterns;

import java.sql.SQLOutput;

public class Pattern3 {
    static void pattern(int n){
        /*
        1
        12
        123
        1234
        12345

         */

        for(int i =1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
