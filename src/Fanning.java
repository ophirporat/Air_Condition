public class Fanning extends State {
    public int C_temp;
    public int R_temp;
    private Operation Operation;

    public Fanning(Operation operation){
        Operation = operation;
        C_temp = Operation.getC_temp();
        R_temp = Operation.getR_temp();
    }

    @Override
    public void setCurrent_state(State st) {

    }

    public void entry(){

        if(C_temp + 2 < R_temp){
            System.out.println("OPERATION-FANNING (120 SECONDS AT LEAST)");
            Operation.setCurrent_state(Operation.cooling);

        }
        else if(C_temp - 2 > R_temp){
            System.out.println("OPERATION-FANNING (120 SECONDS AT LEAST)");
            Operation.setCurrent_state(Operation.heating);
        }
        else{
            System.out.println("OPERATION-FANNING (120 SECONDS AT LEAST)");
        }

    }

    public void setC_temp(int c_temp) {
        C_temp = c_temp;
        if(C_temp + 2 < R_temp){
            Operation.setCurrent_state(Operation.cooling);
        }
        if(C_temp - 2 > R_temp){
            Operation.setCurrent_state(Operation.heating);
        }
    }

    public void setR_temp(int r_temp) {
        R_temp = r_temp;
        if(C_temp + 2 < R_temp){
            Operation.setCurrent_state(Operation.cooling);
        }
        if(C_temp - 2 > R_temp){
            Operation.setCurrent_state(Operation.heating);
        }
    }

}
