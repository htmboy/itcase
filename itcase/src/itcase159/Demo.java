package itcase159;
/**
 * ����Ķ�̬��
 * 
 * ʵ�ʾ��Ǹ���ָ������
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
		Animal a = new Cat(); // ����Ķ�̬��, �߱�cat��̬, �־߱�animal��̬, ��Ӧ�Ų�ͬ����
		Dog d = new Dog();
		Animal o = new Dog(); // ����Ķ�̬��, Ҳ������������, ����Ϊ��������
		Cat c2 = (Cat)a; // ����ת��, Ŀ����Ϊ��ʹ�������е����з���
		// Animal a = new Animal(); // ���ܸ���ǿת����
		// Cat c = (Cat)a;
	}

}
