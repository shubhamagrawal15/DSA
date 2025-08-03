package AbstractDemo;

public class Son extends  Parent{

    public Son(int age) {
        super(age);

    }

    @Override
    void career(){
        System.out.println("I am going to an  engineer " );

    }
    @Override
    void partner(){
        System.out.println("I wanna marry someone Her age is 22");
    }
}
