package behavioral.state;

import behavioral.state.states.NextMusic;
import behavioral.state.states.PlayerOff;
import behavioral.state.states.PlayerOn;
import behavioral.state.states.PrevMusic;

public class Player {
    private State state;

    public Player(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void changeState(){
        if (state instanceof PlayerOn){
            setState(new NextMusic());
        }
        else if (state instanceof NextMusic){
            setState(new PrevMusic());
        }
        else if (state instanceof PrevMusic){
            setState(new PlayerOff());
        }
        else if (state instanceof PlayerOff){
            setState(new PlayerOn());
        }
    }

    public void getState(){
        state.action();
    }
}
