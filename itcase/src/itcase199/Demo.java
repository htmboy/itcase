package itcase199;


class ThreadDemo extends Thread{
	private String name;
	ThreadDemo(String name){
		this.name = name;
	}
	public void run() {
		this.show();
	}
	public void show() {
		for(int x = 0; x < 10; x++) {
			for(int y = -999999999; y < 999999999; y ++) {}
			for(int z = -999999999; z < 999999999; z ++) {}
			// System.out.println(name + ".......x=" + x + getName()); // getName() ��ȡ�̵߳�����
			System.out.println(name + ".......x=" + x + Thread.currentThread().getName()); 
			// Thread.currentThread().getName(); ��ȡ���̵߳�����
		}
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * �����̵߳�Ŀ��ʱΪ�˿���һ��ִ��·��, ȥ�����ƶ��Ĵ������������ʵ��ͬʱ����
		 * �������е��ƶ�����������ִ��·��������
		 * JVM���������̵߳����񶼶���������������;
		 * ���Զ�����߳���������������
		 * Thread�����������߳�, �߳�����Ҫ�����, ����Thread��Ҳ�����������
		 * ��������ͨ��Thread���е�run����������, Ҳ����˵, run�������Ƿ�װ�Զ����߳���������ĺ���
		 * run�����ж�������߳�Ҫ���е��������
		 * 
		 * �����߳���Ϊ�������ƶ�����, ����ֻ�м̳�Thread��, ����дrun����
		 * �����е�
		 * **/
		Thread t1 = new Thread();
		
		ThreadDemo d1 = new ThreadDemo("����");
		ThreadDemo d2 = new ThreadDemo("Сǿ");
		d1.run();
		d2.run();
		// d1.run(); // ������Ǹ�����ĳ�Ա����, �����ᴴ���߳�
		d1.start(); // �����̲߳������߳�, �Զ�run����
		System.out.println("haha");
		
		d2.start();
	}

}
