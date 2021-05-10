package ex01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class newgugudandan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		
			try {
				br = new BufferedReader(new FileReader("./gugudan.txt"));
				bw = new BufferedWriter(new FileWriter("./newgugudan.txt"));
				
				int data = 0;
				
				while((data = br.read())!= -1) {
					bw.write(data);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("오류 :" + e.getMessage());
			} finally {
				if(br != null) try {br.close();} catch(IOException e) {}
				if(bw != null) try {bw.close();} catch(IOException e) {}
			}
			
		
		
		
}
}