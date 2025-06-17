public class Reverse {
    public static void main(String[] args) {
        int number = 28479;

        int ans = 0;

        while(number>0){
            int rem = number%10;
            number=number/10;
            ans = ans*10+rem;

        }


        System.out.println(ans);
    }
}
