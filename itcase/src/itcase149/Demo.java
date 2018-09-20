package itcase149;

/**
 * 
 * ��һ���������еķ������ǳ����ʱ��, ��ʱ���Խ��ó�������
 * ��һ����ʽ����ͱ�ʾ, ���ǽӿ� interface
 * ����ӿ�ʹ�õĹؼ���ʱinterface
 * 
 * ���ڽӿڵ��г����ĳ�Ա:
 * ����̶������η�
 * 1, ȫ�ֳ���: public static final
 * 2, ���󷽷�: public abstract
 * 
 * �ӿ��еĳ�Ա���ǹ�����Ȩ��
 * 
 * ������֮���Ǽ̳й�ϵ, ����ӿ���ʵ�ֹ�ϵ
 * �ӿڲ�����ʵ����
 * ��ʵ���˽ӿڵ����ಢ�����˽ӿ������еķ���, ����ſ���ʵ����
 */

interface InterfaceDemo{
	public static final int NUM = 4;
	public abstract void show();
	public abstract void show2();
	/**
	 * ���Լ�д, �����Ķ��Բ�ǿ
	 * int NUM = 4;
	 * void show();
	 * void show1();
	 * 
	 * **/
}

class DemoImpl implements InterfaceDemo{
	public void show() {
		System.out.println("show run");
	}
	public void show2() {
		
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoImpl d = new DemoImpl();
		// d.NUM = 3;
		System.out.println(d.NUM);
		System.out.println(DemoImpl.NUM);
		System.out.println(InterfaceDemo.NUM);
	}

}
