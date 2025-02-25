package main;

public class Ex1 {

	public static void main(String[] args) {

//		Calc calc = new Calc();
		// 자식 클래스로 인스턴스를 생성할 것
		Calculator calculator = new Calculator();
		int result1 = calculator.add(10, 5);
		System.out.println(result1);
		int result2 = calculator.substract(10, 5);
		System.out.println(result2);
		int result3 = calculator.times(10, 5);
		System.out.println(result3);
		int result4 = calculator.divide(10, 5);
		System.out.println(result4);
		
		
	}
}

// 계산기 클래스
// C -> C (extends)
// C -> I (implements)
class Calculator implements Calc {

	@Override
	public int add(int num1, int num2) {

		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {

		return num1 - num2;
	}

	@Override
	public int times(int num1, int num2) {

		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {

		return num1 / num2;
	}
	
	public void showInfo() {
		System.out.println("계산기 클래스 입니다..");
	}
}