package itcase409;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo {

	public static void main(String[] args) throws IOException {
		System.out.println("���ն�����");
		/**
		 * 	����udp socket����
		 * 	��Ҫ�ƶ��˿ں�
		 * 	�������ݰ�, ���ڴ洢���յ�������. ���������ݰ�����ķ���������Щ����
		 * 	ʹ��socket�����recieve���������ܵ����ݴ洢�����ݰ���
		 * 	ͨ�����ݰ��ķ����������ݰ��е�����
		 * 	�ر���Դ
		 * 
		 * 
		 * 
		 * **/ 
		
		// ����udp socket ����
		DatagramSocket ds = new DatagramSocket(1000);
		
		while(true) {
		
			// �������ݰ�
			byte[] buf = new byte[1024];
			DatagramPacket dp = new DatagramPacket(buf, buf.length);
			
			// ʹ�ý��շ��������ݴ洢�����ݰ���
			ds.receive(dp); // ����ʽ
			
			// ͨ�����ݰ�����ķ���, �������е�����, ����, ��ַ, �˿�, ��������
			String ip = dp.getAddress().getHostAddress();
			int port = dp.getPort();
			String text = new String(dp.getData(), 0, dp.getLength());
			if("over".equals(text))
				break;
			System.out.println(ip + ":" + port + ":" + text);
			
			// 
		}
		ds.close();
//		dp.getData();

	}

}
