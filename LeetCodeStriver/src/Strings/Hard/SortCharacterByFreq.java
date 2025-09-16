package Strings.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortCharacterByFreq {
    public static void main(String[] args) {
        String str="tttrree";


//       int n=75;
//       char ch =(char)(n);
//        System.out.println(ch);




        int[] map=new int[256];

        for (int i = 0; i <str.length(); i++) {
            char ch = str.charAt(i);
            map[ch]++;
        }

        ArrayList<Character> uniqueCharacter = new ArrayList<>();

        for (int i = 0; i < map.length ; i++) {
            if(map[i]>0){
               uniqueCharacter.add((char)i);
               //[e,r,t]
            }
        }

        uniqueCharacter.sort((a,b)->{
            if(map[b]!=map[a]) return map[b]-map[a];
            else return  a-b;
        });

        System.out.println(uniqueCharacter);





    }
}
