package firstProject;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RandomNumbemForPowerBall {
	public static Set<Integer> set = new HashSet<>();

	public static void main(String[] args) {
		set = powerballNuberGenator(35, 7);
		System.out.print("7 winning numbers are: ");
		randomNumberPrint(set);
		// System.out.println(set);

		System.out.print("\nPower ball number is: ");
		set = powerballNuberGenator(20, 1);

		// System.out.println(set);
		randomNumberPrint(set);
	}

	public static Set<Integer> powerballNuberGenator(int range, int quantity) {
		set.clear();
		int index = 0;

		do {
			int result = (int) Math.round(Math.random() * range);
			if (result == 0)
				continue;
			if (set.add(result) == true) {
				index++;
			}
		} while (index < quantity);
		return set;
	}

	public static void randomNumberPrint(Set<Integer> set) {
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + "  ");
		}
	}
}