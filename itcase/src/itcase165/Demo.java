package itcase165;
/**
 * 
 * 内部类访问特点
 * 1, 内部类可以直接访问外部类中的成员
 * 2, 外部类要访问内部类, 必须建立内部类的对象
 * 
 * 内部类用于类的设计
 * 分析事物时, 发现该事物描述中还有事物, 而且这个事物还在访问被描述事物的内容
 * 这时就是还有事物定义成内部类来描述
 * **/

class Outer{
	private int num = 3;
	// 如果变成静态, 类一加载, 内部类就存在, 相当于一个外部类
	// static class Inner
	class Inner{ // 内部类 如果内部类里面有静态成员, 那必须声明静态类
		void show() {
			System.out.println("show run..." + num);
		}
		// static void function (){} //如果内部类里面有静态成员, 那必须声明静态类
	}
	public void method() {
		Inner in = new Inner(); // 建立内部类的对象
		in.show();
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer out = new Outer();
		out.method();
		// 直接访问内部类
		Outer.Inner in = new Outer().new Inner();
		in.show();
		// 如果内部类是静态类
		// Outer.Inner in = new Outer.Inner();
		// in.show();
	}

}
