// Calculator
public class Calculator {
	int sum() {
		UserInput ui = new UserInput();
		int[] numbers = ui.UserInput();
		int sum = numbers[0] + numbers[1];
		return sum;
	}

	int sub() {
		UserInput ui = new UserInput();
		int[] numbers = ui.UserInput();
		int sub = numbers[0] - numbers[1];
		return sub;
	}

	int multi() {
		UserInput ui = new UserInput();
		int[] numbers = ui.UserInput();
		int multi = numbers[0] * numbers[1];
		return multi;
	}

	int div() {
		UserInput ui = new UserInput();
		int[] numbers = ui.UserInput();
		if (numbers[1] == 0) {
			return -1;
		}
		int div = numbers[0] / numbers[1];
		return div;
	}





}