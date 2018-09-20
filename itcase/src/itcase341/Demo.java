package itcase341;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Demo {
	// 读代码的时候需要行号
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("demo1.txt");
		
		// 读取行号
		LineNumberReader lnr = new LineNumberReader(fr);
		
		String line = null;
		
		while((line = lnr.readLine()) != null) {
			// System.out.println(line);
			System.out.println(lnr.getLineNumber() + ":" + line);
		}
		
		lnr.close();

	}

}
