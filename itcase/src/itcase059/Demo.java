package itcase059;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���������о����ض����ܵ�һ��С����, Ҳ��Ϊ����
		int a = 3;
		int b = 4;
		int c;
		// c = a + b;
		// c = 5 + 7;
		// c = 5 + 8;
		c = add(a, b);
		System.out.println("c=" + c);
	}
	
	static int add(int a, int b){ // ��̬���� ֻ��ֱ�ӵ��þ�̬����
		return a + b;
	}
	
	// �������: ����û�о��巵��ֵʱ, ����ֵ������ void ����ʾ
	// return ������ʡ�Բ�д

}
