package itcase324;

import java.io.FileWriter;
import java.io.IOException;

public class Demo {
	
	// ����
	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// ����ļ�������, �򴴽��ļ�
		// ����ļ�����, ��ᱻ����
		FileWriter fw = new FileWriter("demo1.txt");
		
		// ����Writer�����е�write(String)����, д������
		// ��ʵ����д�뵽��ʱ�洢��������
		fw.write("abcde" + LINE_SEPARATOR + "haha");
		
		// ����ˢ��, ������ֱ��д�뵽Ŀ����
//		fw.flush();
		
		// �ر���, ���Զ�����flush();
		fw.close();
	}

}
