package ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//파일을 읽기위한 InputStream의 사용법
		
		// 전체 데이터를 읽어들이는방법 **
		
		
		//InputStream(1byte) - File => 
	
		
		FileInputStream fis = null;
	
		try {
			//fis = new FileInputStream("c:/Java/test.txt");
			fis = new FileInputStream("./newtest.txt");
			int data = 0;
			
			//엔터키
			//윈도우 = /r /n
			//리눅스 = /n
			
			while((data = fis.read()) != -1 ) {
				if( data == '\r') {
					System.out.print("(r)");
				}else if (data == '\n') {
					System.out.print("(n)");
				}else {
					
				}
				System.out.print((char)data);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 : " + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 : " + e.getMessage());
		} finally {
			if(fis != null ) try {fis.close();} catch(IOException e) {
		}
		
		
	}

	}
	}

