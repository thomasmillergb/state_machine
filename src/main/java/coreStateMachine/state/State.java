package coreStateMachine.state;


import coreStateMachine.StateContex;

/**
 * Created by Mingyi-PC on 02/10/2016.
 *
 * @author Mingyi-PC
 */
public interface State {

    String getCurrentState();
    void doAction(StateContex stateContex);
}
