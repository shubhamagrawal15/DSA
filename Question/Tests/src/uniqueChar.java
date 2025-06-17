//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class uniqueChar {
    public static void main(String[] args) {

        String str ="swiss";
        int result =findIndex(str);
        System.out.println(result);

        }

     // give the index of the first  unique  characters in string

       static int findIndex(String str){
         int[] freq =new int[26];

         for(int index=0;index<str.length();index++){
             freq[str.charAt(index)-'a']++;
         }

           for (int i = 0; i < str.length(); i++) {
               if(freq[str.charAt(i)-'a']==1){
                   return i;
               }
           }
         return -1;

       }


    }


