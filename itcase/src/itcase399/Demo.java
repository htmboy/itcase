package itcase399;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;

public class Demo {
	private Frame f;
	private TextField tf;
	private Button but;
	/**
	 * @wbp.nonvisual location=117,127
	 */
	private final JTextPane textPane = new JTextPane();
	
	public Demo() {
		init();
	}
	private void init() {
		textPane.setEditable(false);
		f = new Frame("演示鼠标和键盘监听");
		f.setType(Type.UTILITY);
		f.setEnabled(false);
		f.setAutoRequestFocus(false);
		f.setModalExclusionType(ModalExclusionType.TOOLKIT_EXCLUDE);
		f.setBounds(400, 200, 500, 400);
		FlowLayout fl_f = new FlowLayout();
		fl_f.setAlignment(FlowLayout.LEFT);
		f.setLayout(null);
		tf = new TextField(35); // 构造参数 宽度
		but = new Button("一个按钮");
		
		f.add(tf);
		f.add(but);
		f.add(textPane);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Demo();
	}

}
