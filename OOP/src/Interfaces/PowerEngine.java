package Interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("I start like a powerEngine");
    }

    @Override
    public void stop() {
        System.out.println("POWER ENGINE STOP");
    }

    @Override
    public void acc() {
        System.out.println("POWER ENGINE ACCELERATE");
    }
}
