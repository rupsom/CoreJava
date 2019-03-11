import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class generateRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		
		int rand_int1 = rand.nextInt(1000);
		int rand_int2 = rand.nextInt(1000);
		
		System.out.println("Random Integers: "+rand_int1);
		System.out.println("Random Integers: "+rand_int2); 
		
		
		System.out.println("Random doubles: " + Math.random()); 
        System.out.println("Random doubles: " + Math.random()); 
        
        rand_int1 = ThreadLocalRandom.current().nextInt(); 
        rand_int2 = ThreadLocalRandom.current().nextInt(); 
        
        System.out.println("Random Integers: "+rand_int1);
		System.out.println("Random Integers: "+rand_int2); 
	}

}
