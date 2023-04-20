package Task_1;

import java.util.Random;

public class Helm {
	double diameter = 0.00;
	Materials material;

	Helm() {
		this.diameter = new Random().nextDouble(30.0, 40.0);
		this.material = Materials.randomMaterials();
	}
	
	
}
