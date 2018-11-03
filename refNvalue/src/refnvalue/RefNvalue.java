package refnvalue;

import java.util.Arrays;

/**
 *
 * @author bruno
 */
public class RefNvalue {

    public static void main(String[] args) {
        int integer = 10;
        int integer2 = integer;
        
        System.out.println(integer);
        integer2++;
        System.out.println(integer2);
        
        int[] array = new int[5]; //Every array is a pointer, and you can't copy the value of a pointer, only its address
        int[] array2 = array;
        
        System.out.println(Arrays.toString(array)); //Arrays class is a imported class from Java
        System.out.println(Arrays.toString(array2)); 
        
        array2[0] = 1;
        System.out.println(Arrays.toString(array)); //Arrays class is a imported class from Java
        System.out.println(Arrays.toString(array2)); 
        
        modifyArray(array);
        
        System.out.println(Arrays.toString(array)); //Arrays class is a imported class from Java
        System.out.println(Arrays.toString(array2)); 
  
//        What happens here is the following:
//        Like in C++, primitive data types hold VALUES. So when we assign one integer to another we copy its value, not its memory address.
//        In this way INTEGER and INTEGER2 have different memory addresses
    }
    
    private static void modifyArray(int[] array) {
        array[0] = 2;
        //array = new int[] {1,2,3}; //use the new keyword to create a new pointer
    }
    
}
