package itcase159;
/**
 * 对象的多态性
 * 
 * 实质就是父类指向子类
 * 
 * 
 * **/

class Animal{
	
}

class Dog extends Animal{
	
}

class Cat extends Animal{
	
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c = new Cat();
		Animal a = new Cat(); // 对象的多态性, 具备cat型态, 又具备animal形态, 对应着不同类型
		Dog d = new Dog();
		Animal o = new Dog(); // 对象的多态性, 也是提升了类型, 提升为动物类型
		Cat c2 = (Cat)a; // 向下转型, 目的是为了使用子类中的特有方法
		// Animal a = new Animal(); // 不能父类强转子类
		// Cat c = (Cat)a;
	}

}
