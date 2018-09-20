package itcase203;
/**
 * �����̵߳ĵ�һ�ַ���: �̳�Thread��
 * ��дrun����, ��start()����
 * ���Ҫ�̳и�������, ��һ�ַ����Ͳ�����
 * 
 * �ڶ��ַ�����: ʵ��Runnable�ӿ�
 * **/
class ThreadDemo implements Runnable{
	public void run() {
		this.show();
	}
	public void show() {
		for(int x = 0; x < 20; x++) {
			System.out.println(Thread.currentThread().getName() + "......" + x);
		}
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ThreadDemo d1 = new ThreadDemo();
		// ThreadDemo d2 = new ThreadDemo();
//		d1.start();
//		d2.start();
		ThreadDemo d = new ThreadDemo();
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);
		t1.start();
		t2.start();
	}

}
// Thread() ԭ��
/*
class Thread{
	private Runnable r;
	Thread(){}
	Thread(Runnable r){
		this.r = r;
	}
	public void run() {
		r.run();
	}
	public void start() {
		this.run();
	}
}
*/