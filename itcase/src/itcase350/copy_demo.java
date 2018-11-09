package itcase350;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class copy_demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		new copy_demo().copyFile();
//		new copy_demo().copyFile2();
		new copy_demo().copyFile3();
	}
	public void copyFile3() throws IOException {
		FileInputStream fis;
		FileOutputStream fos;
		fis = new FileInputStream("d://stuff.mp4");
		fos = new FileOutputStream("c://001//stuff.mp4");
		
		byte[] buf = new byte[fis.available()];
		fis.read(buf);
		fos.write(buf);
		fis.close();
		fos.close();
		
	}
	public void copyFile() throws IOException {
		FileInputStream fis;
		FileOutputStream fos;
		BufferedOutputStream bos;
		BufferedInputStream bis;
		try {
			fis = new FileInputStream("d://stuff.mp4");
			fos = new FileOutputStream("c://001//stuff.mp4");
			
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			

			int len = 0;
			while((len = bis.read()) != -1) {
				bos.write(len);
			}
			bis.close();
			bos.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
	
	public void copyFile2() throws IOException {
		FileInputStream fis;
		FileOutputStream fos;
		try {
			fis = new FileInputStream("d://stuff.mp4");
			fos = new FileOutputStream("c://001//stuff.mp4");
			
			byte[] by = new byte[1024];
			
			int len = 0;
			while((len = fis.read(by)) != -1) {
				fos.write(by,0,len);
			}
			fis.close();
			fos.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
