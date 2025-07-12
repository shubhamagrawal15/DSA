package AnotherPackage;

import Access.A;

import javax.xml.transform.Source;

public class Subclass extends A {

    Subclass(int num,String name){
        super(num,name);
    }


    public static void main(String[] args) {
//        A a = new A(45,"shub");
//        System.out.println(a.num);
        Subclass obj = new Subclass(49,"shub");
        System.out.println(obj.num);
    }
}



