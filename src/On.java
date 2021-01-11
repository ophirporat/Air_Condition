public class On extends State {
    Mode mode;
    Operation Operation;
    State airConditioner;
//    State currentState;
    public int C_temp;
    public int R_temp;

    @Override
    public void entry() {
        System.out.println("ON");
        mode.activate();
        Operation.activate();
    }

    public On(State airConditioner, int c_temp, int r_temp) {
        this.airConditioner = airConditioner;
        this.Operation = new Operation(this);
        this.mode = new Mode(c_temp, r_temp,this);
        C_temp = c_temp;
        R_temp = r_temp;
    }

    @Override
    public void setCurrent_state(State st) {

    }

    public int getC_temp() {
        return C_temp;
    }

    public int getR_temp() {
        return R_temp;
    }

    public void setC_temp(int C_temp) {
        this.C_temp = C_temp;
        mode.activate();
        Operation.activate();
    }

    public void setR_temp(int R_temp) {

        this.R_temp = R_temp;
        mode.activate();
        Operation.activate();
    }



}
