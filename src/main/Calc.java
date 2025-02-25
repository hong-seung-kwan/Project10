package main;

// 계산기 인터페이스
// 인터페이스는 상수와 추상메소드만 가질 수 있다
// 메소드는 자동으로 abstract 키워드가 붙는다
public interface Calc {

	int ERROR = -999; // 오류코드
	
	int add(int num1, int num2); // 더하기 메소드
	
	int substract(int num1, int num2); // 빼기 메소드
	
	int times(int num1, int num2); // 곱하기 메소드
	
	int divide(int num1, int num2); // 나누기 메소드
	
}