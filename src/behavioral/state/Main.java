package behavioral.state;

import behavioral.state.states.PlayerOn;

public class Main {
    public static void main(String[] args) {
        Player player = new Player(new PlayerOn());

        for(int i = 0; i < 10; i++){
            player.getState();
            player.changeState();
        }
    }
}
