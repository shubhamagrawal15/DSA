package Strings.Easy;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s ="anagram";
        String t = "nagaram";
        System.out.println(anagram1(s,t));
        System.out.println(anagram2(s,t));


    }

    static boolean anagram1(String s ,String t){
        int[]mapS= new int[256];
        int[]mapT= new int[256];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            mapS[ch]++;
        }

        for (int i = 0; i <t.length() ; i++) {
            char ch = t.charAt(i);
            mapT[ch]++;
        }

        if(Arrays.equals(mapS,mapT)){
            return true;
        }
        return  false;
    }

    static  boolean anagram2(String s ,String t){
        // convert into array first
        char[] ch1=s.toCharArray();
        char[] ch2=t.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

       if(Arrays.equals(ch1,ch2)){
           return  true;
       }
       return false;
    }
}
