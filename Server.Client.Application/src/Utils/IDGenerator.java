package Utils;

import java.util.Random;

public class IDGenerator {

	public int setId(){
		int id;
		Random randomGenerator = new Random();
		id = randomGenerator.nextInt(1000000);
		return id;
	}
	
}
