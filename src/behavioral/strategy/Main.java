package behavioral.strategy;

import behavioral.strategy.states.NextMusic;
import behavioral.strategy.states.PlayerOff;
import behavioral.strategy.states.PlayerOn;
import behavioral.strategy.states.PrevMusic;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();

        player.setState(new PlayerOn());
        player.executeState();

        player.setState(new NextMusic());
        player.executeState();

        player.setState(new PrevMusic());
        player.executeState();

        player.setState(new PlayerOff());
        player.executeState();
    }
}
