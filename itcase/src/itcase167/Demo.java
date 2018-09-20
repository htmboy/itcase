package itcase167;
/**
 * 
 * 为什么内部类能直接访问外部类中的成员呢?
 * 那是因为内部类持有了外部类的引用, 外部类名为this
 * 
 * 内部类可以放在局部方法位置上
 * **/

class Outer{
	int num = 3;
	class Inner{
		int num = 4;
		void show() {
			int num = 5;
			System.out.println(this.num);
			System.out.println(Outer.this.num);
			System.out.println(num);
		}
		
	}
	void function () {
		final int x = 9;
		class Inner2{
			void show2() {
				System.out.println("show ..." + x); // 在局部的内部类型访问的外部成员必须为final
			}
		}
		Inner2 in = new Inner2();
		in.show2();
	}
	void method() {
		new Inner().show();
		new Outer().function();
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Outer().method();
	}

}
