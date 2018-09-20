package itcase324;

import java.io.FileWriter;
import java.io.IOException;

public class Demo {
	
	// 换行
	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// 如果文件不存在, 则创建文件
		// 如果文件存在, 则会被覆盖
		FileWriter fw = new FileWriter("demo1.txt");
		
		// 调用Writer对象中的write(String)方法, 写入数据
		// 其实数据写入到临时存储缓冲区中
		fw.write("abcde" + LINE_SEPARATOR + "haha");
		
		// 进行刷新, 将数据直接写入到目标中
//		fw.flush();
		
		// 关闭流, 会自动调用flush();
		fw.close();
	}

}
