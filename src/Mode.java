abstract class Mode {
    public double C_temp;
    public double R_temp;
    public abstract void operate();
    public abstract void printOnScreen();

    public Mode(double c_temp, double r_temp) {
        C_temp = c_temp;
        R_temp = r_temp;
    }
}