package itcase165;
/**
 * 
 * �ڲ�������ص�
 * 1, �ڲ������ֱ�ӷ����ⲿ���еĳ�Ա
 * 2, �ⲿ��Ҫ�����ڲ���, ���뽨���ڲ���Ķ���
 * 
 * �ڲ�������������
 * ��������ʱ, ���ָ����������л�������, ����������ﻹ�ڷ��ʱ��������������
 * ��ʱ���ǻ������ﶨ����ڲ���������
 * **/

class Outer{
	private int num = 3;
	// �����ɾ�̬, ��һ����, �ڲ���ʹ���, �൱��һ���ⲿ��
	// static class Inner
	class Inner{ // �ڲ��� ����ڲ��������о�̬��Ա, �Ǳ���������̬��
		void show() {
			System.out.println("show run..." + num);
		}
		// static void function (){} //����ڲ��������о�̬��Ա, �Ǳ���������̬��
	}
	public void method() {
		Inner in = new Inner(); // �����ڲ���Ķ���
		in.show();
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer out = new Outer();
		out.method();
		// ֱ�ӷ����ڲ���
		Outer.Inner in = new Outer().new Inner();
		in.show();
		// ����ڲ����Ǿ�̬��
		// Outer.Inner in = new Outer.Inner();
		// in.show();
	}

}
