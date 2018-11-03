package autonunboxing;

import java.util.ArrayList;

/**
 *
 * @author bruno
 */

class IntClass {
    private int myInt = 10;

    public IntClass(int value) {
        this.myInt = value;
    }

    public int getMyInt() {
        return myInt;
    }

    public void setMyInt(int myInt) {
        this.myInt = myInt;
    }
    
}

public class Main {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] array = new int[10];
        
        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Bruno");
        //ArrayLists cannot be of primitive type. String is class. ArrayLists only accounts for objects
        ArrayList<IntClass> ints = new ArrayList<IntClass>();
        ints.add(new IntClass(54));
        
        Integer integer = new Integer(12);
        Double doubleValue = new Double(12.0);
        
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            intArrayList.add(Integer.valueOf(i));//Converts i into Integer object
        }
        for (int i = 0; i < 10; i++) System.out.println(i + "--> " + intArrayList.get(i).intValue()); //Converts back to primitive
        
        Integer int_2 = 10; //This will be compiled into new Integer(10)
        int primitive = int_2; // int primitive = int_2.intValue();
        
    }
    
}
