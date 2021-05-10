package ex01;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//FileWriter로 데이터를 쓰는방법
		
		FileWriter fw = null;
		
		try {
			//덮어쓰기 방식
			//fw = new FileWriter("./newtest.txt");
			
			//append 방식
			fw = new FileWriter("./newtest.txt", true);
			
			fw.write("1233\r\n");
			fw.write("abc");
			
			System.out.println("출력 완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 :" + e.getMessage());
		}finally {
			if( fw != null) try {fw.close();} catch(IOException e) {}
		}
	}

}
