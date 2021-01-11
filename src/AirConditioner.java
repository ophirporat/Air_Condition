public class AirConditioner extends State{

    public int C_temp;
    public int R_temp;
    public Off off;
    public Wait wait;
    public On on;
    public State cur_state;

    public void on(){}

    public void off(){}

    public void setC_temp(int temp){
        C_temp = temp;
    }

    public void setR_temp(int temp){
        R_temp = temp;
    }

    @Override
    public void entry() {

    }

    @Override
    public void setCurrent_state(State st) {
        cur_state = st;
        st.entry();
    }
}
