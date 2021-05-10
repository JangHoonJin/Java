package ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 명령프롬프트에 이미지를 불러오는법
		
				FileInputStream fis = null;
				FileOutputStream fos = null;
		
		
		
		
		try {
			fis = new FileInputStream("./Jellyfish.jpg");
			fos = new FileOutputStream("./newJellyfish.jpg");
			int data = 0;
			
			//파일의 내용을 복사하는 부분
			while((data=fis.read())!= -1) {
			fos.write(data);
			
			}
			System.out.println("복사완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 : " + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 : " + e.getMessage());
		} finally {
		if( fos != null ) try {fos.close();} catch(IOException e) {}
		if( fis != null ) try {fis.close();} catch(IOException e) {}
		}
	}

}
