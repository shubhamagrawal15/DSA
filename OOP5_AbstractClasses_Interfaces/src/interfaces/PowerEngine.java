package interfaces;

public class PowerEngine  implements  Engine{
    @Override
    public void start()  {
        System.out.println("Power engine satrt");
    }

    @Override
    public void stop() {
        System.out.println("Pweer engine stop");
    }

    @Override
    public void accelerate() {
        System.out.println("Power engien  accelerate ");
    }
}
