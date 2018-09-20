package itcase406;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo {

	public static void main(String[] args) throws UnknownHostException {
		// 获取本地主机ip地址对象
		InetAddress ip = InetAddress.getLocalHost();
		// 获取其他主机的ip地址对象
		ip = InetAddress.getByName("tieba.baidu.com");
		System.out.println(ip.getHostAddress());
		System.out.println(ip.getHostName());
	}

}
