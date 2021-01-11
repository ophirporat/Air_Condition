public class Heat extends State {

    public Mode context;

    public Heat(Mode context) {
        this.context = context;
    }

    @Override
    public void entry(){
        System.out.println("MODE-HEAT");
    }

    @Override
    public void setCurrent_state(State st) {

    }
}
