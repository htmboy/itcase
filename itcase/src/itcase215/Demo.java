package itcase215;
/**
 * 
 * 单例模式的多线程
 * 
 * **/
class Single{
	private static final Single s = new Single();
	public static Single getInstance() { // 返回值为Single类
		return s;
	}
}

class Single2{
	private static Single s = null;
	private Single2() {}
//	public static synchronized Single getInstance() { // 每次调用, 都加了一次锁, 效率降低
//		if(s == null)
//			s = new Single();
//		return s;
//	}
	public static Single getInstance() {
		if(s == null) { // 解决效率问题
			Synchronized(Single.class){ // 解决安全问题
				if(s == null)
					s = new Single();
			}
		}
		return s;
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("h");
	}

}
