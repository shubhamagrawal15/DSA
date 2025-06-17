public class Conditionals {
    public static void main(String[] args) {

        /*
        Syntax of if statement
        if(boolean expression){
        }else{
        }
         */

        int salary = 25400;
        if(salary>10000){
            salary=salary+2000;
        }else{
            salary=salary+1000;
        }
//        System.out.println(salary);



        // multiple if and else statements
        if(salary>10000){
            salary+=2000;
        }else if(salary>20000){
            salary+=3000;
        }else{
            salary+=1000;
        }

        System.out.println(salary);


    }
}
