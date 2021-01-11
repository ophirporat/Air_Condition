public class Off extends State{

    public Off(AirConditioner airCondition){
        AirConditioner context = airCondition;
    }
    @Override
    public void setCurrent_state(State st) {}
    @Override
    public void entry(){
        System.out.println("OFF");
    }
}
