package itcase410;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

class ReceDemo implements Runnable{
	private DatagramSocket ds;
	public ReceDemo(DatagramSocket ds) {
		this.ds = ds;
	}
	public void run() {
		while(true) {
			byte[] buf = new byte[1024];
			DatagramPacket dp = new DatagramPacket(buf, buf.length);
			try {
				ds.receive(dp);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String ip = dp.getAddress().getHostAddress();
			int port = dp.getPort();
			String text = new String(dp.getData(), 0, dp.getLength());
			System.out.println(ip + ":" + port + ":" + text);
			if(text.equals("886")) {
				System.out.println(ip + "....Àë¿ªÁÄÌìÊÒ");
			}
		}
	}
}
