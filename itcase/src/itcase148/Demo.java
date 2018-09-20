package itcase148;
/**
 * 
 * 	1, ���������й��캯����?
 * 	��, ���ڸ����������г�ʼ��
 * 
 * 	2, ��������Բ�������󷽷���?
 * 	����, ���Ǻ��ټ�, Ŀ�ľ��ǲ��ø��ഴ������, ANT���������������������
 * 	ͨ��������еķ����з�����, ����ȴû������
 * 
 * 	3, ����ؼ��ֲ����Ժ���Щ�ؼ��ֹ���?
 * 	private ����, ������Ҫ���̳и���
 * 	static ����, ��������Ҫ��������
 * 	final ����, ���������Ļ�����, 
 * 
 * 
 * **/

/**
 * 
 *  ��Աʾ��:
 *  ����: ��˾�г���Ա������, ����, нˮ, ��������
 *  ��Ŀ�������������, ����, нˮ, ���н���, ��������
 *  �Ը�������������ݽ�ģ
 *  
 *  ����:
 *  ���������������, ���ҳ��漰�Ķ���
 *  ͨ������������
 *  ����Ա:
 *  	����: ����, ����, нˮ
 *  	��Ϊ: ����
 *  ����: 
 *  	����: ����, ����, нˮ, ����
 *  	��Ϊ: ����
 *  
 * 	����Ա�;���������ֱ�Ӽ̳й�ϵ
 * 	���ǳ���Ա�;���ȴ���й�������
 *  ���Խ��г�ȡ, ��Ϊ���Ƕ��ǹ�˾�Ĺ�Ա
 *  ���Խ�����Ա�;�����г�ȡ, ������ϵ
 *  
 * **/

// ������Ա
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

// ��������Ա
class Programmer extends Employee{
	Programmer(String name, String id, double pay){
		super(name, id, pay);
	}
	public void work() {
		System.out.println("code...");
	}
}

// ��������
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