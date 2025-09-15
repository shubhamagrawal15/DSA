package Hashing.Count;

public class CountFreq0n2 {
    public static void main(String[] args) {
        int[]arr={1,2,3,2,1};
        int[]hash = new int[100];

        for(int num: arr){
            hash[num]++;
        }

        for (int i = 0; i <hash.length ; i++) {
            if(hash[i]>0){
                System.out.println(i+" -> "+hash[i]);
            }
        }
    }
}
