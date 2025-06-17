import java.util.ArrayList;

public class FindItemAndItsDuplicate {
    public static void main(String[] args) {
        int [] arr={1,2,4,6,4,3,2,1};
        findAllIndex(arr,4,0);
        System.out.println(list);

    }

     static ArrayList<Integer> list=new ArrayList<>();
    static void findAllIndex(int[]arr,int item,int start){
        if(start==arr.length){
            return;
        }
        if(arr[start]==item){
            list.add(start);
        }
        findAllIndex(arr, item, start + 1);
    }

    // another approach
    static ArrayList<Integer> findAllIndex(int[]arr,int item,int start,ArrayList<Integer> list){
        if(start==arr.length){
            return list;
        }
        if(arr[start]==item){
            list.add(start);
        }
        return findAllIndex(arr, item, start + 1,list);
    }
}
