/**
 * Created by Mingyi-PC on 02/10/2016.
 *
 * @author Mingyi-PC
 */
public class StateContex {
    private State state;

    public StateContex() {
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
