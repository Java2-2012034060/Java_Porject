package sample_0602;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class KeyEventTest extends JFrame implements KeyListener {

	private JPanel panel;
	private JTextField field;
	private JTextArea area;

	public KeyEventTest() {
		panel = new JPanel(new GridLayout(0, 2));
		panel.add(new JLabel("문자를 입력하시오:"));
		field = new JTextField(10);
		panel.add(field);
		area = new JTextArea(3, 30);
		add(panel, BorderLayout.NORTH);
		add(area, BorderLayout.CENTER);

		field.addKeyListener(this);
		setTitle("keyEvent Test");
		setSize(400, 200);
		setVisible(true);

	}

	public static void main(String[] args) {
		new KeyEventTest();
	}

	public void keyTyped(KeyEvent e) {
		display(e, "key Typed            ");
	}

	public void keyPressed(KeyEvent e) {
		display(e, "key pressed            ");
	}

	public void keyReleased(KeyEvent e) {
		display(e, "key Released            ");
	}

	protected void display(KeyEvent e, String s) {
		char c = e.getKeyChar();
		int keycode = e.getKeyCode();
		String modifiers = "Alt: " + e.isAltDown() + "ctrl: "
				+ e.isControlDown() + "Shift: " + e.isShiftDown();
		area.append(" " + s + "문자" + c + "(코드:" + keycode + ")"
				+ modifiers + "\n");
	}

}
