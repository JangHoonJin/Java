package ex01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedFileWriterEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//FileWriter로 데이터를 쓰는방법
		BufferedWriter bw = null;
		//FileWriter fw = null;
		
		try {
			//덮어쓰기 방식
			//fw = new FileWriter("./newtest.txt");
			
			//append 방식
			bw = new BufferedWriter(new FileWriter("./newtest.txt", true));
			
			bw.write("1233\r\n");
			bw.write("abc");
			bw.write("123233\r\n");
			
			System.out.println("출력 완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 :" + e.getMessage());
		}finally {
			if( bw != null) try {bw.close();} catch(IOException e) {}
		}
	}

}
