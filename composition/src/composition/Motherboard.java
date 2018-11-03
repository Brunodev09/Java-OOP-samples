package composition;

/**
 *
 * @author bruno
 */
public class Motherboard {

    private String cardSlots;
    private String bios;
    private String manufacturer;

    public Motherboard(String cardSlots, String bios, String manufacturer) {
        this.cardSlots = cardSlots;
        this.bios = bios;
        this.manufacturer = manufacturer;
    }

    public void runProgram(String programName) {
        System.out.println("The following program is running: " + programName);
    }

    public String getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }

    public String getManufacturer() {
        return manufacturer;
    }

}
