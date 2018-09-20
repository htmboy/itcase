package itcase414;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 
 * 	
 * 	����tcp����˵�˼·
 * 	1, ���������socket�������, ͨ��ServerSocket����
 * 	2, ����˱�������ṩһ���ӿ�, ����ͻ����޷�����
 * 	3, ��ȡ���ӹ����Ŀͻ��˶���
 * 	4, ͨ���ͻ��˶����ȡsocket����ȡ�ͻ��˷��������ݲ���ӡ�ڿ���̨��
 * 	5, �ر���
 * 
 * **/
public class ServerDemo {

	public static void main(String[] args) throws IOException {
		// ��������˶���
		ServerSocket ss = new ServerSocket(1002);
		
		// ��ȡ���ӹ����Ŀͻ��˶���
		Socket s = ss.accept();
		
		String ip = s.getInetAddress().getHostAddress();
		
		// ͨ��socket�����ȡ������, Ҫ��ȡ�ͻ��˷���������
		InputStream in = s.getInputStream();
		
		byte[] buf = new byte[1024];
		
		int len = in.read(buf);
		String text = new String(buf, 0, len);
		
		System.out.println(ip + "server:" + text);
		
		// ʹ�ÿͻ���socket�������������ͻ��˷�������
		OutputStream out = s.getOutputStream();
		out.write("�յ�".getBytes());
		// �ر���Դ
		s.close();
		ss.close();

	}

}
