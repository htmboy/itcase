package itcase408;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Demo {

	public static void main(String[] args) throws IOException {
		System.out.println("发送端启动");
		/**
		 * 	创建udp传输的发送端
		 * 	思路:
		 * 	1, 建立udp的socket服务
		 * 	2, 将要发送的数据封装到数据包中
		 * 	3, 通过udp的socket服务将数据包发送出去
		 * 	4, 关闭socket服务
		 * 
		 * **/ 
		 // udpsocket服务, 使用DatagramSocket对象
		DatagramSocket ds = new DatagramSocket();
		
		// 将要发送的数据封装到数据包中
		String str = "udp传输演示: 哥们来了!";
		
		// 使用DatagramPacket将数据封装到该对象包中
		byte[] buf = str.getBytes();
		
		DatagramPacket dp = 
				new DatagramPacket(buf, buf.length, InetAddress.getByName("127.0.0.1"), 1000);
		
		// 通过udp的socket服务将数据包发出去, 使用send方法
		ds.send(dp);
		
		ds.close();
		
	}

}
