package BasicMaths;

public class ArmStrongNumbers {

    static boolean isArmstrong(int n){
        int original = n;
        int ans=0;
        int digits = String.valueOf(n).length();
        while(n!=0){
            int rem=n%10;
            ans=ans+(int)(Math.pow(rem,digits));
            n=n/10;
        }
        if(original==ans){
            return  true;
        }return false;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(123));

        int number=123456;
        System.out.println(String.valueOf(number).length());
    }
}
