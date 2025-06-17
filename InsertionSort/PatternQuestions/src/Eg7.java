public class Eg7 {
    public static void main(String[] args) {
    pattern8(5);
    }

    static void pattern8(int n){

        /*
            1
           212
          32123
         4321234
        543212345

         */

        for (int row = 1; row <= n; row++) {

            for (int spaces = 0; spaces < n-row; spaces++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <=row; col++) {
                System.out.print(col+" ");
            }
            System.out.println(" ");
        }
    }
}
