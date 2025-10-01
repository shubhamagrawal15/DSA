package Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

     private int[] data;
     private  static int DEFAULT_SIZE=10;
     private  int size=0;


     CustomArrayList(){
         data = new int[DEFAULT_SIZE];
     }

     public void add(int num){
         if(isFull()) {
             resize();
         }
         data[size++]=num;
     }

     private boolean isFull(){
        return  size==data.length;
     }

     private void resize(){
         int[]temp=new int[data.length*2];

         //  copy the current items in the new array
         for (int i = 0; i < data.length; i++) {
             temp[i]=data[i];
         }

         data=temp;
     }

     public int remove(){
         int removedItem=data[--size];
         return removedItem;

     }

     public int get(int index){
         return data[index];
     }

     public int size(){
         return size;
     }

     public void set(int index,int value){
         data[index]=value;
     }

     @Override
    public String toString(){
        return Arrays.toString(data);
    }



    public static void main(String[] args) {
//        ArrayList list = new ArrayList<>();

        CustomArrayList list = new CustomArrayList();
        list.add(3);
        list.add(45);
        list.add(52);
        System.out.println(list);

    }

}


