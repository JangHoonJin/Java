package ex04;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchZipcodeEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2자 입력받는거는 직접처리
	
		
		
		
		String strDong = "화곡";
		
		
		BufferedReader br = null;
		if(strDong.length()<2) {
			System.out.println("2글자 이상 입력하세요");
		}else {
		
		
		try {
			br = new BufferedReader(new FileReader("./zipcode_seoul_utf8_type2.csv"));
			
			String address = null;
			while ((address = br.readLine())!=null) {
				//System.out.println(adress);
				String[] addresses = address.split(",");
				if(addresses[3].startsWith(strDong)) {
					System.out.println(address);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 : " + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 : " + e.getMessage());
		} finally {
			if(br != null) try {br.close();} catch(IOException e) {}
			
		}
	}

}
	}
