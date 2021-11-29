package behavioral.strategy.states;

import behavioral.strategy.State;

public class PrevMusic implements State {
    @Override
    public void action() {
        System.out.println("Previous music");
    }
}