package Interfaces;

public class Main {
    public static void main(String[] args) {

        /*
        Car  car = new Car();
//        car.start();
//        car.acc();
//        car.stop();
//        car.brake();

        Media carMedia = new Car();
        carMedia.start();
        carMedia.stop();
*/

        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();

        // changing the engine
        car.upgradeEngine();
        car.start();


    }
}
