import java.util.Arrays;
public class Eg {
        public static void main(String[] args) {
            String name = "jithin";
            System.out.println(name);
            changeName(name);
            System.out.println(name);


            int a=30;
            System.out.println(a);
            changeInt(a);
            System.out.println(a);

            int[]arr={1,2,3,4,4};
            System.out.println(Arrays.toString(arr));
            changeArr(arr);
            System.out.println(Arrays.toString(arr));

        }

        static void changeName( String name){
            name ="cha2wal";
            System.out.println(name);

        }
        static void changeInt( int a){
            System.out.println(a);
            a=3;
            System.out.println(a);
        }
        static void changeArr(int[]arr){
            arr[0]=5;
        }

    }

