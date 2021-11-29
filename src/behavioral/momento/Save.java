package behavioral.momento;

public class Save {
    private final String name;
    private final int health;
    private final String weapon;

    public Save(String name, int health, String weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public String getWeapon() {
        return weapon;
    }
}
