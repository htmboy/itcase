package itcase343;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		copy_1();
		copy_2();
		copy_3();
	}
	
	public static void copy_1() throws IOException {
		
		// 速度比较快, 但是文件太大 就不一定了
		FileInputStream fis = new FileInputStream("文件");
		FileOutputStream fos = new FileOutputStream("目标");
		
		// 自定义缓冲区
		byte[] buf = new byte[1024];
		int len = 0;
		
		// read() 里面如果不传入buf 就是会变死循环 
 		while((len = fis.read(buf)) != -1) {
			fos.write(buf, 0, len);
		}
		fis.close();
		fos.close();
	}
	
	public static void copy_2() throws IOException {
		FileInputStream fis = new FileInputStream("文件");
		BufferedInputStream bufis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("目标");
		BufferedOutputStream bufos = new BufferedOutputStream(fos);
		
		// 使用缓冲, 就不需要定义缓冲区
		
		int ch = 0;
		
		// 
 		while((ch = bufis.read()) != -1) {
			bufos.write(ch);
		}
		bufis.close();
		bufos.close();
	}
	
public static void copy_3() throws IOException {
		
		// 小文件 文本文件,可以这样处理
		FileInputStream fis = new FileInputStream("文件");
		FileOutputStream fos = new FileOutputStream("目标");
		
		// fis.available() 得到文件的字节数
		byte[] buf = new byte[fis.available()];
		fis.read(buf);
		fos.write(buf);

		fis.close();
		fos.close();
	}
}
