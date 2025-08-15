package Generics;

import java.util.Arrays;

public class CustomGenericArrayList<T> {
    private Object[] data;

    private int DEFAULT_SIZE = 10;

    private int size=0;  // also working as index

    public CustomGenericArrayList(){

        data = new Object[DEFAULT_SIZE];
    }

    public  void add(T num){
        if(isFull()){
            resize();
        }
        data[size++]=num;

    }

    private boolean isFull(){
        return size==data.length;
    }

    private void resize(){
        Object [] temp=new Object[data.length*2];

        // copy the current items in the new array

        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }

        data=temp;
    }


    public T remove(){
        T removedItem=(T)data[--size];
        return removedItem;
    }

    public T get(int index){

        return (T) data[index];
    }


    public int size(){
        return size;
    }

    public void set(int index,T value){
        data[index]=value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", DEFAULT_SIZE=" + DEFAULT_SIZE +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
        CustomArrayList list= new CustomArrayList();
//        list.add(3);
//        list.add(5);
//        list.add(9);

        for (int i = 0; i <14 ; i++) {
            list.add(2*i);
        }


        System.out.println(list);
    }
}
