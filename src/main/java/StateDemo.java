/**
 * Created by Mingyi-PC on 02/10/2016.
 *
 * @author Mingyi-PC
 */
public class StateDemo {
    public static void main(String[] args) {
        StateContex contex = new StateContex();

        State indicative = new Indicative();
        indicative.doAction(contex);
        System.out.println(contex.getState().getCurrentState());
        State firm = new Firm();
        firm.doAction(contex);
        System.out.println(contex.getState().getCurrentState());
        State confirmed = new Confirmed();
        confirmed.doAction(contex);
        System.out.println(contex.getState().getCurrentState());
    }
}
