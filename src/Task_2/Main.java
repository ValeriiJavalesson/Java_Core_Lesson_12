package Task_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import Task_1.Materials;

public class Main {
	public static void main(String[] args) {
		Months inputMonths = null;
//		Months[] months = Months.values();
//		Seasons[] seas = Seasons.values();
		ArrayList<Months> months = new ArrayList<Months>(Arrays.asList(Months.values()));
		LinkedList<Seasons> seas = new LinkedList<Seasons>(Arrays.asList(Seasons.values()));
//		Iterator<Seasons> seas_iterator=seas.iterator();
		boolean start = true;

		while (start) {

			System.out.println("Введіть, будь ласка, номер завдання зі списку, яке треба виконати:");
			System.out.println(
					"1-Перевірити чи є такий місяць (місяць вводимо з консолі, передбачити, щоб регістр букв був не важливим ");
			System.out.println("2-Вивести всі місяці з такою ж порою року ");
			System.out.println("3-Вивести всі місяці які мають таку саму кількість днів");
			System.out.println("4-Вивести на екран всі місяці які мають меншу кількість днів");
			System.out.println("5-Вивести на екран всі місяці які мають більшу кількість днів");
			System.out.println("6-Вивести на екран наступну пору року");
			System.out.println("7-Вивести на екран попередню пору року");
			System.out.println("8-Вивести на екран всі місяці які мають парну кількість днів");
			System.out.println("9-Вивести на екран всі місяці які мають непарну кількість днів");
			System.out.println("10-Вивести на екран чи введений з консолі місяць має парну кількість днів");
			System.out.println("Для виходу з програми, введіть: stop");
			Scanner scan = new Scanner(System.in);

			switch (scan.next()) {

			case "1": {
				System.out.println("Введіть місяць:");
				String input = scan.next().toUpperCase();
				inputMonths = returnMonthsIfContains(months, input);

				if (inputMonths != null)
					System.out.println("Такий місяць існує.");
				break;
			}
			case "2": {
				System.out.println("Введіть місяць:");
				String input = scan.next().toUpperCase();
				inputMonths = returnMonthsIfContains(months, input);

				if (inputMonths != null) {
					for (Months i : months) {
						if (i.equals(inputMonths)) {
							System.out.println("Така пора року " + i.getSeason() + " також має ще місяці:");
							for (Months i2 : months) {
								if (i2.getSeason().equals(i.getSeason())) {
									if (i2 != i)
										System.out.println(i2);
								}
							}
						}
					}					
				}
				break;
			}
			case "3": {
				System.out.println("Введіть місяць:");
				String input = scan.next().toUpperCase();
				inputMonths = returnMonthsIfContains(months, input);

				if (inputMonths != null) {
					for (Months i : months) {
						if (i.equals(inputMonths)) {
							int days = i.getDays();
							System.out.println("Таку саму кількість днів (" + days + ") мають ще місяці:");
							for (Months i2 : months) {
								if (i2.getDays() == i.getDays()) {
									if (i2 != i)
										System.out.println(i2);
								}
							}
						}
					}
				}
				break;
			}
			case "4": {
				System.out.println("Введіть місяць:");
				String input = scan.next().toUpperCase();
				inputMonths = returnMonthsIfContains(months, input);

				if (inputMonths != null) {
					for (Months i : months) {
						if (i.equals(inputMonths)) {
							int days = i.getDays();
							System.out.println("Меншу кількість днів (меншу за " + days + ") мають місяці:");
							for (Months i2 : months) {
								if (i2.getDays() < i.getDays()) {
									if (i2 != i)
										System.out.println(i2);
								}
							}
						}
					}
				}
				break;
			}
			case "5": {
				System.out.println("Введіть місяць:");
				String input = scan.next().toUpperCase();
				inputMonths = returnMonthsIfContains(months, input);

				if (inputMonths != null) {
					for (Months i : months) {
						if (i.equals(inputMonths)) {
							int days = i.getDays();
							System.out.println("Більшу кількість днів (більшу за " + days + ") мають місяці:");
							for (Months i2 : months) {
								if (i2.getDays() > i.getDays()) {
									if (i2 != i)
										System.out.println(i2);
								}
							}
						}
					}
				}
				break;
			}
			case "6": {
				System.out.println("Введіть місяць:");
				String input = scan.next().toUpperCase();
				inputMonths = returnMonthsIfContains(months, input);

				if (inputMonths != null) {
					for (Months i : months) {
						if (i.equals(inputMonths)) {
							System.out.print("Після " + i.getSeason() + " приходить ");
							for (Seasons s : seas) {
								if (s.equals(i.getSeason())) {
									if (seas.indexOf(s) + 1 == seas.size()) {
										System.out.println(seas.get(0));
									} else {
										System.out.println(seas.get(seas.indexOf(s) + 1));
									}
								}
							}
						}
					}
				}
				break;
			}
			case "7": {
				System.out.println("Введіть місяць:");
				String input = scan.next().toUpperCase();
				inputMonths = returnMonthsIfContains(months, input);

				if (inputMonths != null) {
					for (Months i : months) {
						if (i.equals(inputMonths)) {
							System.out.print("Перед " + i.getSeason() + " приходить ");
							for (Seasons s : seas) {
								if (s.equals(i.getSeason())) {
									if (seas.indexOf(s) == 0) {
										System.out.println(seas.get(seas.size()-1));
									} else {
										System.out.println(seas.get(seas.indexOf(s) - 1));
									}
								}
							}
						}
					}
				}
				break;
			}
			case "8": {
				System.out.println("Парну кількість днів мають місяці:");
				for (Months i : months) {
					int days = i.getDays();
					if (days % 2 == 0) {
						System.out.println(i);
					}
				}
				break;
			}
			case "9": {
				System.out.println("Непарну кількість днів мають місяці:");
				for (Months i : months) {
					int days = i.getDays();
					if (days % 2 != 0) {
						System.out.println(i);
					}
				}
				break;
			}
			case "10": {
				System.out.println("Введіть місяць:");
				String input = scan.next().toUpperCase();
				inputMonths = returnMonthsIfContains(months, input);

				if (inputMonths != null) {
					for (Months i : months) {
						if (i.equals(inputMonths)) {
							int days = i.getDays();
							if (days % 2 == 0) {
								System.out.println(i.name() + " має парну кількість днів");
							} else {
								System.out.println(i.name() + " має непарну кількість днів");
							}
						}
					}
				}
				break;
			}
			case "stop": {
				start = !start;
				break;
			}
			}
		}
		System.out.println("На все добре!");
	}

	static Months returnMonthsIfContains(ArrayList<Months> months, String input) {
		boolean flag = false;
		Months m = null;
		for (Months s : months) {
			if (s.toString().equals(input)) {
				m = s;
				flag = true;}
		}
		if (flag == false)
			System.out.println("Такого місяця не існує.");
		return m;
		
	}
}
