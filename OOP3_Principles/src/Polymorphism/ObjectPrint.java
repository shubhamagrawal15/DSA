package Polymorphism;

public class ObjectPrint {
     int number;
     ObjectPrint(int num){
         this.number = num;
     }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(54);
        System.out.println(obj);
    }
}
