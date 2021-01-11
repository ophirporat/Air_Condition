public class Heating extends State {

    private Operation context;

    public Heating(Operation context) {
        this.context = context;
    }

    @Override
    public void entry() {
        System.out.println("OPERATION-HEATING");
    }

    @Override
    public void setCurrent_state(State st) {

    }
}
