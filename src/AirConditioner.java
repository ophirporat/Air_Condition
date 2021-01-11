public class AirConditioner {

    public int C_temp;
    public int R_temp;
    public State off;
    public State wait;
    public State on;

    public void on(){}

    public void off(){}

    public void setC_temp(int temp){
        C_temp = temp;
    }

    public void setR_temp(int temp){
        R_temp = temp;
    }

}
