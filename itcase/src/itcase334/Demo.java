package itcase334;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("buf2.txt");
		BufferedReader bufr = new BufferedReader(fr);
		String line = null;
		
		// 一行一行读
		while((line = bufr.readLine()) != null) {
			System.out.println(line);
		}
//		String line1 = bufr.readLine();
//		System.out.println(line1);
		bufr.close();
	}
	
	public static void demo() throws IOException {
		FileReader fr = new FileReader("buf2.txt");
		
		char[] buf = new char[1024];
		int len = 0;
		while((len = fr.read(buf)) != -1) {
			System.out.println(new String(buf, 0, len));
		}
	}

}
