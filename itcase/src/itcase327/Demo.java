package itcase327;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader fr = new FileReader("demo1.txt");
		
		/*
		int ch;
		
		// read() һ��ֻ��һ���ַ�
		while((ch = fr.read()) != -1) {
			System.out.print((char)ch);
		}
		*/
		
		// ʹ��read()����
		char[] buf = new char[3];
		
		int len = 0;
		
		while((len = fr.read(buf)) != -1) {
			System.out.println(new String(buf, 0, len));
		}
		
//		int num = fr.read(buf);
//		System.out.println(num + ":" + new String(buf, 0, num));
//		int num2 = fr.read(buf);
//		System.out.println(num2 + ":" + new String(buf, 0, num2));
		
		fr.close();
	}

}
