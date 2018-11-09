package itcase360;

import java.io.IOException;
import java.io.InputStream;

public class SystemIn {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		readKey2();
	}
	public static void readKey2() throws IOException {
		InputStream in = System.in;
		StringBuilder buf = new StringBuilder();
		int ch = 0;
		while((ch = in.read()) != -1) {
			if(ch == '\r')
				continue;
			if(ch == '\n') {
				if(buf.toString().equals("over"))
					break;
				System.out.println(buf.toString());
				buf.delete(0, buf.length());
			}
			else
			buf.append((char)ch);
			
		}
		
	}
	
	public static void readKey() throws IOException {
		InputStream in = System.in;
		int ch = in.read();
		System.out.println((char)ch);
	}

}
