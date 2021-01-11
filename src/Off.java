public class Off extends State{
    AirConditioner context;
    public Off(AirConditioner airCondition){
        context = airCondition;
    }
    @Override
    public void setCurrent_state(State st) {}
    @Override
    public void entry(){
        System.out.println("OFF");
    }
}
