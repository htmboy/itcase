package itcase408;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Demo {

	public static void main(String[] args) throws IOException {
		System.out.println("���Ͷ�����");
		/**
		 * 	����udp����ķ��Ͷ�
		 * 	˼·:
		 * 	1, ����udp��socket����
		 * 	2, ��Ҫ���͵����ݷ�װ�����ݰ���
		 * 	3, ͨ��udp��socket�������ݰ����ͳ�ȥ
		 * 	4, �ر�socket����
		 * 
		 * **/ 
		 // udpsocket����, ʹ��DatagramSocket����
		DatagramSocket ds = new DatagramSocket();
		
		// ��Ҫ���͵����ݷ�װ�����ݰ���
		String str = "udp������ʾ: ��������!";
		
		// ʹ��DatagramPacket�����ݷ�װ���ö������
		byte[] buf = str.getBytes();
		
		DatagramPacket dp = 
				new DatagramPacket(buf, buf.length, InetAddress.getByName("127.0.0.1"), 1000);
		
		// ͨ��udp��socket�������ݰ�����ȥ, ʹ��send����
		ds.send(dp);
		
		ds.close();
		
	}

}
