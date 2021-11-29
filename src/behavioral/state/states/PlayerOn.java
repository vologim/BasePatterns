package behavioral.state.states;

import behavioral.state.State;

public class PlayerOn implements State {
    @Override
    public void action() {
        System.out.println("Player is on");
    }
}
