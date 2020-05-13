public class Laptop extends Computer{

    private boolean wifi;

    public Laptop(int hdd, double cpu, boolean touchScreen, int ram, boolean wifi) {
        super(hdd, cpu, touchScreen, ram);
        this.wifi = wifi;
    }

    public void throwLaptop () {
        if(wifi ==  false) {
            System.out.println("Stupid hunk of junk!\n");
        } else {
            System.out.println("Yay memes!!\n");
        }
    }
}
