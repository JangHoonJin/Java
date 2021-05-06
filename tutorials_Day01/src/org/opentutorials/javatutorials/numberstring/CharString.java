package org.opentutorials.javatutorials.numberstring;

public class CharString {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
			//자바 문자열의 사용법
			//문자 (Character)  = ex) '문' 단일문자는 '' 사용
			//문자열 (String)	   = ex) "문자열" 문자열은 "" 사용
		
			//자바에서는 문자는 '' 로 감싸야함
		System.out.println('문');
		System.out.println("문자열확인");
		
			//	문자열의 경우는 ''를 사용하면 오류가 발생 ""로 교체해서 사용해야함
			//	System.out.println('문자열의확인');
		
			//	""로 묶어 문자열선언이지만 단일문자인 경우는 문자열로 선언이됨.
		System.out.println("문");
			//	문자열과 문자열의 결합도 가능함
		System.out.println("문자열" + "입니다.");
		
			//	일반 정수덧셈
		System.out.println(1+1);
			//	"" 안에 들어가있으므로 문자열(String)이 되어 "11"이 출력
		System.out.println("1" + "1");
		
			//	문자열 + 잘못된 선언으로 인해 오류발생
		//System.out.println("jin said" java very hard "");
		
			//	"\" 큰따옴표 안에 \를 작성하면 문자열 따옴표로 인식(") = 문자열의 구간으로 정상인식
		System.out.println("jin said \" java very hard \"");
		
		
			// 여러줄로 문자열을 표현하고 싶을때 = \n
		System.out.println("jin said\njava very hard");
		
	}

}
