package itcase393;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Demo {

	public static void main(String[] args) {
		Frame f = new Frame("my name"); // ʵ�����Ĳ���, ��Ϊ���������������
//		f.setSize(500, 400);
//		f.setLocation(200, 100);
		f.setBounds(200, 100, 500, 400);
		f.setLayout(new FlowLayout()); // �������������ʽ, ������������, ��ʽ����
		Button but = new Button("button"); // ������ť
		
		f.add(but); // ����ť��ӵ�������
		
		f.setVisible(true); // �̶�д��, ���ô�����ӻ�
		System.out.println("over");
	}

}
