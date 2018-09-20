package itcase344;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// readKey();
		// readKey2();
		readKey3();
	}

	private static void readKey3() throws IOException {
		// TODO Auto-generated method stub
		
		InputStream in = System.in;
		
		// ���ֽ�ת���ַ�������, ת����
		InputStreamReader isr = new InputStreamReader(in);
		
		// �ַ���
		BufferedReader bufr = new BufferedReader(isr);
		
		String line = null;
		while((line = bufr.readLine()) != null) {
			if("over".equals(line))
				break;
			System.out.println(line.toUpperCase());
		}
		
	}

	private static void readKey2() throws IOException {
		// TODO Auto-generated method stub
		
		// ��������
		StringBuilder sb = new StringBuilder();
		
		// ��ȡ���̶�ȡ��
		InputStream in = System.in;
		
		// �������,��¼��ȡ�����ֽ�, ��ѭ����ȡ
		int ch = 0;
		
		
		while((ch = in.read()) != -1) {
			
			// �ڴ洢֮ǰ��Ҫ�ж��Ƿ��ǻ��б��, ��Ϊ���б�ǲ��洢
			if(ch == '\r')
				continue;
			if(ch == '\n') {
				String temp = sb.toString();
				if("over".equals(temp))
					break;
				System.out.println(temp.toUpperCase());
				sb.delete(0, sb.length());
			}
			else
			// ����ȡ�����ֽڴ洢��StringBuilder��
			sb.append((char)ch);
				
//			System.out.println(sb);
		}
	}

	private static void readKey() throws IOException {
		// TODO Auto-generated method stub
		InputStream in = System.in;
		// ����ʽ����
		int ch = in.read();
		System.out.println(ch);
	}

}
