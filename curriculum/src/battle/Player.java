package battle;
import java.util.Random;
public class Player extends Character {
 
	private static final Random random = new Random();

    public Player(String name) {
    	
        super(name,
                random.nextInt(41) + 60, // HP 60〜100
                random.nextInt(11) + 10, // AT 10〜20
                random.nextInt(11) + 5   // SP 5〜15
        );
    }
}