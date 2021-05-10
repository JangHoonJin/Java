package ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//파일을 읽기위한 InputStream의 사용법
	
		//InputStream(1byte) - File => 
	
		
		FileInputStream fis = null;
	
		try {
			fis = new FileInputStream("c:/Java/test.txt");
			
			//한개씩 읽어들이는법
			//1byte씩 reading 하는것 (읽어들이는것)
//			int data = fis.read();
//			System.out.println("data : " + (char)data);
//			data = fis.read();
//			System.out.println("data : " + (char)data);
//			data = fis.read();
//			System.out.println("data : " + (char)data);
//			data = fis.read();
//			System.out.println("data : " + (char)data);
			
			//여러개를 한번에 읽는법
			byte[] datas = new byte[5];
			fis.read(datas);
			System.out.println((char)datas[0]);
			System.out.println((char)datas[4]);
			
			
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

