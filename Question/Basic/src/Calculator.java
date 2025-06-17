import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int answer =0;

        // Take input from the user till user doesnt press X or x
        while(true){
            // take the operator as ip
            System.out.println("Enter the operator");
            char op = input.next().trim().charAt(0);
            if(op=='+'||op=='-'||op=='*'||op=='/'||op=='%'){
                // input two numbers
                System.out.println("Enter two numbers");
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if(op=='+'){
                    answer=num1+num2;
                }
                if(op=='-'){
                    answer=num1-num2;
                }
                if(op=='*'){
                    answer=num1*num2;
                }
                if(op=='/'){
                    if(num2!=0) {
                        answer = num1 / num2;
                    }
                }
                if(op=='%'){
                    answer=num1%num2;
                }
            }
            else if(op=='x'||op=='X'){
                break;
            }
            else{
                System.out.println("invalid operation");
            }
            System.out.println(answer);
        }


    }
}
