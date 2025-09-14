package Strings.Easy;

import java.util.Scanner;

public class RemoveOuterParenthesis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        StringBuilder result = new StringBuilder();
        int depth=0;
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if(ch=='('){
                if(depth>0){
                    result.append(ch);
                }
                depth++;
            } else{
                depth--;
                if(depth>0){
                    result.append(ch);
                }
            }

        }
        System.out.println(result);
    }
}
