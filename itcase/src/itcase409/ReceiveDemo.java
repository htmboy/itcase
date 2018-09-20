package itcase409;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo {

	public static void main(String[] args) throws IOException {
		System.out.println("接收端启动");
		/**
		 * 	建立udp socket服务
		 * 	需要制定端口号
		 * 	创建数据包, 用于存储接收到的数据. 方便用数据包对象的方法解析这些数据
		 * 	使用socket服务的recieve方法将接受的数据存储到数据包中
		 * 	通过数据包的方法解析数据包中的数据
		 * 	关闭资源
		 * 
		 * 
		 * 
		 * **/ 
		
		// 建立udp socket 服务
		DatagramSocket ds = new DatagramSocket(1000);
		
		while(true) {
		
			// 创建数据包
			byte[] buf = new byte[1024];
			DatagramPacket dp = new DatagramPacket(buf, buf.length);
			
			// 使用接收方法将数据存储到数据包中
			ds.receive(dp); // 阻塞式
			
			// 通过数据包对象的方法, 解析其中的数据, 比如, 地址, 端口, 数据内容
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
