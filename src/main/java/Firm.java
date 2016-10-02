/**
 * Created by Mingyi-PC on 02/10/2016.
 *
 * @author Mingyi-PC
 */
public class Firm implements State {
    public Firm() {
    }

    public String getCurrentState() {
        return "firm";
    }

    public void doAction(StateContex stateContex) {
        System.out.println("Starting Firm");
        stateContex.setState(this);
    }
}
