package Interfaces;

public class ElectricEngine  implements Engine{


    @Override
    public void start() {
        System.out.println("Electrical Engine Started");
    }

    @Override
    public void stop() {
        System.out.println("Electrical Engine Stopped");
    }

    @Override
    public void acc() {
        System.out.println("Electrical Engine accelerates");
    }
}
