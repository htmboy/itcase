package itcase024;

public class Demo {

	public static void main(String[] args) {
		int x = 3; 
		x = x + 5;
		
		byte b = 3;
		// b = b + 4; // 4 是 4个字节 b是一个字节 运算后 b类型自动提升 再赋值回 1个字节的b变量 会报错
		b = (byte)(b + 4); // 强制转化类型 不会报错
		
		System.out.println(b);

	}

}
