package itcase162;
/**
 * 
 * 多态时
 * 成员的特点
 * 父类比较特别
 * 1, 成员的特点:
 * 1, 成员变量
 * 
 * **/

class Fu{
	int num = 3;
	
	static void method() {
		System.out.println("fu static method");
	}
}

class Zi extends Fu{
//	int num = 4;
	
//	static void method() {
//		System.out.println("zi static method");
//	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fu f = new Zi();
		System.out.println(f.num); // 会调用fu的num, 方法会覆盖, 变量不会覆盖 , 父类没有就报错
		Zi z = new Zi();
		System.out.println(z.num); // 调用zi的num, 如果没有, 就往父类找
		Fu fs = new Zi();
		fs.method(); // 静态方法比较特殊
		Zi zs = new Zi();
		zs.method(); // 先本类找, 本类没有就往父类找
		
	}

}
