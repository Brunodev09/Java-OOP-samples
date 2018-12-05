package encapsulation;

/**
 *
 * @author bruno
 */
public class Player {
    public String name;
    public int health;
    public String weapon;
    
    public void loseHealth(int damage) {
        health -= damage;
        if(damage >= health) {
            System.out.println("Player is dead!");
            health = 0;
        }
    }
    public int healthRemaining() {
        return health;
    }
}
