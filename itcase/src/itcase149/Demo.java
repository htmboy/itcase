package itcase149;

/**
 * 
 * 当一个抽象类中的方法都是抽象的时候, 这时可以将该抽象类用
 * 另一种形式定义和表示, 就是接口 interface
 * 定义接口使用的关键字时interface
 * 
 * 对于接口当中常见的成员:
 * 有其固定的修饰符
 * 1, 全局常量: public static final
 * 2, 抽象方法: public abstract
 * 
 * 接口中的成员都是公共的权限
 * 
 * 类与类之间是继承关系, 类与接口是实现关系
 * 接口不可以实例化
 * 由实现了接口的子类并覆盖了接口中所有的方法, 子类才可以实例化
 */

interface InterfaceDemo{
	public static final int NUM = 4;
	public abstract void show();
	public abstract void show2();
	/**
	 * 可以简写, 但是阅读性不强
	 * int NUM = 4;
	 * void show();
	 * void show1();
	 * 
	 * **/
}

class DemoImpl implements InterfaceDemo{
	public void show() {
		System.out.println("show run");
	}
	public void show2() {
		
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoImpl d = new DemoImpl();
		// d.NUM = 3;
		System.out.println(d.NUM);
		System.out.println(DemoImpl.NUM);
		System.out.println(InterfaceDemo.NUM);
	}

}
