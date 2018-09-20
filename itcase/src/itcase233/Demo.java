package itcase233;

/*
 * String类
 * 字符串是一个特殊的对象
 * 字符串一旦初始化就不可以被改变
 * */

public class Demo {
	
	public static void main(String[] args) {
		
//		stringDemo1();
		stringDemo2();
	}
	
	private static void stringDemo2() {
		String s = "abc"; // 在字符串常量池, 创建了字符abc 并把地址付给s
		String s1 = new String("abc"); // 在堆内存创建了一个对象, 构造函数接受abc字符串
		System.out.println(s == s1);
		System.out.println("s=" + s);
		System.out.println("s1=" + s1);
	}
	
	/*
	 * 字符串定义的第一种方式, 明确字符串常量池的特点
	 * 
	 * */
	private static void stringDemo1() {
		
		String str = "abc"; // abc 存储在字符串常量池中
//		str = "nba";
		String s1 = "abc";
		System.out.println(str == s1);
		System.out.println("str=" + str);
	}
}
