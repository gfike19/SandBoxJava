public class Smartphone extends Computer {

    public Smartphone(int hdd, double cpu, boolean touchScreen, int ram) {
        super(hdd, cpu, touchScreen, ram);
    }

    public void makeCall() {
        System.out.println("Ring ring ring\n");
    }
}
