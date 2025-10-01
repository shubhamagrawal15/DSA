package Strings.Hard;

import java.util.Arrays;

public class ReverseEveryWordInAString {
    public static void main(String[] args) {

//        Input: s =    "Let's take LeetCode contest"
//        Output:       "s'teL ekat edoCteeL tsetnoc"

        String s =  "welcome to the   jungle";
        System.out.println(Reverse2(s));

    }

    static String Reverse(String s){

        String [] modified =s.trim().split("\\s+ ");
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i <modified.length ; i++) {
            String substring=modified[i];
            for (int j = substring.length()-1; j >=0 ; j--) {
                sb.append(substring.charAt(j));
            }
            if (i < modified.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    static String Reverse2(String s){
        String[] modified = s.split("\\s+");
        System.out.println(Arrays.toString(modified));
        StringBuilder result = new StringBuilder();
        //[welcome, to, the, jungle]
        for (String substring:modified){
            if(substring.length()==0)continue;

            StringBuilder sub = new StringBuilder(substring);
            result.append(sub.reverse().toString()).append(" ");
        }


        return result.toString().trim();
    }

}
