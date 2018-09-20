package itcase148;
/**
 * 
 * 	1, 抽象类中有构造函数吗?
 * 	有, 用于给子类对象进行初始化
 * 
 * 	2, 抽象类可以不定义抽象方法吗?
 * 	可以, 但是很少见, 目的就是不让该类创建对象, ANT的适配器对象就是这种类
 * 	通常这个类中的方法有方法体, 但是却没有内容
 * 
 * 	3, 抽象关键字不可以和哪些关键字共存?
 * 	private 不行, 抽象需要被继承覆盖
 * 	static 不行, 抽象类需要创建对象
 * 	final 不行, 如果修饰类的话可以, 
 * 
 * 
 * **/

/**
 * 
 *  雇员示例:
 *  需求: 公司中程序员有姓名, 工号, 薪水, 工作内容
 *  项目经理除了有姓名, 工号, 薪水, 还有奖金, 工作内容
 *  对给处需求进行数据建模
 *  
 *  分析:
 *  在这个问题领域中, 先找出涉及的对象
 *  通过名词提炼法
 *  程序员:
 *  	属性: 姓名, 工号, 薪水
 *  	行为: 工作
 *  经理: 
 *  	属性: 姓名, 工号, 薪水, 奖金
 *  	行为: 工作
 *  
 * 	程序员和经理不存在这直接继承关系
 * 	但是程序员和经理却具有共性内容
 *  可以进行抽取, 因为他们都是公司的雇员
 *  可以将程序员和经理进行抽取, 建立体系
 *  
 * **/

// 描述雇员
abstract class Employee{
	private String name;
	private String id;
	private double pay;
	Employee(String name, String id, double pay){
		this.name = name;
		this.id = id;
		this.pay = pay;
	}
	
	public abstract void work();
}

// 描述程序员
class Programmer extends Employee{
	Programmer(String name, String id, double pay){
		super(name, id, pay);
	}
	public void work() {
		System.out.println("code...");
	}
}

// 描述经理
class Manager extends Employee{
	private int bonus;
	Manager(String name, String id, double pay){
		super(name, id, pay);
	}
	@Override
	public void work() {
		// TODO Auto-generated method stub
		
	}
}



public class Demo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Person{
	private String name;
	private int age;
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

class Student extends Person{
	Student(String name, int age){
		super(name, age);
	}
}

class Worker extends Person{
	Worker(String name, int age){
		super(name, age);
	}
}