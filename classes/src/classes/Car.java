package classes;

/**
 *
 * @author bruno
 */
public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;
    
    public Car() {
        this(4,4,"ferrari","v8","black");//Special this(). Calls next constructor with defined default parameters
        System.out.println("Empty constructor called!"); //Overloading constructor below
    }
    public Car(String model, String engine, String color) { //Different constructor called when only (str,str,str)
        this(2,4,model,engine,color);//Sets default values to doors and wheels and calls upon the main constructor with more params
    }

    public Car(int doors, int wheels, String model, String engine, String color) {
        String validModel = model.toLowerCase(); //Making param model to lowercase
        if (doors <= 4) this.doors = doors;
        else this.doors = 4;
        if (wheels != 4) this.wheels = 4;
        else this.wheels = wheels;
        if (validModel.equals("ferrari") || validModel.equals("porsche")) this.model = model;
        else this.model = "Unknown model";

        this.engine = engine;
        this.color = color;

    }

    public String getCar() {
        return "Doors: " + this.doors + " Wheels: " + this.wheels + " Model: " + this.model + " Engine: " + this.engine + " Color: " + this.color;
    }
}
