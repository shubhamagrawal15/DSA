package Strings.Hard;

public class MaximumNoOfOccurenceOfASubstring {
    public static void main(String[] args) {
        String str="abcdefghij";
        System.out.println(substringCount2(str));

    }

    static int substringCount(String str){
        int answer =0;
        for (int i = 0; i <str.length() ; i++) {
            String temp="";
            for (int j = i; j <str.length() ; j++) {
                temp=temp+str.charAt(j);
                System.out.println(temp+" ");
                answer++;
            }
            System.out.println();
        }
        return  answer;
    }

    static  int substringCount2(String str){
        int n=str.length();

        return (n*(n+1))/2;
    }
}
