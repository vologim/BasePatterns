package structural.adapter;

public class Iphone11 implements Charger{
    private final GooglePixel5a phone = new GooglePixel5a();

    @Override
    public void charging() {
        phone.chargingPhone();
    }

    @Override
    public void stopCharging() {
        phone.stopChargingPhone();
    }
}
