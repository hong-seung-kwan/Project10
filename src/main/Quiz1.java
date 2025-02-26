package main;

public class Quiz1 {

	public static void main(String[] args) {

		Calc calc = new Calculator();

		if (calc instanceof Calculator) {
			Calculator calculator = (Calculator) calc;
			calculator.showInfo();
		}

	}

}
