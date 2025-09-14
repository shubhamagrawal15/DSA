package eg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class minCost {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int hop=in.nextInt();
        int[]arr= new int[n];

        for (int i = 0; i <n ; i++) {
            arr[i]=in.nextInt();
        }


        int cost=0;
        int i=0;
        while(i<n){
            i=i+hop;
            cost = cost+arr[i]+arr[hop];

        }
        System.out.println(cost);


    }
}
