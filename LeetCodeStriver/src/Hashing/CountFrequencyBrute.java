package Hashing;
public class CountFrequencyBrute {
    public static void main(String[] args) {
        int []arr={1,2,3,1,2};


        for (int i = 0; i < arr.length ; i++) {

            boolean visited= false;
            for (int j = 0; j <i ; j++) {
                if(arr[j]==arr[i]){
                    visited=true;
                    break;
                }

            }
            if(visited)continue;




            System.out.println(arr[i]+" " +countfreq(arr[i],arr));
        }

    }
    static  int countfreq(int num,int[]arr){
        int count=0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==num){
                count++;
            }
        }
        return count;
    }
}