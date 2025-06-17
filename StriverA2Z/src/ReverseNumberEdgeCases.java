
public class ReverseNumberEdgeCases {
    public static void main(String[] args) {
        int n=123;
        System.out.println(Solution(n));
    }
    static int Solution(int x){
        int answer = 0;

        while (x != 0) {
            int rem = x % 10; // last digit

            // Check if adding rem will cause overflow
            if (answer > Integer.MAX_VALUE / 10 || (answer == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0;
            }
            if (answer < Integer.MIN_VALUE / 10 || (answer == Integer.MIN_VALUE / 10 && rem < -8)) {
                return 0;
            }

            answer = answer * 10 + rem; // build reversed number
            x = x / 10; // move to next digit
        }

        return answer;
    }
}