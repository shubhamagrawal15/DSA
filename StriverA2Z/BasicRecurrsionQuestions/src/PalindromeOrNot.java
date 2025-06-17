public class PalindromeOrNot {
    public static void main(String[] args) {
        System.out.println(palindromeCheck("abcba"));
    }
    static boolean palindromeCheck(String s) {
      return helper(s,0,s.length()-1);
    }

    static boolean helper(String s,int start,int end){
        if(start>=end){
            return true;
        }
        else{
            if(s.charAt(start)==s.charAt(end)){
                return helper(s,start+1,end-1);
            }else{
                return false;
            }
        }
    }
}
