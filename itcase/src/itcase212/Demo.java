package itcase212;

/**
 *  ����: ����, ����, ÿ���������д�Ǯÿ�δ�100, ��������
 * 
 * 
 * 
 * **/

class Bank{
	private int sum;
	// private Object obj = new Object();
	public synchronized void add(int num) { // ͬ������, ��ͬ�����������
		sum = sum + num;
		
		System.out.println("sum=" + sum);
	}
}

class Cus implements Runnable{
	private Bank b = new Bank();
	public void run() {
		for(int x = 0; x < 3; x++) {
			b.add(100);
		}
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cus c = new Cus();
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();
	}

}
