package itcase190;
/**
 * 
 * 包 package
 * 对类文件进行分类管理
 * 
 * 包里面的类需要用public修饰, 否则不能被访问
 * 
 * **/

//import itcase189.PackageDemo; // 导入包中的类
import itcase189.*; // 导入包中的所有类
// import itcase189.abc.* // 导入包中的子包中的类

class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 引用包里的类
//		itcase189.PackageDemo z = new itcase189.PackageDemo(); // 没有导入包就需要这种写法
		PackageDemo z = new PackageDemo(); // 导入包中之后的写法
		z.show();
	}

}
