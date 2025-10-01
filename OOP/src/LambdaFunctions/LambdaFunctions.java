package LambdaFunctions;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            list.add(i+1);
        }

//        list.forEach((item)->System.out.print(item*2));
        Consumer<Integer> fun = (item)-> System.out.println(item*2);

        list.forEach(fun);


        LambdaFunctions myCalculator = new LambdaFunctions();
        System.out.println();

    }

    int sum(int a,int b){
        return a+b;
    }

    // one line function
    Operation sum =(a,b)->a+b;
    Operation prod =(a,b)->a*b;
    Operation sub = (a,b)->a-b;



    private  int operate(int a,int b,Operation op){
        return op.operation(a,b);
    }

}


interface Operation{
    int operation(int a,int b);
}