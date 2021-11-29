package behavioral.strategy.states;

import behavioral.strategy.State;

public class PlayerOff implements State {
    @Override
    public void action() {
        System.out.println("Player is off");
    }
}