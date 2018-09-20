package itcase218;
/**
 * 
 * �̼߳�ͨѶ
 * ����߳��ڴ���ͬһ��Դ, ��������ȴ��ͬ
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
			synchronized(r) { // ��֤�����̵߳�ͬʱ��Ҫ��֤����߳�
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
		 // ���Ѳ�ͬ����, ����û��Ч��
		while(true) {
			synchronized(r) {
				System.out.println(r.name + "...." + r.sex);
			}
		}
		
		
	}
}
public class Demo {

	public static void main(String[] args) {
		// ������Դ
		Resource r = new Resource();
		// ��������
		Input in = new Input(r);
		Output out = new Output(r);
		// �����߳�, ִ��·��
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);
		// �����߳�
		t1.start();
		t2.start();
	}

}
