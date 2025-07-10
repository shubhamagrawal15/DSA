package Inheritance;

public class BoxPrice extends  BoxWeight{
    double cost;



    BoxPrice(){
        super();
        this.cost = cost;
    }

    BoxPrice(BoxPrice other){
        super(other);
        this.cost = other.cost;
    }

    BoxPrice(double length,double height,double width,double weight,double cost){
        super(length,weight,width,cost);
        this.cost=cost;
    }
    BoxPrice(double side,double weight,double cost){
        super(side,weight);
        this.cost=cost;
    }
}
