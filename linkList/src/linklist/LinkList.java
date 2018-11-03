package linklist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author bruno
 */
public class LinkList {

    public static void main(String[] args) {
//        Normal arrays work with bytes calculation. Each int 4 bytes
//        So, if you have an array of integers with 4 slots, for instance on memory address 100, the list of addresses would be
//        100, 104, 108, 112 ...and so on. With String it works diff, because a string can have N chars, and for that
//        we need memory allocated dynamically. So you'd have random addresses pointing at them. Check pictures for better vis.


    
//        Customer customer = new Customer("Bruno", 10000.0);
//        Customer another = customer;
//        another.setBalance(1.12);
//        System.out.println("Customer 2 is pointing to customer 2. Because objects are also pointers! \n" + customer.getBalance());
//        
//        ArrayList<Integer> intList = new ArrayList<Integer>();
//        intList.add(1);
//        intList.add(3);
//        intList.add(4);
//        for (int i = 0; i < intList.size(); i++) System.out.println(i + " --> " + intList.get(i));
//        
//        System.out.println("-----------------");
//        
//        intList.add(1,2); //intList.add(pos, int)



//        When add element into a pos into the list the other ints move UP the index. So int 3 got to index 2, and int 4 into index 3
//        for (int i = 0; i < intList.size(); i++) System.out.println(i + " --> " + intList.get(i));




        
//          In a DB of millions of entries, this would make processing impossible. But with a linked list this problem is solved
//          Because each element in the array not only holds its value but also a memory address for the next element
//          Its not calculating a constant amount of bytes for the next element to point at, but rather using a specific memory path

            LinkedList<String> placesToVisit = new LinkedList<String>();
            placesToVisit.add("Sp");
            placesToVisit.add("Mg");
            placesToVisit.add("Mt");
            placesToVisit.add("Am");
            placesToVisit.add("Go");
            placesToVisit.add("Rj");
            placesToVisit.add("Es");
            
            printList(placesToVisit);
            placesToVisit.add(1,"Mito");//If no pos is entered, it goes to end pos
            printList(placesToVisit);
            addInOrder(placesToVisit, "Algo");
            printList(placesToVisit);

    }

    private static void printList(LinkedList<String> list) {
        Iterator<String> i = list.iterator(); //equivalent to for loop but made for linked lists
        while (i.hasNext()) {
            System.out.println("Now visiting -->  " + i.next());//.next() returns the current object and points to the next
        }
        System.out.println("====================");
    }
    
    private static boolean addInOrder(LinkedList<String> list, String newPlace) {
        ListIterator<String> listIterator = list.listIterator();
        
        while (listIterator.hasNext()) {
            int comparison = listIterator.next().compareTo(newPlace);
            if (comparison == 0) {
                System.out.println(newPlace + " is already at the list.");
                return false;
            } else if (comparison > 0) { //Returns > 0 if alphabetically the param string comes before the actual
                listIterator.previous();
                listIterator.add(newPlace);
                return true;
            } else if (comparison < 0) {//Returns < 0 if alphabetically the param string comes after the actual
                
            }
        }
//        If it got this far with no returns, the element must be added to the final position
        listIterator.add(newPlace);
        return true;
    }
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
