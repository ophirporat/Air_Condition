public abstract class State {
    public void entry(){}

    public void exit(){
        System.out.print("Good Bye");
    }

    public void setC_temp(int C_temp) { }

    public void setR_temp(int R_temp) { }

    public void setCool(boolean cool) { }

    public void ChangeState(boolean isCool) {

    }

}
