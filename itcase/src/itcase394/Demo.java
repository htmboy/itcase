package itcase394;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * �¼�����
 * windowAdapter
 * ���������
 * addActionListener
*/

public class Demo {
	public static void main(String[] agrs) {
		Frame f = new Frame("my name");
		f.setBounds(400, 200, 500, 400);
		f.setLayout(new FlowLayout());
		Button but = new Button("һ����ť");
		f.add(but);
		
		f.addWindowListener(new WindowAdapter() {
			// ��д�÷���
			public void windowClosing(WindowEvent e) {
				System.out.println("closing......" + e);
				System.exit(0);
			}
		});
		// �ڰ�ť�����һ������
		but.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("button run");
				System.exit(0);
			}
		});
		f.setVisible(true);
	}
}
