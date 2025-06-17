public class ArraySortedOrNot {
    public static void main(String[] args) {
        int[]arr={1,4,2,8,10};

        if(recursionSortingTest2(arr,0)){
            System.out.println("array is sorted");
        }
        else{
            System.out.println("array is not sorted");
        }
    }

    static boolean sortedOrNot(int[]arr){
        int start=0;
        int len = (int)(arr.length-1);
        while(start<len){
         if(arr[start]<arr[start+1]){
             start++;
         }else{
            return false;
         }
        }
        return true;
    }

    static boolean recursionSortingTest(int[]arr,  int start){
        if(start==arr.length-1){
            return true;
        }
        if(arr[start]<=arr[start+1]){
           return recursionSortingTest(arr,start+1);
        }
        else {
            return false;
        }

    }

    static boolean recursionSortingTest2(int []arr,int index){
        if(index==arr.length-1){
            return true;
        }
        return  arr[index]<arr[index+1]&&recursionSortingTest2(arr,index+1);
    }
}
