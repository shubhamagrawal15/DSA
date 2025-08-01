public class findAllNumberDisappearedArray {
    public static void main(String[] args) {
        int[]arr={4,3,2,7,8,2,3,1};
        System.out.println();
    }
    static int MissingNumber(int[]arr){
        // check swap and move i to the beginning;
        int i=0;
        while(i<arr.length){
            int CorrectIndex = arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[CorrectIndex]){
                swap(arr,i,CorrectIndex);
            }else{
                i++;
            }
        }

        // search for firstMissig Number
        for (int index=0;index< arr.length;index++){
            if(arr[index]!=index){
                return index;
            }
        }
        // Case 2
        return arr.length;
    }

    static void swap(int[]arr,int first,int second)
    {
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
