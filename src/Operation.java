public class Operation extends State {
    public int C_temp;
    public int R_temp;
    public State cooling;
    public Fanning fanning;
    public State heating;
    public On ONState;
    public State CurrState;

    @Override
    public void entry() { }

    public Operation(On on){
        cooling = new Cooling(this);
        fanning = new Fanning(this);
        heating = new Heating(this);
        ONState = on;
        C_temp = ONState.getC_temp();
        R_temp = ONState.getR_temp();
        CurrState = fanning;
    }

    public void activate(){
        setCurrent_state(fanning);

    }

    @Override
    public void setCurrent_state(State st) {
        CurrState = st;
        st.entry();
    }
    public void setTemp(){
        int newC_temp = ONState.getC_temp();
        int newR_temp = ONState.getR_temp();
        if (newC_temp != C_temp) {
            C_temp = newC_temp;
            fanning.setC_temp(newC_temp);
        }
        if (newR_temp != R_temp){
            R_temp = newR_temp;
            fanning.setR_temp(newR_temp);

        }
    }
    public int getC_temp() {
        return C_temp;
    }

    public int getR_temp() {
        return R_temp;
    }
}

