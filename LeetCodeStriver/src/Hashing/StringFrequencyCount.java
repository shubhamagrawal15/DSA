package Hashing;

import java.util.Arrays;

public class StringFrequencyCount {
    public static void main(String[] args) {
        String str="abcdabegc";

//        System.out.println(str.charAt(1)-'a');  // concept

        int[] hash=new int[26];

        for (int i = 0; i < str.length(); i++) {
            int ch =str.charAt(i)-'a';
            hash[ch]++;
            // or simply write
            // hash[str.charAt(i)-'a']++;
        }

        for (int i = 0; i < hash.length ; i++) {
            if(hash[i]>0) {
                char c = (char) (i + 'a');
                System.out.println(c + " " + hash[i]);
            }

        }
    }
}
