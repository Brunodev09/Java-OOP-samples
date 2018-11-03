
package composition;

/**
 *
 * @author bruno
 */
public class Composition {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
//        Resolution nativeResolution = new Resolution(1900,1200);

        Shell shell = new Shell("X", "Dell", "240", dimensions);
        
        Monitor monitor = new Monitor("Beast", "Acer", 27, new Resolution(1900,1200)); //Quick way to create a class instance
        
        Motherboard motherboard = new Motherboard("BJ200", "Asus", "BIOS v2");
        
        PC pc = new PC(shell, monitor, motherboard);
//        pc.getMonitor().drawPixelAt(12, 50, "blue"); //Way of accessing Monitor methods
//        pc.getMotherboard().runProgram("Linux Mint 1.0");
//        pc.getShell().pressPower();
          pc.powerOn();
    }
    
}
