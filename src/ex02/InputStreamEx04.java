package ex02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//inputStreamReader 의사용법 (변환) 한글을 사용할 수 있게해줌
		//BufferedReader 를 사용해한줄씩 출력하는방법 **
		
		//InputStreamReader isr = null;
		//InputStream is = null;
		BufferedReader br = null;
		
		
		try {
			//스캐너부분
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("입력 :");
			//
			
			String data = null;
					
			while ((data = br.readLine())!=null) {
			System.out.println("입력내용 : " + data);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 :" + e.getMessage());
		}finally {
			if(br != null) try {br.close();} catch(IOException e) {}
		}
		
	}

}
