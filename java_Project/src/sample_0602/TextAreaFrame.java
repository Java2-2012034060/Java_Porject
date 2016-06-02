package sample_0602;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaFrame extends JFrame implements ActionListener{
	protected JTextField textField;
	protected JTextArea textArea;
	
	public TextAreaFrame() {
		setTitle("Text Area Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField = new JTextField(30);
		textField.addActionListener(this);
		
		textArea= new JTextArea(10, 30);
		JScrollPane scrollPane = new JScrollPane(textArea);//스크롤페인 안에 텍스트 에리어를 넣었으니 한번만 출력
		add(scrollPane, BorderLayout.CENTER);
		textArea.setEditable(false);
		
		add(textField, BorderLayout.NORTH);
		//add(textArea, BorderLayout.CENTER);
		
		pack();
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ect) {
		String text = textField.getText();
		textArea.append(text+"\n");
		textField.selectAll();
		textArea.setCaretPosition(textArea.getDocument().getLength());
	}
	
	public static void main(String[] args) {
		new TextAreaFrame();
	}

}
