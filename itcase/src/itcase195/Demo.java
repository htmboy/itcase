package itcase195;
/**
 * 
 * 线程: 就是进程中一个负责程序执行的控制单元(执行路径)
 * 一个进程中可以多执行路径, 称之为多线程
 * 一个进程中至少要有一个线程
 * 开启多个线程是为了同时运行多部分代码
 * 每一个线程都有自己运行的内容, 这个内容可以称为线程要执行的任务
 * 多线程的好处: 解决掉了多部分同时运行的问题
 * 多线程的弊端: 线程太多会使效率降低
 * 其实应用程序的执行都是cpu在做快速切换完成的, 这个切换时随机的
 * 
 * JVM启动时就启动了多个线程, 至少有两个线程可以分析的出来
 * 
 * 1, 执行main函数的线程
 * 	该线程的任务代码都定义在main函数中
 * 
 * 2, 负责垃圾回收的线程
 * 
 * **/

class ThreadDemo{
	public void finalize() { // 当垃圾回收器启动时会自动调用此方法
		System.out.println("demo ok");
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 下面会有两条线程 main线程和回收线程
		new ThreadDemo();
		new ThreadDemo();
		System.gc(); // gc system类的静态方法, 调用垃圾回收器
		new ThreadDemo();
		System.out.println("hello");
		
		
	}

}
