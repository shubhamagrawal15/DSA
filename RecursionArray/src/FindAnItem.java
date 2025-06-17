public class FindAnItem {
    public static void main(String[] args) {
        /*
        int[]arr={1,2,3,4,5,6,9,10};
        int item=6;
        int ans=ItemIndex(arr,6);
        System.out.println(ans);

         */

        int[] arr2={1,5,7,6,8,2,9,3};
        int ans=itemSearch(arr2,6,0);
//        System.out.println(ans);
        if(itemSearch2(arr2,11,0)){
            System.out.println("item found");
        }
        else{
            System.out.println("item not found");
        }


    }
    static int ItemIndex(int[]arr,int item){
        // if we are going through binary search then only sorted elements can be searched in
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid = (end-start)/2+start;
            if(arr[mid]==item){
                return mid;
            }
            else if(item<arr[mid]){
                    end=mid-1;
            }else{
                start=mid+1;
            }

        }
        return -1;
    }


    static int itemSearch(int[]arr,int item,int start){
        if(start==arr.length){
            return -1;
        }
        if(arr[start]==item){
            return start;
        }
        return itemSearch(arr,item,start+1);

    }

    static boolean itemSearch2(int[]arr,int item,int start){
        if (start==arr.length){
            return false;
        }
        return arr[start]==item || itemSearch2(arr,item,start+1);

    }


}
