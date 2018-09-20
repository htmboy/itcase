package itcase025;

public class Demo {

	public static void main(String[] args) {

		// 字符可以参与运算
		// 参与运算时, 会将字符转化成ascii码, 然后运算
		// 可以用char强制转化成ascii对应的字符
		System.out.println('a' + 1);
		System.out.println((char)('a' + 1));
		
		byte b = 4; // 4是int类型的常量 编译器会判断是否在byte范围内, 如果在就自动强制转化成byte类型
		b = 3 + 7; // 右边是常量, 运算后判断是否在byte范围内, 然后自动强转, 再赋值;
		byte b1 = 3;
		byte b2 = 7;
		// b = b1 + b2; // b1 和 b2 是变量, 值是会变化的, 不能判断是否在byte范围内, 所以不能赋值
		int x;
		int x1 = Integer.MAX_VALUE; // int类型的最大值 2147483647
		int x2 = 2;
		x = x1 + x2; // 超出范围, 底层会自动舍弃高位
		
		System.out.println(x);
	}

}
