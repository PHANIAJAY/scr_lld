package Solid_Principles.LSP;

public class MotorCycle implements Bike{
    boolean engine;
    int speed;
    @Override
    public void turnOnEngine()  {
        engine=true;
    }

    @Override
    public void accelrate() {
     speed*=10;
    }
}
