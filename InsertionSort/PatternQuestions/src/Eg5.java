public class Eg5 {
    public static void main(String[] args) {
   pattern5(5);

    }

    static void pattern5(int n){
        /*


         *
         **
         ***
         ****
         *****
         ****
         ***
         **
         *

         */


        /*
        for (int row = 1; row <=2*n-1 ; row++) {
           int totalNoofColmns = row>n ? 2*n-row:row;
            for (int col = 1; col <=totalNoofColmns ; col++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
       */


        for (int row = 1; row <=2*n-1 ; row++) {
            int noOfCol = row;
            if(row<=n) {
                for (int i = 1; i <= noOfCol; i++) {
                    System.out.print('*');
                }
                System.out.println(" ");
            }
            else{
                noOfCol=2*n-row;
                    for (int i = 1; i <=noOfCol ; i++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
            }
        }


    }

