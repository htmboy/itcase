package itcase406;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo {

	public static void main(String[] args) throws UnknownHostException {
		// ��ȡ��������ip��ַ����
		InetAddress ip = InetAddress.getLocalHost();
		// ��ȡ����������ip��ַ����
		ip = InetAddress.getByName("tieba.baidu.com");
		System.out.println(ip.getHostAddress());
		System.out.println(ip.getHostName());
	}

}
