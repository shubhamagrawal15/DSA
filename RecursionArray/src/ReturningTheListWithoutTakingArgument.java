import java.util.ArrayList;

public class ReturningTheListWithoutTakingArgument {
    public static void main(String[] args) {
        int [] arr={1,4,8,9,7,5,5};
        int target=5;
        System.out.println(findAllIndexs(arr,target,0));

    }

    static ArrayList<Integer> findAllIndexs(int[]arr,int target,int start){
        ArrayList<Integer> list = new ArrayList<>();

        if(start==arr.length){
            return list;
        }

        // this will contain answer for that function call only
        if(arr[start]==target){
            list.add(start);
        }
       ArrayList<Integer> ansFromBelowCalls =  findAllIndexs(arr,target,start+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
