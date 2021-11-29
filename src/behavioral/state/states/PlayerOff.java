package behavioral.state.states;

import behavioral.state.State;

public class PlayerOff implements State {
    @Override
    public void action() {
        System.out.println("Player is off");
    }
}
