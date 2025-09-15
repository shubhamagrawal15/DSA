package Hashing;

public class StringFrequency2_0 {
    // the previous one was for only lower case alphabets...what if we have all characters from 0 to 9 a-z A-Z backspace etc
    // these all in total is 256 so,

    public static void main(String[] args) {
        String str="aABcbef@@ j*";

        int[] hash = new int[256];
        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i)]++;
        }

        for (int i = 0; i < hash.length; i++) {
            if(hash[i]>0){
                char ch = (char)(i);
                System.out.println(ch+" : "+hash[i]);
            }
        }
    }

}
