package ex01;

import java.util.LinkedList;

public class LinkedListEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add( "홍길동" );
		ll.add( "박문수" );
		ll.add( "이몽룡" );
		
		for( String str : ll ) {
			System.out.println( str );
		}
	}

}
