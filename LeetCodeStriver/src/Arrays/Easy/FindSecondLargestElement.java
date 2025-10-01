package Arrays.Easy;

public class FindSecondLargestElement {
    public static void main(String[] args) {

        /*
        int[]arr={8,8,7,6,5};
        int max = Integer.MIN_VALUE;
        int minimum=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
        for (int i = 0; i < arr.length; i++) {
            if(max-arr[i]!=0 && max-arr[i]>minimum){
                minimum=Math.max(minimum,arr[i]);
            }
        }
        System.out.println(minimum);
*/

        int[]arr={10,10,10,10,10,10};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int num:arr){
            if(num>first){
                second=first;
                first=num;
            } else if (num>second && num<first) {
                second=num;
            }
        }
        if(second==Integer.MIN_VALUE) System.out.println("0");
        else System.out.println(second);
    }
}
