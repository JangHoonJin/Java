package ex01;

import java.io.FileWriter;
import java.io.IOException;

public class GugudanEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(args.length != 2) {
			System.out.println("입력오류");
			System.exit(0);
		}
		//시작단과 끝단을 만드는 부분
		int startDan = Integer.parseInt(args[0]);
		int endDan = Integer.parseInt(args[1]);
		//
		
		FileWriter fw = null;
		try {
			fw = new FileWriter("./gugudan.txt");
			
			
			for( int i=startDan; i<=endDan; i++) {
				for(int j=1; j<=9; j++) {
					String msg = String.format("%d X %d = %d\t", i,j,(i*j)  );
					fw.write(msg);
				}
				fw.write("\r\n");
			}
				System.out.println("출력 완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 :" + e.getMessage());
		} finally {
			if(fw != null) try {fw.close();} catch(IOException e) {}
		}
	}

}
