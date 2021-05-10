package ex02;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//system in 표준입출력 창 만들기
		
		InputStream is = null;
		
		try {
			//스캐너부분
			is = System.in;
			System.out.print("입력 :");
			//
			
			System.out.println("입력내용 : " + (char)is.read());
			System.out.println("입력내용 : " + (char)is.read());
			System.out.println("입력내용 : " + (char)is.read());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 :" + e.getMessage());
		}finally {
			if(is != null) try {is.close();} catch(IOException e) {}
		}
		
	}

}
