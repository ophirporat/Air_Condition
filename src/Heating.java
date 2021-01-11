public class Heating extends State {
    @Override
    public void entry() {
        System.out.println("OPERATION-HEATING");
    }

    @Override
    public void setCurrent_state(State st) {

    }
}
