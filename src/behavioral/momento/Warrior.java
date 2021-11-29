package behavioral.momento;

public class Warrior {
    private String name;
    private int health;
    private String weapon;

    public Warrior(String name, String weapon) {
        this.name = name;
        this.health = 100;
        this.weapon = weapon;
    }

    public Save save(){
        return new Save(name, health, weapon);
    }

    public void load(Save save){
        name = save.getName();
        health = save.getHealth();
        weapon = save.getWeapon();
        System.out.println("warrior is loaded:" +
                            name + "\n" + health + "\n" + weapon);
    }

    public void wound(){
        health -= 25;
        System.out.println("Health: " + health);
    }

    public boolean isDead(){
        if(health <= 0){
            return true;
        }
        return false;
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
