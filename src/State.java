public abstract class State {

    public abstract void entry();

    public void exit(){
        System.out.print("Good Bye");
    }

    public abstract void setCurrent_state(State st);


}
