package behavioral.momento;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Warrior warrior = new Warrior("Thrall", "Shadowmourne");
        Save save = warrior.save();

        while (true){

            if(warrior.isDead()){
                warrior.load(save);
                Thread.sleep(1000);
                continue;
            }
            else {
                save = warrior.save();
                System.out.println(warrior.getHealth());
            }

            warrior.wound();

            Thread.sleep(1000);
        }
    }
}
