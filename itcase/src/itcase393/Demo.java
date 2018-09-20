package itcase393;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Demo {

	public static void main(String[] args) {
		Frame f = new Frame("my name"); // 实例化的参数, 是为窗体输出窗体名称
//		f.setSize(500, 400);
//		f.setLocation(200, 100);
		f.setBounds(200, 100, 500, 400);
		f.setLayout(new FlowLayout()); // 用匿名对象的形式, 设置容器布局, 流式布局
		Button but = new Button("button"); // 创建按钮
		
		f.add(but); // 将按钮添加到窗体中
		
		f.setVisible(true); // 固定写法, 设置窗体可视化
		System.out.println("over");
	}

}
