package behavioral.state.states;

import behavioral.state.State;

public class PrevMusic implements State {
    @Override
    public void action() {
        System.out.println("Previous music");
    }
}
