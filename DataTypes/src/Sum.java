import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Enter the numbers :");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2= input.nextInt();

        int sum = num2+num1;

        System.out.println("the addition of the two numbers  is  " + sum);
    }
}
