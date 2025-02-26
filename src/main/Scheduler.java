package main;

public interface Scheduler {
	
	// 다음 전화 가져오는 메소드
	public void getNextCall();
	
	// 상담원에게 전화를 전달하는 메소드
	public void sendCallToAgent();

}
