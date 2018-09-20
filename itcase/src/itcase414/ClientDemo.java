package itcase414;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 	tcp����, �ͻ��˽����Ĺ���
 * 	1, ����tcp�ͻ���socket����, ʹ�õ���Socket����
 * 	����ö���һ��������ȷĿ�ĵ�, Ҫ���ӵ�����
 * 	2, ������ӽ����ɹ�, ˵�����ݴ���ͨ���ѽ���
 * 	��ͨ������socket��, �ǵײ㽨���õ�, ��Ȼ����, ˵�������������, �������
 * 	��Ҫ����������������, ������Socket����ȡ
 * 	����ͨ��getOutputStream(), ��getInputStream()����ȡ�����ֽ���
 * 	3, ʹ�������, ������д��
 * 	4, �ر���Դ
 * 
 * 
 * **/
public class ClientDemo {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// �����ͻ���socket����
		Socket socket = new Socket("192.168.124.132", 1002);
		
		// ��ȡsocket���е������
		OutputStream out = socket.getOutputStream();
		
		// 
		out.write("tcp��ʾ: ����������!".getBytes());
		
		// ��ȡ����˷��ص�����, ʹ��socket��ȡ��
		InputStream in = socket.getInputStream();
		byte[] buf = new byte[1024];
		int len = in.read(buf);
		String text = new String(buf, 0, len);
		System.out.println(text);
		
		
		// �ر���Դ
		socket.close();
	}

}
