package composition;

/**
 *
 * @author bruno
 */
public class PC {
    private Shell shell;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Shell shell, Monitor monitor, Motherboard motherboard) {
        this.shell = shell;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
    
    public void powerOn() {
        getShell().pressPower();
        getMonitor().drawPixelAt(50, 50, "blue");
        getMotherboard().runProgram("Linux Mint 1.0");
    }

    public Shell getShell() {
        return shell;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
    
    
}
