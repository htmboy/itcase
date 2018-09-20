package itcase418;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class UploadPicClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// �����ͻ��� socket
		Socket s = new Socket("192.168.124.132", 1003);
		
		// ��ȡ�ͻ���Ҫ�ϴ���ͼƬ�ļ�
		FileInputStream fis = new FileInputStream("c:\\01.jpg");
		
		// ��ȡsocket�����, ��������ͼƬ���ݷ��͸������
		OutputStream out = s.getOutputStream();
		byte[] buf = new byte[1024];
		int len = 0;
		while((len = fis.read(buf)) != -1) {
			out.write(buf, 0, len);
		}
		
		// ���߷����, ��ߵ����ݷ������, �÷����ֹͣ��ȡ
		s.shutdownOutput();
		
		// ��ȡ����˷��ص�����
		InputStream in = s.getInputStream();
		byte[] bufIn = new byte[1024];
		int lenIn = in.read(bufIn);
		String text = new String(buf, 0, lenIn);
		System.out.println(text);
		fis.close();
		s.close();

	}

}
