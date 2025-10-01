package Interfaces;

public class CDPlayer implements  Media{
    @Override
    public void start() {
        System.out.println("MUSIC START");
    }

    @Override
    public void stop() {
        System.out.println("MUSIC STOP");
    }
}
