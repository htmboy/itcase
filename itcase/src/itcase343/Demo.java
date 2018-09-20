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
		
		// �ٶȱȽϿ�, �����ļ�̫�� �Ͳ�һ����
		FileInputStream fis = new FileInputStream("�ļ�");
		FileOutputStream fos = new FileOutputStream("Ŀ��");
		
		// �Զ��建����
		byte[] buf = new byte[1024];
		int len = 0;
		
		// read() �������������buf ���ǻ����ѭ�� 
 		while((len = fis.read(buf)) != -1) {
			fos.write(buf, 0, len);
		}
		fis.close();
		fos.close();
	}
	
	public static void copy_2() throws IOException {
		FileInputStream fis = new FileInputStream("�ļ�");
		BufferedInputStream bufis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("Ŀ��");
		BufferedOutputStream bufos = new BufferedOutputStream(fos);
		
		// ʹ�û���, �Ͳ���Ҫ���建����
		
		int ch = 0;
		
		// 
 		while((ch = bufis.read()) != -1) {
			bufos.write(ch);
		}
		bufis.close();
		bufos.close();
	}
	
public static void copy_3() throws IOException {
		
		// С�ļ� �ı��ļ�,������������
		FileInputStream fis = new FileInputStream("�ļ�");
		FileOutputStream fos = new FileOutputStream("Ŀ��");
		
		// fis.available() �õ��ļ����ֽ���
		byte[] buf = new byte[fis.available()];
		fis.read(buf);
		fos.write(buf);

		fis.close();
		fos.close();
	}
}
