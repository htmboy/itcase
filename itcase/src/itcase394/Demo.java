package itcase394;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * 事件监听
 * windowAdapter
 * 监听活动监听
 * addActionListener
*/

public class Demo {
	public static void main(String[] agrs) {
		Frame f = new Frame("my name");
		f.setBounds(400, 200, 500, 400);
		f.setLayout(new FlowLayout());
		Button but = new Button("一个按钮");
		f.add(but);
		
		f.addWindowListener(new WindowAdapter() {
			// 重写该方法
			public void windowClosing(WindowEvent e) {
				System.out.println("closing......" + e);
				System.exit(0);
			}
		});
		// 在按钮上添加一个监听
		but.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("button run");
				System.exit(0);
			}
		});
		f.setVisible(true);
	}
}
