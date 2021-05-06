package ex04;

public class Child1 extends Parent {
	// 임원
	
	// 급여 계산용 메서드
	public void sal1() {
		System.out.println( "sal1() 호출");
	}
	
	@Override
	public void sal() {
		// TODO Auto-generated method stub
		System.out.println( "child1 sal() 호출");
	}
}

