package itcase137;
/**
 * 
 * 当本类的成员和局部变量同名用this区分
 * 当子父类中的成员变量同名用super区分父类
 * 
 * this和super的用法很相似
 * 
 * this代表一个本来对象
 * super代表一个父类空间
 * 
 * 当子父类中出现成员函数一模一样的情况, 会运行子类的函数,
 * 这种现象, 称为覆盖操作, 这是函数在子父类中的特性
 * 函数两个特性, 
 * 1, 重载, 同一个类中, overload
 * 2, 覆盖, 子类中, 覆盖也称为重写, 复写, override
 * 
 * 覆盖注意事项:
 * 1, 子类方法覆盖父类方法时, 子类权限必须大于等于父类权限, 
 * 2, 静态只能覆盖静态, 或被静态覆盖, 这种情况很少见
 * **/
class Fu {
	int num = 4;
	void show() {
		System.out.println("Fu run");
	}
}
class Zi extends Fu {
	int num = 5;
	void show() {
		// 覆盖父类的操作
		// 函数有两个特性
		// 1, 重载 在同一个类中
		// 2, 覆盖, 子类中, 覆盖也称为重写, 复写, override
		System.out.println(this.num + "......" + super.num);
	}
}

public class Demo {

	public static void main(String[] args) {
		// 
		Zi a = new Zi();
		a.show();

	}

}
