package StringCalculator;

public class Calculator {
	public static int add(String text) {
		if(text.equals(""))
			return 0;

		else if(text.contains(",|\n")) {
			return sum(splitNumbers(text));
		}

		else
			return 1;
	}

	private static int toInt(String number) {
		return Integer.parseInt(number);
	}

	private static String[] splitNumbers(String numbers) {
		return numbers.split(",");
	}

	private static int sum(String [] numbers) {
		for(String negative : numbers) {
			if(toInt(negative) < 0)
				throw Exception("Negatives not allowed: " + negative);
				
		}

		int total = 0;
		for(String number : numbers) {
			if(toInt(number) > 1000)
				continue;
			total += toInt(number);
		}
		return total;
	}
}
