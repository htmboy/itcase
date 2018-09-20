package itcase206;

/**
 * 
 *   需求: 卖票
 *  
 * 
 * **/

class Ticket implements Runnable{
	private int num = 100; // 可以, 要看需求但是这里不能静态化,  如果另外的人要卖100张票, 这里就不可以
	Object obj = new Object();
	public void run() {
		while(true) {
			// 一条线程进来, 一条线程在运算, 会出现-1的情况
			// 解决思路
			// 把他封装起来, 必须等线程运算完, 下一个线程才能进去
			// 用同步代码块封装就可以解决这个问题
			// synchronized(对象){
			// 需要被同步的代码
			// }
			synchronized (obj) // 可以看成是一个锁, 上厕所要锁门, 别人进不来, 
			// 上完厕所才开锁, 自己出去, 别人进来
			{
				if(num > 0) {
					System.out.println(Thread.currentThread().getName() + "...sale..." + num--);
				}
			}
			
		}
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket t =new Ticket(); // 卖普通票
		Ticket tt = new Ticket();// 卖高铁票
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(tt);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(tt);
//		 Ticket t1 = new Ticket();
//		 Ticket t2 = new Ticket();
//		 Ticket t3 = new Ticket();
//		 Ticket t4 = new Ticket();
		 t1.start();
		 t2.start();
		 t3.start();
		 t4.start();
		 // 会出现 -1 的情况
	}

}
