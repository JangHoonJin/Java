package ex01;

import java.io.FileWriter;
import java.io.IOException;

public class GugudanEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("./newgugudan.txt");
			fw.write("\n ==== 3단 ==== \n");
			
			fw.write("2x1 = 2 \n");
			fw.write("2x2 = 4 \n");
			fw.write("2x3 = 6 \n");
			fw.write("2x4 = 8 \n");
			fw.write("2x5 = 10 \n");
			fw.write("2x6 = 12 \n");
			fw.write("2x7 = 14 \n");
			fw.write("2x8 = 16 \n");
			fw.write("2x9 = 18 \n");
			
			fw.write("\n ==== 3단 ==== \n");
			fw.write("3x1 = 3 \n");
			fw.write("3x2 = 6 \n");
			fw.write("3x3 = 9 \n");
			fw.write("3x4 = 12 \n");
			fw.write("3x5 = 15 \n");
			fw.write("3x6 = 18 \n");
			fw.write("3x7 = 21 \n");
			fw.write("3x8 = 24 \n");
			fw.write("3x9 = 27 \n");
			
			fw.write("\n ==== 4단 ==== \n");
			
			fw.write("4x1 = 1 \n");
			fw.write("4x2 = 8 \n");
			fw.write("4x3 = 12 \n");
			fw.write("4x4 = 16 \n");
			fw.write("4x5 = 20 \n");
			fw.write("4x6 = 24 \n");
			fw.write("4x7 = 28 \n");
			fw.write("4x8 = 32 \n");
			fw.write("4x9 = 36 \n");
			System.out.println("출력완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 : " + e.getMessage());
		}finally {
			if(fw != null) try {fw.close();} catch(IOException e) {}
			
		}
	}

}
