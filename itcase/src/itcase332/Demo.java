package itcase332;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * �ַ����Ļ�����
 * �������ĳ�������˶����ݵĶ�дЧ��
 * ��Ӧ��
 * BufferedWriter
 * BufferedReader
 * ������Ҫ������ſ���ʹ��
 * �����Ļ����϶����Ĺ��ܽ�������ǿ
 * */

public class Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileWriter fw = new FileWriter("buf2.txt");
		
		BufferedWriter bufw = new BufferedWriter(fw);
		
		// ʹ�û�������д�뷽����������д�뵽��������
		bufw.write("abcded�������ʵ�������˾�緹��");
		bufw.newLine(); // �������ֻ����BufferedWriter��������Ч
		bufw.write("haha�����򹩵��������ִ�����");
		
		// ʹ�û�������ˢ�·���������ˢ��Ŀ�ĵ���
		bufw.flush();
		
		// �رջ�����, ��ʵ�رյľ��Ǳ������������
		bufw.close();
	}

}
