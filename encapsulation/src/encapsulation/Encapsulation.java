
package encapsulation;

/**
 *
 * @author bruno
 */
public class Encapsulation {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Bruno";
//        player.weapon = "Sword";
//        player.health = 100;
//        
//        int damage = 101;
//        player.loseHealth(damage);
//        System.out.println("Health remaining: " + player.healthRemaining());


          EnhancedPlayer player = new EnhancedPlayer("Bruno", 100, "sword");
          System.out.println("Health is: " + player.getHealth());
    }
//        Encapsulation is making variables privates and giving access to methods where we can set conditions for it to change
    
}
