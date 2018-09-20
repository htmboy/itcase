package itcase063;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = add(3, 5);
		System.out.println(x); // 在这里处理结果, 不要在函数体内处理结果
	}
	
	public static int add(int a, int b) {
		// 注意: 谁调用, 放回结果给谁, 不要在这里处理结果
		// 不合理, 不规范
		// System.out.println(a + b);
		return a + b;
	}

}
