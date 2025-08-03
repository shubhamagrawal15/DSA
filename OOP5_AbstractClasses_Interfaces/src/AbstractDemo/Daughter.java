package AbstractDemo;

public class Daughter  extends  Parent{


    public Daughter(int age){
       super(age);
    }
    @Override
    void career(){
        System.out.println("I am going to a  docotro");

    }
    @Override
    void partner(){
        System.out.println("I wanna marry someone  His age is 28 ");
    }
}
