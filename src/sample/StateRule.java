package sample;

import java.util.*;

/**
 * Created by Michał on 2017-11-14.
 */
public class StateRule {
    private List<State> acceptedState;
    private Map<State, Map<Sign, List<State>>> rules;

    StateRule() {
        acceptedState = new ArrayList<>();
        rules = new HashMap<>();
        loadAcceptedStates();
        loadAllRules();
    }

    private void loadAcceptedStates() {
        acceptedState.add(State.Q2);
        acceptedState.add(State.Q3);
        acceptedState.add(State.Q4);
        acceptedState.add(State.Q6);
        acceptedState.add(State.Q7);
        acceptedState.add(State.Q8);
        acceptedState.add(State.Q9);
        acceptedState.add(State.Q11);
        acceptedState.add(State.Q12);
    }

    private void loadAllRules() {
        loadForQ0();
        loadForQ01();
        loadForQ2();
        loadForQ3();
        loadForQ4();
        loadForQ5();
        loadForQ6();
        loadForQ7();
        loadForQ8();
        loadForQ9();
        loadForQ10();
        loadForQ11();
        loadForQ12();
    }

    private void loadForQ0() {
        Map<Sign, List<State>> rules = new HashMap<>();
        rules.put(Sign.Plus, Collections.singletonList(State.Q1));
        rules.put(Sign.Minus, Collections.singletonList(State.Q1));
        rules.put(Sign.Zero, Collections.singletonList(State.Q2));
        rules.put(Sign.One, Collections.singletonList(State.Q3));
        rules.put(Sign.Two, Collections.singletonList(State.Q4));
        rules.put(Sign.Three, Collections.singletonList(State.Q4));
        rules.put(Sign.Four, Collections.singletonList(State.Q4));
        rules.put(Sign.Five, Collections.singletonList(State.Q4));
        rules.put(Sign.Six, Collections.singletonList(State.Q4));
        rules.put(Sign.Seven, Collections.singletonList(State.Q4));
        rules.put(Sign.Eight, Collections.singletonList(State.Q4));
        rules.put(Sign.Nine, Collections.singletonList(State.Q4));
        addRules(State.Q0, rules);
    }

    private void loadForQ01() {
        Map<Sign, List<State>> rules = new HashMap<>();
        rules.put(Sign.Zero, Collections.singletonList(State.Q2));
        rules.put(Sign.One, Arrays.asList(State.Q2, State.Q3));
        rules.put(Sign.Two, Collections.singletonList(State.Q2));
        rules.put(Sign.Three, Collections.singletonList(State.Q2));
        rules.put(Sign.Four, Collections.singletonList(State.Q2));
        rules.put(Sign.Five, Collections.singletonList(State.Q2));
        rules.put(Sign.Six, Collections.singletonList(State.Q2));
        rules.put(Sign.Seven, Collections.singletonList(State.Q2));
        rules.put(Sign.Eight, Collections.singletonList(State.Q2));
        rules.put(Sign.Nine, Collections.singletonList(State.Q2));
        addRules(State.Q1, rules);
    }

    private void loadForQ2() {
        Map<Sign, List<State>> rules = new HashMap<>();
        rules.put(Sign.Comma, Collections.singletonList(State.Q5));
        addRules(State.Q2, rules);
    }

    private void loadForQ3() {
        Map<Sign, List<State>> rules = new HashMap<>();
        rules.put(Sign.Comma, Collections.singletonList(State.Q5));
        rules.put(Sign.Zero, Collections.singletonList(State.Q9));
        addRules(State.Q3, rules);
    }

    private void loadForQ4() {
        Map<Sign, List<State>> rules = new HashMap<>();
        rules.put(Sign.Comma, Collections.singletonList(State.Q5));
        addRules(State.Q4, rules);
    }

    private void loadForQ5() {
        Map<Sign, List<State>> rules = new HashMap<>();
        rules.put(Sign.Zero, Collections.singletonList(State.Q6));
        rules.put(Sign.One, Collections.singletonList(State.Q6));
        rules.put(Sign.Two, Collections.singletonList(State.Q6));
        rules.put(Sign.Three, Collections.singletonList(State.Q6));
        rules.put(Sign.Four, Collections.singletonList(State.Q6));
        rules.put(Sign.Five, Collections.singletonList(State.Q6));
        rules.put(Sign.Six, Collections.singletonList(State.Q6));
        rules.put(Sign.Seven, Collections.singletonList(State.Q6));
        rules.put(Sign.Eight, Collections.singletonList(State.Q6));
        rules.put(Sign.Nine, Collections.singletonList(State.Q6));
        addRules(State.Q5, rules);
    }

    private void loadForQ6() {
        Map<Sign, List<State>> rules = new HashMap<>();
        rules.put(Sign.Zero, Collections.singletonList(State.Q7));
        rules.put(Sign.One, Collections.singletonList(State.Q7));
        rules.put(Sign.Two, Collections.singletonList(State.Q7));
        rules.put(Sign.Three, Collections.singletonList(State.Q7));
        rules.put(Sign.Four, Collections.singletonList(State.Q7));
        rules.put(Sign.Five, Collections.singletonList(State.Q7));
        rules.put(Sign.Six, Collections.singletonList(State.Q7));
        rules.put(Sign.Seven, Collections.singletonList(State.Q7));
        rules.put(Sign.Eight, Collections.singletonList(State.Q7));
        rules.put(Sign.Nine, Collections.singletonList(State.Q7));
        addRules(State.Q6, rules);
    }

    private void loadForQ7() {
        Map<Sign, List<State>> rules = new HashMap<>();
        rules.put(Sign.Zero, Collections.singletonList(State.Q8));
        rules.put(Sign.One, Collections.singletonList(State.Q8));
        rules.put(Sign.Two, Collections.singletonList(State.Q8));
        rules.put(Sign.Three, Collections.singletonList(State.Q8));
        rules.put(Sign.Four, Collections.singletonList(State.Q8));
        rules.put(Sign.Five, Collections.singletonList(State.Q8));
        rules.put(Sign.Six, Collections.singletonList(State.Q8));
        rules.put(Sign.Seven, Collections.singletonList(State.Q8));
        rules.put(Sign.Eight, Collections.singletonList(State.Q8));
        rules.put(Sign.Nine, Collections.singletonList(State.Q8));
        addRules(State.Q7, rules);
    }

    private void loadForQ8() {
        Map<Sign, List<State>> rules = new HashMap<>();
        rules.put(Sign.Zero, Collections.singletonList(State.Q8));
        rules.put(Sign.One, Collections.singletonList(State.Q8));
        rules.put(Sign.Two, Collections.singletonList(State.Q8));
        rules.put(Sign.Three, Collections.singletonList(State.Q8));
        rules.put(Sign.Four, Collections.singletonList(State.Q8));
        rules.put(Sign.Five, Collections.singletonList(State.Q8));
        rules.put(Sign.Six, Collections.singletonList(State.Q8));
        rules.put(Sign.Seven, Collections.singletonList(State.Q8));
        rules.put(Sign.Eight, Collections.singletonList(State.Q8));
        rules.put(Sign.Nine, Collections.singletonList(State.Q8));
        addRules(State.Q8, rules);
    }

    private void loadForQ9() {
        Map<Sign, List<State>> rules = new HashMap<>();
        rules.put(Sign.Comma, Collections.singletonList(State.Q10));
        addRules(State.Q9, rules);
    }

    private void loadForQ10() {
        Map<Sign, List<State>> rules = new HashMap<>();
        rules.put(Sign.Zero, Collections.singletonList(State.Q11));
        addRules(State.Q10, rules);
    }

    private void loadForQ11() {
        Map<Sign, List<State>> rules = new HashMap<>();
        rules.put(Sign.Zero, Collections.singletonList(State.Q12));
        addRules(State.Q11, rules);
    }

    private void loadForQ12() {
        Map<Sign, List<State>> rules = new HashMap<>();
        rules.put(Sign.Zero, Collections.singletonList(State.Q8));
        addRules(State.Q12, rules);
    }

    private void addRules(State state, Map<Sign, List<State>> rules) {
        this.rules.put(state, rules);
    }

    public List<State> getAcceptedState() {
        return acceptedState;
    }

    public Map<State, Map<Sign, List<State>>> getRules() {
        return rules;
    }

    public Map<Sign, List<State>> getRulesForState(State state) {
        return rules.get(state);
    }
}
