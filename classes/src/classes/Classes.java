
package classes;

/**
 *
 * @author bruno
 */
public class Classes {


    public static void main(String[] args) {
        Car porsche = new Car();//defining and initializing object as a new data type
        Car ferrari = new Car(2, 4, "shit", "v8", "red");//Constructor is called everytime obj is instanciated
        Car nothing = new Car("something", "v6", "blue");
        
        System.out.println(porsche.getCar());
        System.out.println(ferrari.getCar());
        System.out.println(nothing.getCar());
        
    }
    
}


//Class = A created data type with primite variables
//Object = Each instance of a class is called an object
//Reference = Each instance has its reference (memory address value). You can have multiple references pointing at the same object 
//(2 instances pointing at the same object)
