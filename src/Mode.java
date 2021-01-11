class Mode extends State {
    public int C_temp;
    public int R_temp;
    public Cool cool;
    public Heat heat;
    public State currState ;
    public On on;

    @Override
    public void entry() {
    }

    @Override
    public void exit() {
        super.exit();
    }

    @Override
    public void setCurrent_state(State st) {
        this.currState = st;
        st.entry();
    }
    public void activate(){
        this.R_temp = on.getR_temp();
        this.C_temp = on.getC_temp();
        if (R_temp < C_temp) {
            if (currState != heat){
                setCurrent_state(this.heat);
            }
        }
        else {
            if (currState != cool) {
                setCurrent_state(this.cool);
            }
        }
    }

    public Mode(int c_temp, int r_temp) {
        this.cool = new Cool(this);
        this.heat = new Heat(this);
        C_temp = c_temp;
        R_temp = r_temp;

    }
}