public class Computer extends AbstractEntity {

    public int hdd;
    public double cpu;
    public boolean touchScreen;
    public int ram;

    public Computer(int hdd, double cpu, boolean touchScreen, int ram) {
        this.hdd = hdd;
        this.cpu = cpu;
        this.touchScreen = touchScreen;
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
