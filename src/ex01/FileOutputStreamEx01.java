package ex01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//FileOutputStream의 사용법
		
		FileOutputStream fos = null;
		
		try {
			//fos = new FileOutputStream("c:/Java/newtest.txt");
			
			// .을 찍을경우 현재경로 ( 자바소스가 있는위치)
			fos = new FileOutputStream("./newtest.txt");
			
			
			//반드시 문자형태로 들어가야함
			//overwriting - 지웠다가 다시 쓰기
			fos.write('1');
			fos.write('2');
			fos.write('\r');
			fos.write('\n');
			fos.write('a');
			fos.write('b');
			System.out.println("출력완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 : " + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 : " + e.getMessage());
			
		}finally {
			if( fos != null) try {fos.close(); } catch(IOException e) {}
			
		}
		
	}

}
