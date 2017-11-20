import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dragging extends JFrame {
	JPanel contentPane = new JPanel();
	Dragging() {
		setTitle("Chapter 10. Exercise 2");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// add panel listener dragged
		setContentPane(contentPane);
		contentPane.setBackground(Color.GREEN);
		
		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
		
			public void mouseDragged(MouseEvent e) {
				contentPane.setBackground(Color.YELLOW);  //�巡�� �ϴ� ����
			}
			public void mouseMoved(MouseEvent e) {
				contentPane.setBackground(Color.GREEN);  //�巡�� ���� ��
			}
		}
		);

  //
		setVisible(true);
	}
	public static void main(String[] args) {
		new Dragging();
	}
}
