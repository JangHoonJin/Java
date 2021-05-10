package ex03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class SearchZipcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BufferedReader fr = null;
		BufferedReader br = null;
		
		
			try {
				fr = new BufferedReader(new FileReader("./zipcode_seoul_utf8_type2.csv")); 
				br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("입력 :");
				String data = null;
				
				while((data = fr.readLine()) != null) {
					System.out.println("입력내용 : " + data);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("에러 : " + e.getMessage());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("에러 : " + e.getMessage());
			}finally {
				if(fr != null) try {fr.close();} catch(IOException e) {}
				if(br != null) try {br.close();} catch(IOException e) {}
			}
	
			
			
		
		
	}

}
