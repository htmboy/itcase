package itcase137;
/**
 * 
 * ������ĳ�Ա�;ֲ�����ͬ����this����
 * ���Ӹ����еĳ�Ա����ͬ����super���ָ���
 * 
 * this��super���÷�������
 * 
 * this����һ����������
 * super����һ������ռ�
 * 
 * ���Ӹ����г��ֳ�Ա����һģһ�������, ����������ĺ���,
 * ��������, ��Ϊ���ǲ���, ���Ǻ������Ӹ����е�����
 * ������������, 
 * 1, ����, ͬһ������, overload
 * 2, ����, ������, ����Ҳ��Ϊ��д, ��д, override
 * 
 * ����ע������:
 * 1, ���෽�����Ǹ��෽��ʱ, ����Ȩ�ޱ�����ڵ��ڸ���Ȩ��, 
 * 2, ��ֻ̬�ܸ��Ǿ�̬, �򱻾�̬����, ����������ټ�
 * **/
class Fu {
	int num = 4;
	void show() {
		System.out.println("Fu run");
	}
}
class Zi extends Fu {
	int num = 5;
	void show() {
		// ���Ǹ���Ĳ���
		// ��������������
		// 1, ���� ��ͬһ������
		// 2, ����, ������, ����Ҳ��Ϊ��д, ��д, override
		System.out.println(this.num + "......" + super.num);
	}
}

public class Demo {

	public static void main(String[] args) {
		// 
		Zi a = new Zi();
		a.show();

	}

}
