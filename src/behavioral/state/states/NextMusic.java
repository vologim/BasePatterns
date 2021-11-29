package behavioral.state.states;

import behavioral.state.State;

public class NextMusic implements State {
    @Override
    public void action() {
        System.out.println("Next music");
    }
}
