public class Main {

    public static void main(String[] args) {

        AirConditioner ac = new AirConditioner();
        ac.on();
        ac.setR_temp(27);
        ac.setC_temp(28);
//        ac.setR_temp(35);
        ac.off();
    }
}
