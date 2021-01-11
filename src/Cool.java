public class Cool extends State {

    public Mode context;

    public Cool(Mode context) {
        this.context = context;
    }

    @Override
    public void entry(){
        System.out.println("MODE-COOL");
    }

    @Override
    public void setCurrent_state(State st) {

    }

}
