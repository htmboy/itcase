package itcase410;

import java.net.DatagramSocket;
import java.net.SocketException;

public class ChatDemo {

	public static void main(String[] args) throws SocketException {
		// TODO Auto-generated method stub
		DatagramSocket send = new DatagramSocket();
		DatagramSocket rece = new DatagramSocket(1000);
		new Thread(new SendDemo(send)).start();
		new Thread(new ReceDemo(rece)).start();
	}

}
