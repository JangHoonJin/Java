package ex04;

public class Child3 extends Parent {
	// 계약직

	// 급여 계산용 메서드
	public void sala() {
		System.out.println( "sala() 호출");
	}
	
	@Override
	public void sal() {
		// TODO Auto-generated method stub
		System.out.println( "child3 sal() 호출");
	}
}
