package Strings.Easy;

public class IsomorphicString {
    public static void main(String[] args) {
        String s="egg";
        String t="add";
        isomorphic(s,t);

    }
    static boolean isomorphic(String s ,String t){
        if(s.length()!=s.length())return false;

        int[] mapST=new int[256];   // S->T
        int[] mapTS=new int[256];   //T->S

        for (int i = 0; i <s.length() ; i++) {
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            System.out.println(c1+"->"+c2);

            // checking if they exist or not
            if(mapST[c1]!=0 && mapST[c1]!=c2) return false;
            if(mapTS[c2]!=0 && mapTS[c2]!=c1) return false;


            // store maping
            mapST[c1]=c2;
            mapTS[c2]=c1;
        }

        return true;
    }
}
