/**
 * Created by Mingyi-PC on 02/10/2016.
 *
 * @author Mingyi-PC
 */
public class Indicative implements State {
    public Indicative() {
    }

    public String getCurrentState() {
        return "indicative";
    }

    public void doAction(StateContex stateContex) {
        System.out.println("Starting Indicative");
        stateContex.setState(this);
    }
}
