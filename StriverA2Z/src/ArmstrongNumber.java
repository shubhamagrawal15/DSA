public class ArmstrongNumber {
    public static void main(String[] args) {
        int n=153;
        System.out.println(isArmstrong(153));
    }
    static boolean isArmstrong(int n) {
        int ans = 0;
        int original = n;
        while (n > 0) {
            int rem = n % 10;
            ans = ans  + rem * rem * rem;
            n = n / 10;
        }

        if (original == ans) {
            return true;
        } else {
            return false;
        }
    }
}
