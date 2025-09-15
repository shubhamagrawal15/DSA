package Strings.Easy;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {

        /*
        String[] str = {"Flower", "flow", "fly", "flight"};
        StringBuilder result = new StringBuilder();
        int length = str.length;
        String firstElement = str[0];

        for (int i = 0; i < str.length; i++) {
            if (firstElement.charAt(0) == str[length - i].charAt(i)) {
                if (firstElement.charAt(0) == str[length - i].charAt(i)) {
                    if (firstElement.charAt(0) == str[length - i].charAt(i)) {
                        if (firstElement.charAt(0) == str[length - i].charAt(i)) {
                            result.append(firstElement.charAt(0));
                        }
                    }
                }
            }

            System.out.println(result);
        }

         */

        String[] str = {"flower", "flow", "fly", "flight"};
        Arrays.sort(str);
        // after sorting all the elements are arranged lexicographically
        System.out.println(Arrays.toString(str));

        String firstElement=str[0];
        String lastElement=str[str.length-1];

        // now compare first and last element
        /*
        int i=0;
        while(i<firstElement.length()&&i<lastElement.length()  && firstElement.charAt(i)==lastElement.charAt(i)){
            i++;
        }
         */
        int j=0;
        for (; j <firstElement.length() && j<lastElement.length() ; j++) {
            if(firstElement.charAt(j)==lastElement.charAt(j)){
            continue;
            }
            else{
                break;
            }
        }
        System.out.println(firstElement.substring(0,j));







    }
}
