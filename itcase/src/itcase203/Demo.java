package itcase203;
/**
 * 创建线程的第一种方法: 继承Thread类
 * 复写run方法, 用start()启动
 * 如果要继承父类的情况, 第一种方法就不行了
 * 
 * 第二种方法是: 实现Runnable接口
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
// Thread() 原理
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