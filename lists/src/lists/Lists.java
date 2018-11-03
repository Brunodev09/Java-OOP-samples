package lists;

import java.util.ArrayList;

/**
 *
 * @author bruno
 */
public class Lists {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem(String item) {
        groceryList.add(item); //adds to the list
    }

    public void groceryLoop() {
        System.out.println("You have # " + groceryList.size() + " items in your list.");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i)); //gets an element based on index
        }
    }

    public void modifyGrocery(String currentItem, String newItem) {
        int pos = findItem(currentItem);
        if (pos >= 0) { //Returns -1 when null
            modifyGrocery(pos, newItem);
        }
    }

    private void modifyGrocery(int pos, String newItem) {
        groceryList.set(pos, newItem);//sets new value for elements
        System.out.println("Grocery item # " + (pos + 1) + " has been modified.");
    }

    public void removeGrocery(String item) {
        int pos = findItem(item);
        if (pos >= 0) { //Returns -1 when null
            removeGrocery(pos);
        }
    }

    private void removeGrocery(int pos) {
        String theItem = groceryList.get(pos);
        groceryList.remove(pos);//removes element based on index
        System.out.println(theItem + " has been removed from the list.");
    }

    public boolean onFile(String search) {
        int pos = findItem(search);
        if (pos >= 0) {
            return true;
        } else 
            return false;
    }

    private int findItem(String search) {
        return groceryList.indexOf(search); //returns int -1 if not found and 1 if found
    }

//    public boolean boolfindItem(String search) {
//        boolean existsInList = groceryList.contains(search);
//        if (existsInList) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//    public String findItem(String search) {
//        int position = groceryList.indexOf(search);
//        if (position == -1) return "This item does not exist in the list.";
//        else return groceryList.get(position);
//    }
}
