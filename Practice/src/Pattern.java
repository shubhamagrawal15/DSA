public class Pattern {
    public static void main(String[] args) {
        nTriangle(3); // You can change this to any number
    }

    public static void nTriangle(int n) {
        for (int row = 0; row <2 * n - 1; row++) {
            int  stars;

            if (row < n) {
                stars = row+1;
            } else {
                stars =  (2 * n - row - 1);
            }



            // Print stars
            for (int st = 0; st < stars; st++) {
                System.out.print("*");
            }

            // Newline
            System.out.println();
        }
    }
}
