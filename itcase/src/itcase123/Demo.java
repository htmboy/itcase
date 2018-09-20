package itcase123;

public class Demo {

	public static void main(String[] args) { // 其实虚拟机传入一个new String[0] 
		/**
		 * 主函数特殊之处
		 * 1, 格式是固定
		 * 2, 被jvm所识别和调用
		 * 
		 * public 因为权限必须是最大的
		 * static 不需要对象的
		 * void 主函数没有具体的返回值
		 * main 函数名, 不是关键字, 只是一个jvm识别的固定的名字
		 * String[] args 这是主函数的参数列表, 是一个数组类型的参数, 而且元素都是字符串类型
		 * **/ 
		
		System.out.println(args); // [Ljava.lang.String;@3b192d32 创建数组对象
		System.out.println(args.length);
	}

}
