package Solid_Principles.LSP;

public class Cycle implements Bike{
    @Override
    public void turnOnEngine() throws Exception {
        throw new Exception("there is no engine");
    }

    @Override
    public void accelrate() {

    }
}
