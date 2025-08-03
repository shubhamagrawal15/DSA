package interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();

//        car.accelerate();
//        car.brake();
//          car.stop();
/*
       Media mediaCar = new Car();
       mediaCar.stop();
        System.out.println(mediaCar.a);


        CDPlayer player = new CDPlayer();
        player.stop();

        PowerEngine engine = new PowerEngine();
        engine.start();
        engine.stop();
        engine.accelerate();


        ElectricEngine eEngine= new ElectricEngine();
        eEngine.start();
*/


        FinalCar car = new FinalCar();
        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();




    }
}
