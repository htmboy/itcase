package itcase143;

class Fu{ // 默认是继承Object, 隐藏了而已
	Fu(){
		super(); // 调用Object
		show(); // 被子类复写了, 所有执行了zi的show();
		return;
	}
	void show() {
		System.out.println("fu show");
	}
}
class Zi extends Fu{
	int num = 8;
	Zi(){
		super();
		// 通过super初始化内容时, 子类的成员变量并未显示初始化, 等super父类初始化完毕后, 
		// 才进行子类的成员变量显示初始化
		System.out.println("zi run ..." + num);
		return;
	}
	void show() { // 重写
		System.out.println("zi show..." + num);
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zi z = new Zi();
		z.show(); // 先在子类中找, 找不到, 到父类里找

	}

}
