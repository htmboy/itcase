package itcase215;
/**
 * 
 * ����ģʽ�Ķ��߳�
 * 
 * **/
class Single{
	private static final Single s = new Single();
	public static Single getInstance() { // ����ֵΪSingle��
		return s;
	}
}

class Single2{
	private static Single s = null;
	private Single2() {}
//	public static synchronized Single getInstance() { // ÿ�ε���, ������һ����, Ч�ʽ���
//		if(s == null)
//			s = new Single();
//		return s;
//	}
	public static Single getInstance() {
		if(s == null) { // ���Ч������
			Synchronized(Single.class){ // �����ȫ����
				if(s == null)
					s = new Single();
			}
		}
		return s;
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("h");
	}

}
