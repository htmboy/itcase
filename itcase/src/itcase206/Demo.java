package itcase206;

/**
 * 
 *   ����: ��Ʊ
 *  
 * 
 * **/

class Ticket implements Runnable{
	private int num = 100; // ����, Ҫ�����������ﲻ�ܾ�̬��,  ����������Ҫ��100��Ʊ, ����Ͳ�����
	Object obj = new Object();
	public void run() {
		while(true) {
			// һ���߳̽���, һ���߳�������, �����-1�����
			// ���˼·
			// ������װ����, ������߳�������, ��һ���̲߳��ܽ�ȥ
			// ��ͬ��������װ�Ϳ��Խ���������
			// synchronized(����){
			// ��Ҫ��ͬ���Ĵ���
			// }
			synchronized (obj) // ���Կ�����һ����, �ϲ���Ҫ����, ���˽�����, 
			// ��������ſ���, �Լ���ȥ, ���˽���
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
		Ticket t =new Ticket(); // ����ͨƱ
		Ticket tt = new Ticket();// ������Ʊ
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
		 // ����� -1 �����
	}

}
