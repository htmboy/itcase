package itcase167;
/**
 * 
 * Ϊʲô�ڲ�����ֱ�ӷ����ⲿ���еĳ�Ա��?
 * ������Ϊ�ڲ���������ⲿ�������, �ⲿ����Ϊthis
 * 
 * �ڲ�����Է��ھֲ�����λ����
 * **/

class Outer{
	int num = 3;
	class Inner{
		int num = 4;
		void show() {
			int num = 5;
			System.out.println(this.num);
			System.out.println(Outer.this.num);
			System.out.println(num);
		}
		
	}
	void function () {
		final int x = 9;
		class Inner2{
			void show2() {
				System.out.println("show ..." + x); // �ھֲ����ڲ����ͷ��ʵ��ⲿ��Ա����Ϊfinal
			}
		}
		Inner2 in = new Inner2();
		in.show2();
	}
	void method() {
		new Inner().show();
		new Outer().function();
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Outer().method();
	}

}
