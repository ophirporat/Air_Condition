public class Main {

    public static void main(String[] args) {

        AirConditioner ac = new AirConditioner();
        ac.on();
        ac.setR_temp(16);
        ac.setC_temp(10);
//        ac.setR_temp(35);
        ac.off();
    }
}
