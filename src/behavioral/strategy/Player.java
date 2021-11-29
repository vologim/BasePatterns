package behavioral.strategy;

public class Player {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void executeState(){
        state.action();
    }
}
