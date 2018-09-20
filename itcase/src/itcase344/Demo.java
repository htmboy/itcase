package itcase344;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// readKey();
		// readKey2();
		readKey3();
	}

	private static void readKey3() throws IOException {
		// TODO Auto-generated method stub
		
		InputStream in = System.in;
		
		// 将字节转成字符的桥梁, 转化流
		InputStreamReader isr = new InputStreamReader(in);
		
		// 字符流
		BufferedReader bufr = new BufferedReader(isr);
		
		String line = null;
		while((line = bufr.readLine()) != null) {
			if("over".equals(line))
				break;
			System.out.println(line.toUpperCase());
		}
		
	}

	private static void readKey2() throws IOException {
		// TODO Auto-generated method stub
		
		// 创建容器
		StringBuilder sb = new StringBuilder();
		
		// 获取键盘读取流
		InputStream in = System.in;
		
		// 定义变量,记录读取到的字节, 并循环获取
		int ch = 0;
		
		
		while((ch = in.read()) != -1) {
			
			// 在存储之前需要判断是否是换行标记, 因为换行标记不存储
			if(ch == '\r')
				continue;
			if(ch == '\n') {
				String temp = sb.toString();
				if("over".equals(temp))
					break;
				System.out.println(temp.toUpperCase());
				sb.delete(0, sb.length());
			}
			else
			// 将读取到的字节存储到StringBuilder中
			sb.append((char)ch);
				
//			System.out.println(sb);
		}
	}

	private static void readKey() throws IOException {
		// TODO Auto-generated method stub
		InputStream in = System.in;
		// 阻塞式方法
		int ch = in.read();
		System.out.println(ch);
	}

}
