package itcase162;
/**
 * 
 * ��̬ʱ
 * ��Ա���ص�
 * ����Ƚ��ر�
 * 1, ��Ա���ص�:
 * 1, ��Ա����
 * 
 * **/

class Fu{
	int num = 3;
	
	static void method() {
		System.out.println("fu static method");
	}
}

class Zi extends Fu{
//	int num = 4;
	
//	static void method() {
//		System.out.println("zi static method");
//	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fu f = new Zi();
		System.out.println(f.num); // �����fu��num, �����Ḳ��, �������Ḳ�� , ����û�оͱ���
		Zi z = new Zi();
		System.out.println(z.num); // ����zi��num, ���û��, ����������
		Fu fs = new Zi();
		fs.method(); // ��̬�����Ƚ�����
		Zi zs = new Zi();
		zs.method(); // �ȱ�����, ����û�о���������
		
	}

}
