package itcase141;
/**
 * 
 * 	�Ӹ����еĹ��캯�����ص�
 * 	
 * 	�����๹�����ʱ, ����, �������๹�캯��ʱ, ����Ҳ������. Ϊʲô��?
 * 	ԭ��ʱ: ������Ĺ��캯���е�һ����һ��Ĭ�ϵ���ʽ���, super();
 * 
 * 	�����ʵ��������: ���������еĹ��캯��Ĭ�϶�����ʸ����еĿղι��캯��
 * 
 * 	Ϊʲô����ʵ������ʱ�����ø���Ĺ��캯��
 * 	�����������, ���̳к�, ��ȡ���˸����е�����, ��������и�������. ��������ø���Ĺ��캯��, 
 * 	��������ԾͲ��ܳ�ʼ��
 * 	���������ڹ������ʱ, ������ʸ���Ĺ��캯��, ��������Ĺ��캯���м�����super()���.
 * 
 * 	ע��: super������Ҫ���������๹�캯���ĵ�һ��, ��Ϊ����ĳ�ʼ�����������
 * **/

class Fu{
	Fu() {
		System.out.println("A fu run");
	}
	Fu(int x){
		
		System.out.println("B fu run..." + x);
	}
}

class Zi extends Fu{
	Zi(){
		// super(); // ������super(), ���õľ��Ǹ���Ŀղ����Ĺ��캯��
		System.out.println("C zi run");
	}
	Zi(int x){ 
		this(); // ����������Zi();
		// super(x); // ������ƶ�, ���ִ�и���ղι��캯��
		System.out.println("D zi run" + x);
	}
}

public class Demo {

	public static void main(String[] args) {
		// 
		new Zi(6);

	}

}