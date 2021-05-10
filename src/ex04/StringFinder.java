package ex04;

public class StringFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String txt1 = "가나다라";
		String txt2 = "해당 내용은 테스트 입니다.";
		String txt3 = "가격은 29,000원 입니다.";
		
		if(txt1.contains("나다")) {
			System.out.println("문자열 O");
		}else {
			System.out.println("문자열 X");
		}
		
	}

}
