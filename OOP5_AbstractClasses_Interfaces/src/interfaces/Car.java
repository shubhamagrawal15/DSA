package interfaces;

public class Car implements Engine,Brake,Media {

    int b =20;


    @Override
    public void brake() {
        System.out.println("i brake like a normal car");

    }

    @Override
    public void start()  {
        System.out.println("i start like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("i stop engine like a normal car");
    }

    @Override
    public void accelerate() {
        System.out.println("i accelerate like a normal car");
    }


}
