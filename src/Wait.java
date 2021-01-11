public class Wait extends State{

    public Wait(AirConditioner airConditioner){
        AirConditioner context = airConditioner;
    }

    @Override
    public void setCurrent_state(State st) {}


    @Override
    public void entry(){
        System.out.println("WAITING 30 SECONDS");

    }

}
