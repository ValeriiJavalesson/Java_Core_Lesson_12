package Task_3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		MyArrayList p = new MyArrayList();

		p.add(0, "Zero");
		p.add(1, "One");
		p.add(2, "Two");
		p.add("Three");
		p.add("Four");
		p.add("5");
		p.add(6);
		
		System.out.printf("%20s %10d\n","Розмір ArrayList до видалення =",p.size());
		
		p.remove("Three");
		p.remove("5");
		
		System.out.printf("%20s %7d\n","Розмір ArrayList після видалення =",p.size());
		System.out.printf("%20s %20s\n","Елемент з індексом 0:",p.get(0));
		System.out.printf("%20s %20s\n","Елемент з індексом 4:",p.get(4));
	}
}
