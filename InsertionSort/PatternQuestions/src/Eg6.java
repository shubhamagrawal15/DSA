public class Eg6 {
    public static void main(String[] args) {
    pattern6(5);
    }

    static void pattern6(int n){
        for (int row = 1; row <=2*n-1 ; row++) {
            int totalNoofColmns = row>n ? 2*n-row:row;

            int totalSpaces = n-totalNoofColmns;
            for (int spaces = 0; spaces <totalSpaces ; spaces++) {
                System.out.print(" ");
            }

            for (int col = 1; col <=totalNoofColmns ; col++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
