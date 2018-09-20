package itcase410;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

class SendDemo implements Runnable{
	private DatagramSocket ds;
	
	public SendDemo(DatagramSocket ds) {
		this.ds = ds;
	}
	
	public void run() {
		try { // 这里面不能抛异常, 在此处加捕获异常
			BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
			String line = null;
			while((line = bufr.readLine()) != null) {
				byte[] buf = line.getBytes();
				DatagramPacket dp = 
						new DatagramPacket(buf, buf.length, InetAddress.getByName("192.168.124.255"), 1000);
				/**
				 * 	ip地址第四个域 255 是广播域
				 * 
				 * **/
				ds.send(dp);
				if("886".equals(line))
					break;
			}
			ds.close();
		}catch (Exception e) {
			
		}
	}
}
