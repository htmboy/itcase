package itcase218;
/**
 * 
 * 线程间通讯
 * 多个线程在处理同一资源, 但是任务却不同
 * 
 * 
 * 
 * **/

class Resource{
	String name;
	String sex;
}

class Input implements Runnable{
	Resource r;
	Object obj = new Object();
	Input(Resource r){
		this.r = r;
	}
	public void run() {
		int x = 0;
		while(true) {
			synchronized(r) { // 保证输入线程的同时还要保证输出线程
				if(x == 0) {
					r.name = "mike";
					r.sex = "boy";
				}else {
					r.name = "lili";
					r.sex = "girl";
				}
			}
			
			x = (x + 1) % 2;
			
		}
	}
}

class Output implements Runnable{
	Resource r;
	Object obj = new Object();
	Output(Resource r){
		this.r = r;
	}
	public void run() {
		 // 两把不同的锁, 所以没有效果
		while(true) {
			synchronized(r) {
				System.out.println(r.name + "...." + r.sex);
			}
		}
		
		
	}
}
public class Demo {

	public static void main(String[] args) {
		// 创建资源
		Resource r = new Resource();
		// 创建任务
		Input in = new Input(r);
		Output out = new Output(r);
		// 创建线程, 执行路径
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);
		// 开启线程
		t1.start();
		t2.start();
	}

}
