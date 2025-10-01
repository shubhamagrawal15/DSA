package Strings.Hard;

public class StringToInteger {
    public static void main(String[] args) {
        String s = "  +425e5";
        System.out.println(stringToInt2(s));

    }

    static void stringToInteger1(String s){
        StringBuilder sb = new StringBuilder();
        s=s.replaceFirst("^ +","");
        for (int i = 0; i <s.length(); i++) {

            if(s.charAt(i)=='+'|| s.charAt(i)=='-'){
                sb.append(s.charAt(0));
                i++;
            }
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                sb.append(ch);
            }else{
                break;
            }

        }

        System.out.println(sb.toString());

    }

    static int stringToInt2(String str){


        if(str==null||str.length()==0)return 0;
        int i=0;
        int n= str.length();

        while(i<n && str.charAt(i)==' '){
            i++;
        }
        if (i == n) return 0;

        int sign=1;

        if(str.charAt(i)=='+'||str.charAt(i)=='-'){
            sign = (str.charAt(i)=='-'?-1:1);
            i++;
        }

        long result=0;
        while (i<n&&Character.isDigit(str.charAt(i))){
            int digit = str.charAt(i)-'0';
            result=result*10+digit;

            if (sign * result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign * result < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }

        return (int)(sign*result);




    }









}
