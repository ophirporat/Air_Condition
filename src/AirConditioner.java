public class AirConditioner extends State{

    public int C_temp;
    public int R_temp;
    public Off off;
    public Wait wait;
    public On on;
    public State cur_state;

    public AirConditioner() {
//        this.C_temp = 25;
//        this.R_temp = 25;
        this.wait = new Wait(this);
        this.on = new On(this, 25, 25);
        this.off = new Off(this);
        setCurrent_state(off);
    }

    public void on(){
        wait.entry();
        setCurrent_state(on);
    }

    public void off(){}

    public void setC_temp(int temp){
        C_temp = temp;
        on.setR_temp(temp);
        System.out.println("set c_temp to" + temp);
    }

    public void setR_temp(int temp){
        R_temp = temp;
        on.setR_temp(temp);
        System.out.println("set r_temp to" + temp);
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
