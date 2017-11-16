package sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Controller {
    private List<State> currentStates;
    private StateRule rules;

    Controller() {
        rules = new StateRule();
        reset();
    }

    Boolean isPassed() {
        for (State state : currentStates) {
            if (getAcceptedState().contains(state))
                return true;
        }
        return false;
    }

    void updateCurrentStates(Sign sign) {
        if (currentStates.isEmpty())
            return;

        List<State> newestStates = new ArrayList<>();
        for (State state : currentStates) {
            List<State> statesForSign = getRulesForState(state).get(sign);
            if (null != statesForSign)
                newestStates.addAll(statesForSign);
        }
        currentStates = newestStates;
    }

    private List<State> getAcceptedState() {
        return rules.getAcceptedState();
    }

    private Map<State, Map<Sign, List<State>>> getRules() {
        return rules.getRules();
    }

    private Map<Sign, List<State>> getRulesForState(State state) {
        return getRules().get(state);
    }

    String getCurrentStates() {
        StringBuilder sb = new StringBuilder();
        for (State s : currentStates) {
            if (sb.length() != 0)
                sb.append(",");
            sb.append(s);
        }

        return sb.toString();
    }

    void reset() {
        currentStates = new ArrayList<>();
        currentStates.add(State.Q0);
    }
}
