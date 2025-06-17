import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean answer = isArmstrong(num);
//        System.out.println(answer);
        for(int i=100;i<1000;i++){
            if(isArmstrong(i)){
                System.out.println(i + " ");
            }
        }

    }
    static boolean isArmstrong( int num){
        int original =num;
        int sum =0;
        while(num>0){
            int rem = num%10;
            num=num/10;
            sum = sum + rem*rem*rem;
        }
        if(sum==original){
            return true;
        }
        return false;

    }
}
