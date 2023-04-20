package Task_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class Application {

	public static void main(String[] args) {
		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		Random r = new Random();

		ArrayList<Car> cars = new ArrayList<Car>();
		for (int i = 0; i < r.nextInt(5,11); i++) {
			cars.add(new Car());
		}	
		
		System.out.println("Введіть номер завдання:");
		System.out.println("1.Вивести toString() даних елементів масиву на консоль.");
		System.out.println("2.Для всіх об`єктів даного масиву засетити одинаковий  об`єкт класу Авто");
		System.out.println("0.Вихід");
		ArrayList<Car> cars2 = new ArrayList<Car>();
		cars2.add(new Car());
		cars2.add(1, new Car());
		
		while (flag) {
			switch (scan.next()) {
			case "1": {
				for(Car c : cars) {
					System.out.println(c);
				}
				break;
			}
			case "2": {
				Car carOne = new Car(1992, 123);
				Collections.fill(cars, carOne);
				for(Car c : cars) {
					System.out.println(c);
				}				
				break;
			}
			case "0": {
				flag = !flag;
			}
			}
		}
	}
}
