package itcase059;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 函数是类中具有特定功能的一段小程序, 也称为方法
		int a = 3;
		int b = 4;
		int c;
		// c = a + b;
		// c = 5 + 7;
		// c = 5 + 8;
		c = add(a, b);
		System.out.println("c=" + c);
	}
	
	static int add(int a, int b){ // 静态方法 只能直接调用静态方法
		return a + b;
	}
	
	// 特殊情况: 方法没有具体返回值时, 返回值类型用 void 来表示
	// return 语句可以省略不写

}
