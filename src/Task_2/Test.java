package Task_2;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		Months inputMonths = null;
		ArrayList<Months> months = new ArrayList<Months>(Arrays.asList(Months.values()));
		ArrayList<Seasons> seas = new ArrayList<Seasons>(Arrays.asList(Seasons.values()));
		ArrayList<String> text = new ArrayList<String>();

//		text.addAll(Arrays.asList(Seasons.values()));

		System.out.println("Введіть місяць:");
		String input = "MAY";
		inputMonths = returnMonthsIfContain(months, input);
		System.out.println(months);
		System.out.println(input);
		System.out.println(months.contains(inputMonths));
		System.out.println(months.indexOf(inputMonths));
		if (inputMonths != null)
			System.out.println("Такий місяць існує.");

	}

	static Months returnMonthsIfContain(ArrayList<Months> months, String input) {
		boolean flag = false;
		Months m = null;
		for (Months s : months) {
			if (s.toString().equals(input))
				m = s;
				flag = true;
		}
		if (flag == false)
			System.out.println("Такого місяця не існує.");
		return m;
		
	}
}
