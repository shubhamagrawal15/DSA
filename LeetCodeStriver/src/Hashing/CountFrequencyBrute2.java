package Hashing;


public class CountFrequencyBrute2 {

    public static void main(String[] args) {
        int[]arr={1,2,3,2,1};
        int length=arr.length;

        boolean[] visited = new boolean[length];

        for (int i = 0; i < length; i++) {
            if(visited[i])continue;
            int count=1;
            for (int j = i+1; j <length ; j++) {
                if(arr[i]==arr[j]){
                    count++;
                    visited[j]=true;
                }
            }
            System.out.println(arr[i]+" "+ count);
        }

    }
}