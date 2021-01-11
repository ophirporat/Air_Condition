public class Wait extends State{
    AirConditioner context;
    public Wait(AirConditioner airConditioner){

        context = airConditioner;
    }

    @Override
    public void setCurrent_state(State st) {}


    @Override
    public void entry(){
        System.out.println("WAITING 30 SECONDS");
        }



}
