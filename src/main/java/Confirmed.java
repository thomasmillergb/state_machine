/**
 * Created by Mingyi-PC on 02/10/2016.
 *
 * @author Mingyi-PC
 */
public class Confirmed implements State {
    public Confirmed() {
    }

    public String getCurrentState() {
        return "confirmed";
    }

    public void doAction(StateContex stateContex) {
        System.out.println("Starting Comfirmed");
        stateContex.setState(this);
    }
}
