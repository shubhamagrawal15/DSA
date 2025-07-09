package com.shubham.staticEg;

// we cant make outside classes static ---because it is not itself depenedent on other classs
 public class InnerClasses {
     static class Test{
      String name;
      Test(String name){
         this.name=name;
        }


    }


    public static void main(String[] args) {
        Test a = new Test("Shubham");
        Test b = new Test("Kunal");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
