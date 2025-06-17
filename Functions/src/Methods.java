
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        //Q:Take input of two numbers and print the sum

        Scanner input = new Scanner(System.in);
        int num1,num2,sum;

        System.out.println("Enter number 1 :");
         num1 = input.nextInt();
        System.out.println("enter 2nd number :");
         num2 = input.nextInt();
         sum = num1+num2;
        System.out.println("the sum is equal to  "+ sum);

    }
}