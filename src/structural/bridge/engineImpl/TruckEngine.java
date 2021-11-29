package structural.bridge.engineImpl;

import structural.bridge.Engine;

public class TruckEngine implements Engine {
    private int power = 900;

    @Override
    public int infoEngine() {
        return power;
    }
}
