package ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 명령프롬프트에 이미지를 불러오는법
		
//		FileInputStream fis = null;
//		FileOutputStream fos = null;
		// BufferedInputStream / bufferedOutputStream
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		
		try {
			//fis = new FileInputStream("./Jellyfish.jpg");
			//fos = new FileOutputStream("./newJellyfish.jpg");
			bis = new BufferedInputStream(new FileInputStream("./Jellyfish.jpg"));
			bos = new BufferedOutputStream(new FileOutputStream("./newJellyfish.jpg"));
			int data = 0;
			
			//파일의 내용을 복사하는 부분
			while((data=bis.read())!= -1) {
			bos.write(data);
			
			}
			System.out.println("복사완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 : " + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 : " + e.getMessage());
		} finally {
		if( bos != null ) try {bos.close();} catch(IOException e) {}
		if( bis != null ) try {bis.close();} catch(IOException e) {}
		}
	}

}
