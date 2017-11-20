import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
import java.util.*;  
public class ClickPractice  {  
	public static void main(String[] args)  {  
		int x = 100, y = 100;  //초기위치
		JFrame f = new JFrame();  
		f.setTitle("클릭 연습 용 응용프르고램");  
		f.setSize(400, 400);  
		f.setLayout(null);  
		JLabel label = new JLabel("C");    //출력문자
		label.setSize(30, 30);  
		label.setLocation(x, y);  
		MyMouseListener listener = new MyMouseListener(label);  
		label.addMouseListener(listener);  
		f.add(label);  
		f.setVisible(true);  
	}  
}  
class MyMouseListener implements MouseListener  {  
	JLabel label;  
	public MyMouseListener(JLabel label)  
	{  
		this.label = label;  
	}  
	public void mouseClicked(MouseEvent e)  
	{  
		int x, y;  
		Random ran = new Random();  
		x = ran.nextInt(380);  
		y = ran.nextInt(360);  
		label.setLocation(x, y);  
	}  
	@Override  
	public void mouseEntered(MouseEvent e)  
	{  
		// TODO Auto-generated method stub  
	}  
	@Override  
	public void mouseExited(MouseEvent e)  
	{  
		// TODO Auto-generated method stub  
	}  
	@Override  
	public void mousePressed(MouseEvent e)  
	{  
		// TODO Auto-generated method stub  
	}  
	@Override  
	public void mouseReleased(MouseEvent e)  
	{  
		// TODO Auto-generated method stub  
	}  
}
