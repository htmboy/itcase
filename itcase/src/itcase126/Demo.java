package itcase126;
/**
 * 
 * ��̬�����
 * 	������ļ���, ������,
 * 	������ļ���, ��ִ��
 * 	������ļ���, ����ʼ��
 * 	��һ���ڴ��������
 *	�õò���
 *
 *��������
 *	���Ը����ж�����г�ʼ��
 *	����ʵ���Ĵ���, ������
 *	����ʵ���Ĵ���, ��ִ��
 *	����ʵ���Ĵ���, ����ʼ��
 *	ִ��˳����
 *		��������->���캯��
 * **/

class StaticCode{
	static int num;
	static { // ������̬�����, static �����η�, ��������
		num = 10;
		System.out.println("static");
	}
	void show() {
		System.out.println("show run");
	}
}

class Person{
	private String name;
	
	{ // ��������, 
		System.out.println("person run");
	}
	Person(){
		name = "baby";
	}
	Person(String name){
		this.name = name;
	}
	public void speak() {
		{ // �ֲ������
			
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
		Person p2 = new Person("����");
		p2.speak();
	}

}
