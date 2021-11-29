package behavioral.strategy.states;

import behavioral.strategy.State;

public class NextMusic implements State {
    @Override
    public void action() {
        System.out.println("Next music");
    }
}
