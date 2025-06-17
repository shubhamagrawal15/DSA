import java.util.Scanner;

public class Forloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // for loop

        /*
        for(initiialization;condition;inr/dec){
        }
         */

        for(int num=1;num<=5;num++){
//            System.out.println(num);
        }

        // print numbers from 1 to n(form the user)
        int n = input.nextInt();

        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }

    }
}
