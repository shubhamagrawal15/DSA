public class Eg8 {
    public static void main(String[] args) {
    pattern9(4);
    }

    static  void pattern9(int n){
    int originalN = n;
    n=2*n;
        for (int row = 0; row <=n ; row++) {
            for (int col = 0; col <=n; col++) {
                int atEveryIndex = originalN- Math.max(Math.max(row,col),Math.max(n-row,n-col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println(" ");
        }
    }
}
