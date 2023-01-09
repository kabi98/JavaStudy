package pakTest01;

import javax.swing.JFrame;

public class ProgramGui extends JFrame {
	public ProgramGui() {
		setTitle("스윙 테스트");
		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
