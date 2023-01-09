package pakTest01;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class SwingExample extends JFrame {
	public SwingExample() {
	      setSize(800, 500);
	      setLocation(100, 100);
	      setDefaultCloseOperation(EXIT_ON_CLOSE);
	      
	      //FlowLayout 객체 전달하기
	      setLayout(new FlowLayout(FlowLayout.LEFT));
	      //버튼을 만들어서 
	      JButton btn1=new JButton("버튼1");
	      JButton btn2=new JButton("버튼2");
	      JButton btn3=new JButton("버튼3");
	      
	      //프레임에 추가하기 
	      add(btn1);
	      add(btn2);
	      add(btn3);
	      
	      setVisible(true);
	}

	public static void main(String[] args) {
		System.out.println("Hello World !!!");
		new SwingExample();
	}


}
