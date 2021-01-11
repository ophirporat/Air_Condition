class Mode extends State {
    public int C_temp;
    public int R_temp;
    public State cool;
    public State heat;
    public State currState ;

    @Override
    public void entry() {
        super.entry();
    }

    @Override
    public void exit() {
        super.exit();
    }

    @Override
    public void setCurrent_state(State st) {

    }

    public Mode(int c_temp, int r_temp) {
        this.cool = new Cool(this);
        this.heat = new Heat(this);
        C_temp = c_temp;
        R_temp = r_temp;
        if (R_temp <C_temp) {
           currState = this.heat;
        }
        else currState = this.cool;
    }
}