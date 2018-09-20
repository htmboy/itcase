package itcase399;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FlowLayout extends JFrame {

	protected static final String LINE_SEPARATOR = System.getProperty("line.separator");
	private JPanel contentPane;
	private JTextField textField;
	private final JTextArea textArea = new JTextArea();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FlowLayout frame = new FlowLayout();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	private void showDir() {
		String dir_str = textField.getText();
		File dir = new File(dir_str);
		
		if(dir.exists() && dir.isDirectory()) {
			textArea.setText("");
			String[] names = dir.list();
			for(String name : names) {
				textArea.append(name + LINE_SEPARATOR);
			}
		}
	}
	public FlowLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("×ªµ½");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showDir();
			}

			
		});
		
		button.setBounds(331, 19, 93, 23);
		contentPane.add(button);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER)
					showDir();
			}
		});
		textField.setBounds(10, 20, 311, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		textArea.setBounds(10, 57, 414, 174);
		contentPane.add(textArea);
	}
}
