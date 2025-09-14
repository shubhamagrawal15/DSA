package eg;

import java.util.Arrays;

public class StringEG {
    public static void main(String[] args) {
        String str="My name is Shubham Agrawal";
        String[] modified=str.split("");
        System.out.println(Arrays.toString(modified));
        String maxLength=" ";
        for (int i = 0; i < modified.length; i++) {
           if(modified[i].length()>maxLength.length()){
               maxLength=modified[i];
           }
        }
        System.out.println(maxLength);
    }
}


