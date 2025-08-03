package extendDemo2;

public interface A {
    // static interface methods should  have a body becoz inheritance means if we inherrit it we will have to overriide it this implies it depemd on object bt static does nt depened on object
    // call via the interface  name
    static void greeting(){
        System.out.println("hey  i am statci methdo");
    };

   default void fun(){
       System.out.println("I m in A");
   };
}
