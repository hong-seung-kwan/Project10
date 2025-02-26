package main;

public class Ex3 {

	public static void main(String[] args) {
		
		// 계산기 생성
//		Calc calc = new Calculator();
		Calc calc = new NewCalculator();
		System.out.println(calc.add(10, 5));
		System.out.println(calc.substract(10, 5));
		System.out.println(calc.times(10, 0));
		System.out.println(calc.divide(10, 0));
		
		// 기존클래스의 문제점 발견 => 새로운 클래스 개발
		// 인터페이스를 이용하여 프로그램을 작성하면, 유지보수가 편하다.
	}

}

class NewCalculator implements Calc {

	@Override
	public int add(int num1, int num2) {		
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {		
		return num1 - num2;
	}

	// 곱하는 수가 0이라면 에러코드를 반환
	@Override
	public int times(int num1, int num2) {		
		if(num2==0) {
			return Calc.ERROR;
		}else {
			return num1 * num2;
		}
	}
	
	// 나누는 수가 0이면 에러코드를 반환
	@Override
	public int divide(int num1, int num2) {
		if(num2==0) {
			return Calc.ERROR;
		}else {
			return num1 / num2;
		}
		
	}
	
}