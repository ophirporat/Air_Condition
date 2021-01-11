public class Operation extends State {
    public int C_temp;
    public int R_temp;
    public State cooling;
    public State fanning;
    public State heating;
    public On ONState;
    public State CurrState;

    public Operation(On on){
        cooling = new Cooling(this);
        fanning = new Fanning(this);
        heating = new Heating(this);
        ONState = on;
        C_temp = ONState.getC_temp();
        R_temp = ONState.getR_temp();
        CurrState = fanning;
    }

    @Override
    public void setCurrent_state(State st) {
        CurrState = st;
        st.entry();
    }

    public int getC_temp() {
        return C_temp;
    }

    public int getR_temp() {
        return R_temp;
    }
}

