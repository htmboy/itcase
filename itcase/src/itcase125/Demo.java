package itcase125;
/**
 * 静态什么时候用
 * 1, 静态变量
 * 	当分析对象中所具备的成员的值都是相同的
 * 	这时这个成员就可以被静态修饰
 * 	只要数据在对象中都是不同, 就是对象特有数据, 必须存储在对象中, 是非静态的
 * 	如果是相同的数据, 对象不需要做修改, 只需要使用即可, 不需要存储在对象中, 定义成静态的
 * 2, 静态函数
 * 	函数是否用静态属性, 就参考一点, 就是该函数功能是否有访问到对象中的特有数据
 * 	简单点说, 从源代码看, 该功能是否需要访问非静态的成员变量, 如果需要, 该功能就是非静态的
 * 	如果不需要, 就可以将该功能定义成静态的
 * 
 * **/

class StaticDemo{
	int age;
	static int num = 9;
	public static void speak() {
		// System.out.println(age); // 不能写this.age
	}
}
public class Demo {

	public static void main(String[] args) {
		
		
	}

}
