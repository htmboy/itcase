package itcase332;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 字符流的缓冲区
 * 缓冲区的出现提高了对数据的读写效率
 * 对应类
 * BufferedWriter
 * BufferedReader
 * 缓冲区要结合流才可以使用
 * 在流的基础上对流的功能进行了增强
 * */

public class Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileWriter fw = new FileWriter("buf2.txt");
		
		BufferedWriter bufw = new BufferedWriter(fw);
		
		// 使用缓冲区的写入方法将数据先写入到缓冲区中
		bufw.write("abcded第三方甘道夫三公司电饭锅");
		bufw.newLine(); // 这个换行只有在BufferedWriter对象里有效
		bufw.write("haha阿道夫供电所富贵酥大风歌我");
		
		// 使用缓冲区的刷新方法将数据刷到目的地中
		bufw.flush();
		
		// 关闭缓存区, 其实关闭的就是被缓冲的流对象
		bufw.close();
	}

}
