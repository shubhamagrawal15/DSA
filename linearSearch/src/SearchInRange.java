public class SearchInRange {
    public static void main(String[] args) {

        // search for 3 in the range of index[1,4]
        int[] arr = {18,12,-7,3,14,28};
        int target = 18;
        int start=1;
        int end =4;
        System.out.println(findingNumber(arr,target,1,4));
    }

    static boolean findingNumber(int[]arr,int target,int start,int end){
        if(arr.length==0){
            return false;
        }
        for (int i = start; i <=end; i++) {
            if(arr[i]==target){
                return true;
            }

        }
        return false;
    }
}
