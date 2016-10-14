package StringCalculator;

public class Calculator {
	public static int add(String text) {
		if(text.equals(""))
			return 0;

		else if(text.contains(",")) {
			return sum(splitNumbers(text));
		}

		else
			return 1;
	}

	private static int sum(String [] numbers) {
		int total = 0;
		for(String number : numbers)
			total += number;
		return total;
	}
}
