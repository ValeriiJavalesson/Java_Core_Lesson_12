package Task_1;

import java.text.DecimalFormat;
import java.util.Random;

public class Car {
	int yearOfgraduation;
	int horsePower;
	Engine engine;
	Helm helm;
	Random r = new Random();
	DecimalFormat format = new DecimalFormat("#.#");

	Car() {
		this.yearOfgraduation = r.nextInt(1800, 2023);
		this.horsePower = r.nextInt(50, 550);
		this.engine = new Engine();
		this.helm = new Helm();
	}
	Car(int yearOfgraduation, int horsePower){
		this.yearOfgraduation = yearOfgraduation;
		this.horsePower = horsePower;
		this.engine = new Engine();
		this.helm = new Helm();
	}

	@Override
	public String toString() {
		return "Car: [Year: " + yearOfgraduation + "; Power: " + horsePower + "; Engine: " + engine.numberOfPistons
				+ " pistons"+"; Helm: "+helm.material+", "+format.format(helm.diameter)+"]";
	}

}
