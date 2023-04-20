package Task_1;

import java.util.Random;

public class Engine {
	int numberOfPistons;
	Random r = new Random();
	
	Engine(){
		this.numberOfPistons = r.nextInt(1,9); 
	}

}
