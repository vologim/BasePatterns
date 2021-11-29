package structural.bridge.engineImpl;

import structural.bridge.Engine;

public class SportEngine implements Engine {
    private int power = 500;

    @Override
    public int infoEngine() {
        return power;
    }
}
