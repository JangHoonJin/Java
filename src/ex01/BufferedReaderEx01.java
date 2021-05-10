package ex01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//FileReader 로 파일을 읽어오는방법
		FileReader br = null;
		//FileReader fr = null;
		
		try {
			br = new FileReader("c:/Java/test.txt");
			
			int data = 0;
			// 1자씩 읽어들이는 방법
			
			while((data = br.read())!= -1) {
				System.out.println((char)data);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 : " + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 : " + e.getMessage());
		}finally {
			if(br != null) try {br.close();} catch(IOException e) {}
		}
		
	}

}
