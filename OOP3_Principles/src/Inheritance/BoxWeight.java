package Inheritance;

public class BoxWeight  extends Box {
    double weight;

    BoxWeight()
    {
        this.weight=-1;
    }

//    @Override   // cant override static because all the static methods   that are being inherited there is no point of overriding them
    // in the child class because the mthod in the parent  class will always run no matter form which object we clall it becoz they are static
    static void greeting(){
        System.out.println("Hey I m in a boxweight. Greetings!");
    }

    BoxWeight(BoxWeight other){
        super(other);
        weight=other.weight;
    }

    BoxWeight(double lenght,double height,double width,double weight){
        super(lenght, height, width); //calls the parent class constructor
        // used to initialize values present in parent class
        this.weight=weight;
    }

    BoxWeight(double side,double weight){
        super(side);
        this.weight= weight;
    }
}
