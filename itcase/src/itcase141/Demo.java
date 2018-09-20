package itcase141;
/**
 * 
 * 	子父类中的构造函数的特点
 * 	
 * 	在子类构造对象时, 发现, 访问子类构造函数时, 父类也运行了. 为什么呢?
 * 	原因时: 在子类的构造函数中第一行有一个默认的隐式语句, super();
 * 
 * 	子类的实例化过程: 子类中所有的构造函数默认都会访问父类中的空参构造函数
 * 
 * 	为什么子类实例化的时候会调用父类的构造函数
 * 	父类会有属性, 当继承后, 获取到了父类中的内容, 即子类会有父类属性. 如果不调用父类的构造函数, 
 * 	父类的属性就不能初始化
 * 	所以子类在构造对象时, 必须访问父类的构造函数, 就在子类的构造函数中加入了super()语句.
 * 
 * 	注意: super语句必须要定义在子类构造函数的第一行, 因为父类的初始化必须先完成
 * **/

class Fu{
	Fu() {
		System.out.println("A fu run");
	}
	Fu(int x){
		
		System.out.println("B fu run..." + x);
	}
}

class Zi extends Fu{
	Zi(){
		// super(); // 隐藏了super(), 调用的就是父类的空参数的构造函数
		System.out.println("C zi run");
	}
	Zi(int x){ 
		this(); // 会调用上面的Zi();
		// super(x); // 如果不制定, 则会执行父类空参构造函数
		System.out.println("D zi run" + x);
	}
}

public class Demo {

	public static void main(String[] args) {
		// 
		new Zi(6);

	}

}
