public class Cooling extends State {

    private Operation context;

    public Cooling(Operation context) {
        this.context = context;
    }

    @Override
    public void entry() {
        System.out.println("OPERATION-COOLING");
    }

    @Override
    public void setCurrent_state(State st) {

    }
}
