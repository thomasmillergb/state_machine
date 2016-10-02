package coreStateMachine;


import coreStateMachine.state.State;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Mingyi-PC on 02/10/2016.
 *
 * @author Mingyi-PC
 */
public class StateDemo {
    private List<State> states;
    private StateContex stateContex;

    public StateDemo() {
    }

    public static void main(String[] args) {
        ApplicationContext springContex = new ClassPathXmlApplicationContext("classpath:/Beans.xml");
        StateDemo state = (StateDemo) springContex.getBean("state");
        state.start();
//        State indicative = new Indicative();
//        indicative.doAction(contex);
//        System.out.println(contex.getState().getCurrentState());
//        State firm = new Firm();
//        firm.doAction(contex);
//        System.out.println(contex.getState().getCurrentState());
//        State confirmed = new Confirmed();
//        confirmed.doAction(contex);
//        System.out.println(contex.getState().getCurrentState());
    }

    public List<State> getStates() {
        return states;
    }

    public void setStates(List<State> states) {
        this.states = states;
    }

    public void setStateContex(StateContex stateContex) {
        this.stateContex = stateContex;
    }


    public void start() {
        for (State state : states) {
            state.doAction(stateContex);
            System.out.println(stateContex.getState().getCurrentState());
        }
    }
}
