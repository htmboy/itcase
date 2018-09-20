package itcase397;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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
		f = new Frame("��ʾ���ͼ��̼���");
		f.setBounds(400, 200, 500, 400);
		f.setLayout(new FlowLayout());
		tf = new TextField(35); // ������� ���
		but = new Button("һ����ť");
		
		f.add(tf);
		f.add(but);
		myEvent();
		
		f.setVisible(true);
	}
	private void myEvent() {
		tf.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				System.out.println(e);
				System.out.println("key run" + "..." + e.getKeyChar() + "..." + e.getKeyCode());
				int code = e.getKeyCode();
				if(!(code >= KeyEvent.VK_0 && code <= KeyEvent.VK_9))
					System.out.println("����������");
			}
		});
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		// �ڰ�ť����ӻ�����¼�
		but.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("act run");
			}
			
		});
		
		// �ڰ�ť�����һ���������¼�, ��굥���¼�
		but.addMouseListener(new MouseAdapter() {
			private int count = 0;
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount()==2) //˫���¼�
					tf.setText("mouse double click" + count++);
				System.out.println(e);
			}
		});
		
		
	}
	public static void main(String[] args) {
		new Demo();

	}

}
