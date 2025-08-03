package interfaces;

public class CDPlayer implements  Media{
    @Override
    public void start() {
        System.out.println("I start a media player like a normal car");
    }

    @Override
    public void stop() {
        System.out.println(" I stop media player like a normal car");
    }
}
