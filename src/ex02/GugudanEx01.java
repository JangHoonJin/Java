package ex02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GugudanEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			
			
			System.out.println("시작 단수 :");
			int startDan = Integer.parseInt(br.readLine());

			System.out.println("끝 단수 :");
			int endDan = Integer.parseInt(br.readLine());
			
			for( int i=startDan; i<=endDan; i++) {
				for(int j=1; j<=9; j++) {
					System.out.printf("%d X %d = %d\t", i,j,(i*j)  );
					
				}
				System.out.println();
			}
				System.out.println("출력 완료");
			
			
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 :" + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 :" + e.getMessage());
		}finally{
			if(br != null) try {br.close();} catch(IOException e) {}
		}
	}

}
