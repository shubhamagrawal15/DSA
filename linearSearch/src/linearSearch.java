public class linearSearch {

    public static void main(String[] args) {
        int[] nums = {23,45,1,2,8,19,-3,16,-11,28};
        int target=-2;
        int ans = linearSearch1(nums,target);
        System.out.println(ans);
    }

    static int linearSearch1(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }

        for(int index=0;index<arr.length;index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }

        // this line will execute if none of te return statemnetns abopve have executed
        return -1;

    }
}
