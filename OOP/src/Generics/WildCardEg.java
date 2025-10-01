package Generics;

import Interfaces.NiceCar;

import java.util.Arrays;
import java.util.List;

public class WildCardEg<T extends Number> {

     private Object[] data;
     private  static int DEFAULT_SIZE=10;
     private  int size=0;


      WildCardEg(){
         data = new Object[DEFAULT_SIZE];
      }

      public void getList(List<?extends Number> list){

      }

     public void add(Object num){
         if(isFull()) {
             resize();
         }
         data[size++]=num;
     }

     private boolean isFull(){
        return  size==data.length;
     }

     private void resize(){
         Object[]temp=new Object[data.length*2];

         //  copy the current items in the new array
         for (int i = 0; i < data.length; i++) {
             temp[i]=data[i];
         }

         data=temp;
     }

     public T remove(){
         T removedItem=(T)(data[--size]);
         return removedItem;

     }

     public T get(int index){
         return (T)data[index];
     }

     public int size(){
         return size;
     }

     public void set(int index,T value){
         data[index]=value;
     }

     @Override
    public String toString(){
        return Arrays.toString(data);
    }



    public static void main(String[] args) {
//        ArrayList list = new ArrayList<>();

//        CustomGenericsArrayList list = new CustomGenericsArrayList();
//        list.add(3);
//        list.add(45);
//        list.add(52);
//        System.out.println(list);


        WildCardEg<Integer> list = new WildCardEg<>();
          list.add(3);
          list.add(45);
          list.add(52);

        System.out.println(list);



    }

}


