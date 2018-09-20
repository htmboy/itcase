package itcase126;
/**
 * 
 * 静态代码块
 * 	随着类的加载, 而加载,
 * 	随着类的加载, 而执行
 * 	随着类的加载, 而初始化
 * 	类一进内存就运行了
 *	用得不多
 *
 *构造代码块
 *	可以给所有对象进行初始化
 *	随着实例的创建, 而加载
 *	随着实例的创建, 而执行
 *	随着实例的创建, 而初始化
 *	执行顺序是
 *		构造代码块->构造函数
 * **/

class StaticCode{
	static int num;
	static { // 匿名静态代码块, static 是修饰符, 不是名字
		num = 10;
		System.out.println("static");
	}
	void show() {
		System.out.println("show run");
	}
}

class Person{
	private String name;
	
	{ // 构造代码块, 
		System.out.println("person run");
	}
	Person(){
		name = "baby";
	}
	Person(String name){
		this.name = name;
	}
	public void speak() {
		{ // 局部代码块
			
		}
		System.out.println("name:" + name);
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new StaticCode().show();
		//new StaticCode().show();
		Person p1 = new Person();
		p1.speak();
		Person p2 = new Person("旺财");
		p2.speak();
	}

}
