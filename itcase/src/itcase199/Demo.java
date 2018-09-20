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
			// System.out.println(name + ".......x=" + x + getName()); // getName() 获取线程的名字
			System.out.println(name + ".......x=" + x + Thread.currentThread().getName()); 
			// Thread.currentThread().getName(); 获取主线程的名字
		}
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 创建线程的目的时为了开启一条执行路径, 去运行制定的代码和其他代码实现同时运行
		 * 而的运行的制定代码就是这个执行路径的任务
		 * JVM创建的主线程的任务都定义在了主函数中;
		 * 而自定义的线程它的任务在哪呢
		 * Thread类用于描述线程, 线程是需要任务的, 所以Thread类也对任务的描述
		 * 这个任务就通过Thread类中的run方法来体现, 也就是说, run方法就是封装自定义线程运行任务的函数
		 * run方法中定义就是线程要运行的任务代码
		 * 
		 * 开启线程是为了运行制定代码, 所以只有继承Thread类, 并复写run方法
		 * 将运行的
		 * **/
		Thread t1 = new Thread();
		
		ThreadDemo d1 = new ThreadDemo("旺财");
		ThreadDemo d2 = new ThreadDemo("小强");
		d1.run();
		d2.run();
		// d1.run(); // 这个就是个常规的成员方法, 并不会创建线程
		d1.start(); // 创建线程并开启线程, 自动run方法
		System.out.println("haha");
		
		d2.start();
	}

}
