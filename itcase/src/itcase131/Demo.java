package itcase131;
/**
 * 
 * ���ģʽ
 * ��������֮��Ч�Ľ����ʽ, ��ʵ����һ��˼��
 * 
 * 1, �������ģʽ
 * 		���������: ���ǿ��Ա�֤һ�������ڴ��е�Ψһ��
 * 
 * ������ڶ������ʹ��ͬһ��������Ϣ����ʱ, ����Ҫ��֤�ö����Ψһ��
 * 
 * ��α�֤����Ψһ����
 * 1, ����������������new ��������Ķ���
 * 2, �ڸ��ഴ��һ������ʵ��
 * 3, �����ṩһ������������������Ի�ȡ�ö���
 * 
 * ����
 * 1, ˽�л����๹�캯��
 * 2, ͨ��new�ڱ����д���һ����������
 * 3, ����һ�����еķ���, �������Ķ���Ż�
 * **/ 
// ����ʽ
class Single{
	private static Single s = new Single(); // ��һ����, ����ʹ���
	private Single() {}
	public static Single getInstance() {
		return s;
	}
}
// ����ʽ
class Single2{ // ����ؽ���, û�ж���, ֻ�е���getInstance����ʱ, �Żᴴ������
	// �ӳټ�����ʽ
	private static Single2 s = null;
	private Single2() {}
	public static Single2 getInstance() {
		if(s == null)
			s = new Single2();
		return s;
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
