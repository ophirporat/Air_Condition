public class AirConditioner extends State{

    public int C_temp;
    public int R_temp;
    public Off off;
    public Wait wait;
    public On on;
    public State cur_state;

    public AirConditioner() {
        this.C_temp = 25;
        this.R_temp = 25;

        this.wait = new Wait(this);
        this.on = new On(this, this.C_temp, this.R_temp);
        this.off = new Off(this);
        this.cur_state = this.off;
    }

    public void on(){
        wait.entry();
    }

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
