package itcase396;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Demo {
	private Frame f;
	private TextField tf;
	private Button but;
	public Demo() {
		init();
	}
	private void init() {
		f = new Frame("演示鼠标和键盘监听");
		f.setBounds(400, 200, 500, 400);
		f.setLayout(new FlowLayout());
		tf = new TextField(35); // 构造参数 宽度
		but = new Button("一个按钮");
		
		f.add(tf);
		f.add(but);
		myEvent();
		
		f.setVisible(true);
	}
	private void myEvent() {
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		// 在按钮上添加活动监听事件
		but.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("act run");
			}
			
		});
		
		// 在按钮上添加一个鼠标监听事件, 鼠标单击事件
		but.addMouseListener(new MouseAdapter() {
			private int count = 0;
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount()==2) //双击事件
					tf.setText("mouse double click" + count++);
				System.out.println(e);
			}
		});
		
		
	}
	public static void main(String[] args) {
		new Demo();

	}

}
