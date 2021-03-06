package ex01;

import java.util.Arrays;

public class ArraysEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arrs = { "aaa", "bbb", "ccc" };
		
		System.out.println( arrs.toString() );
		System.out.println( Arrays.toString( arrs ) );
		
		// 채우기
		Arrays.fill( arrs, "xxx" );
		System.out.println( Arrays.toString( arrs ) );
		
		Arrays.fill( arrs, 0, 2, "yyy" );
		System.out.println( Arrays.toString( arrs ) );
		
		String[] arrs1 = { "aaa", "bbb", "ccc" };
		String[] arrs2 = { "bbb", "aaa", "ccc" };
		
		System.out.println( arrs1 == arrs2 );
		System.out.println( Arrays.equals(arrs1, arrs2));
	}
}
