package composition;

/**
 *
 * @author bruno
 */
public class Shell {
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimensions;

    public Shell(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }
    
    public void pressPower() {
        System.out.println("Power button is pressed.");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
    
}
