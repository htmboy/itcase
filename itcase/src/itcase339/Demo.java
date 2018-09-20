package itcase339;

/*
 * 装饰设计模式
 * 对一组对象的功能进行增强时, 就可以使用该模式进行问题解决
 * 
 * 装饰模式和继承都能实现一样的特点: 进行功能的扩展. 
 * 装饰模式和继承的区别
 * 首先有一个继承体系
 * writer
 * 		|--textwriter: 用于操作文本
 * 		|--mediawriter: 用于操作媒体
 * 
 * 想要对操作的动作进行效率的提高
 * 按照面向对象, 可以通过继承对具体的进行功能的扩展
 * 效率提高需要加入缓冲技术
 * writer
 * 		|--textwriter: 用于操作文本
 * 			|--bufferedtextwriter: 加入了缓冲技术的操作文本对象
 * 		|--mediawriter: 用于操作媒体
 * 			|--bufferedmediawriter: 加入了缓冲技术的操作媒体
 * 
 * 到这里就结束了. 但是这样的做法并不理想
 * 如果这个体系进行功能扩展, 又多了流对象
 * 那么这个流要提高效率, 是不是也要产生子类对象, 是, 这时就会发现只为提高功能, 进行的继承
 * 导致继承体系越来越臃肿, 不够灵活;
 * 既然加入的都是同一种技术 -- 缓冲
 * */

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Person();
//		p.chifan();
		
		// 设计模式
		NewPerson p1 = new NewPerson(p);
		p1.chifan();
		
		NewPerson2 p2 = new NewPerson2(p);
		p2.chifan();
	}

}

// 不需要改动原理的代码
class Person {
	void chifan() {
		System.out.println("吃饭");
	}
}

// 这个类的出现是为了增强Person而出现的
class NewPerson {
	private Person p;
	NewPerson(Person p) {
		this.p = p;
	}
	
	public void chifan() {
		System.out.println("开胃酒");
		p.chifan();
		System.out.println("甜点");
	}
}

class NewPerson2 extends Person {
	public void chifan() {
		System.out.println("开胃酒");
		super.chifan();
		System.out.println("甜点");
	}
}