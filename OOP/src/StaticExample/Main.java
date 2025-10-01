package StaticExample;

public class Main {
    public static void main(String[] args) {
        Human kunal = new Human(22,"kunal",10000,false);
        Human rahul = new Human(22,"rahul",5000,true);

        System.out.println(kunal.population);
        System.out.println(rahul.population);


//        greeting();
    }

    static  void fun(){
        Main obj = new Main();
        obj.greeting();
    }


    // we know somthing which is not static belongs to object
    void greeting(){
        System.out.println("heelo wordl");
    }
}
