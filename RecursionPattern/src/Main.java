//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//    pattern1(5);
        pattern1_1(5,0);
        pattern1_2(5,0);
    }

    // print pattern
    /*

    ****
    ***
    **
    *
    */

    static void pattern1(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <n-row; col++) {
                System.out.print('*' );
            }
            System.out.println();
        }
    }

    static void pattern1_1(int row,int col){
        if(row==0){
            return;
        }
        if(col<row){
            System.out.print("*");
            pattern1_1(row,col+1);
        }else{
            System.out.println();
            pattern1_1(row-1,0);
        }
    }
    static void pattern1_2(int row,int col){
        if(row==0){
            return;
        }
        if(col<row){
            pattern1_2(row,col+1);
            System.out.print("*");

        }else{
            pattern1_2(row-1,0);
            System.out.println();

        }
    }
}