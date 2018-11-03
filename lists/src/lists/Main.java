package lists;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bruno
 * This app contains good practice of encapsulations, composition, reference & value and polymorphism applied
 */
public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Lists groceryList = new Lists();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;

        printInstructions();

        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); //cleans the input buffer

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.groceryLoop();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    search();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }


    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print instructions.");
        System.out.println("\t 1 - To print a list of all the items in the list.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To edit an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the app.");
        
    }

    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());//Takes a string
    }

    public static void modifyItem() {
        System.out.print("Enter current item name: ");
        String item_1 = scanner.nextLine();
        System.out.print("Enter replacement item name: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGrocery(item_1, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item string: ");
        String item = scanner.nextLine();
        groceryList.removeGrocery(item);

    }

    public static void search() {
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)) System.out.println("Found item: " + searchItem);
        else System.out.println("Item not found!");
    }
    
    public static void processArray() {//Setting up a new ArrayList copying all the items from another
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());
        
        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList()); //Another way to copy it
        
//        Converting it to a common array
          String[] normalArray = new String[groceryList.getGroceryList().size()];//initializing the array with correct size
          normalArray = groceryList.getGroceryList().toArray(normalArray); //Conversion
        
    }
}


