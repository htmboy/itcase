package itcase195;
/**
 * 
 * �߳�: ���ǽ�����һ���������ִ�еĿ��Ƶ�Ԫ(ִ��·��)
 * һ�������п��Զ�ִ��·��, ��֮Ϊ���߳�
 * һ������������Ҫ��һ���߳�
 * ��������߳���Ϊ��ͬʱ���жಿ�ִ���
 * ÿһ���̶߳����Լ����е�����, ������ݿ��Գ�Ϊ�߳�Ҫִ�е�����
 * ���̵߳ĺô�: ������˶ಿ��ͬʱ���е�����
 * ���̵߳ı׶�: �߳�̫���ʹЧ�ʽ���
 * ��ʵӦ�ó����ִ�ж���cpu���������л���ɵ�, ����л�ʱ�����
 * 
 * JVM����ʱ�������˶���߳�, �����������߳̿��Է����ĳ���
 * 
 * 1, ִ��main�������߳�
 * 	���̵߳�������붼������main������
 * 
 * 2, �����������յ��߳�
 * 
 * **/

class ThreadDemo{
	public void finalize() { // ����������������ʱ���Զ����ô˷���
		System.out.println("demo ok");
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������������߳� main�̺߳ͻ����߳�
		new ThreadDemo();
		new ThreadDemo();
		System.gc(); // gc system��ľ�̬����, ��������������
		new ThreadDemo();
		System.out.println("hello");
		
		
	}

}
