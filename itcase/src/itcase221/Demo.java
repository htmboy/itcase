package itcase221;

/**
 *  生产者, 消费者
 * 
 * 
 * **/

class Resource{
	private String name;
	private int count = 1;
	private boolean flag = false;
	public synchronized void set(String name) {
		if(flag)
			try{this.wait();}catch(InterruptedException e) {}
		this.name = name + count;
		count++;
		System.out.println(Thread.currentThread().getName() + "...生产者..." + this.name);
		flag = false;
		notify();
	}
	
	public synchronized void out() {
		if(!flag)
			try {this.wait();} catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + "...消费者........." + this.name);
		flag = true;
		notify();
	}
}

class Producer implements Runnable{
	private Resource r;
	Producer(Resource r){
		this.r = r;
	}
	public void run() {
		while(true) {
			r.set("烤鸭");
		}
	}
}

class Consumer implements Runnable{
	private Resource r;
	Consumer(Resource r){
		this.r = r;
	}
	public void run() {
		while(true) {
			r.out();
		}
	}
}

public class Demo {

	public static void main(String[] args) {
		Resource r = new Resource();
		Producer pro = new Producer(r);
		Consumer con = new Consumer(r);
		
		Thread t1 = new Thread(pro);
		Thread t2 = new Thread(con);
		t1.start();
		t2.start();
	}

}
