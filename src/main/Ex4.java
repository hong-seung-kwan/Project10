package main;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		System.out.println("전화 상담 정책을 선택하세요");
		System.out.println("1: 순차적으로 할당");
		System.out.println("2: 대기가 적은 상담원에게 할당");
		System.out.println("3: 우선순위가 높은 고객 먼저 할당");
		
		// Scanner? 값을 입력받는 기능
		// print? 입력한 내용을 화면에 출력하는 기능
		// scanner로 정책을 선택
		Scanner scanner = new Scanner(System.in);
		
		// 키보드에서 숫자 입력받기
		int num = scanner.nextInt();
		
		Scheduler scheduler = null;
		
		if(num == 1) {
			scheduler = new RoundRobin();
		}else if(num == 2) {
			scheduler = new LeastJob();
		}else if(num == 3) {
			scheduler = new PriorityAllocation();
		}else {
			System.out.println("잘못된 값이 입력되었습니다..");
		}
		
		// 상담 전화 받기
		if(scheduler != null) { // 참조변수가 빈값이 아니라면 (객체가 있다면)
			scheduler.getNextCall();
			scheduler.sendCallToAgent();
		}
	}

}

// 3가지 정책
class RoundRobin implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("상담전화를 순서대로 대기열에서 가져옵니다");		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순서의 상담원에게 전화를 전달합니다");		
	}
	
}

class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("상담전화를 순서대로 대기열에서 가져옵니다");		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("대기열이 적은 상담원에게 전화를 전달합니다");		
	}
	
}

// 등급이 높은 고객의 전화를 먼저 가져와서 배분
class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("등급이 높은 고객의 전화를 먼저 가져옵니다");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무능력이 높은 상담원에게 전화를 전달합니다");
		
	}
	
}