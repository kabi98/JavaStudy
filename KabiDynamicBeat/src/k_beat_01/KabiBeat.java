package k_beat_01;

import javax.swing.JFrame;

public class KabiBeat extends JFrame{
	
	public KabiBeat() {
		setTitle("Kabi Beat");
		setSize(KabiBeatMain.SCREEN_WIDTH, KabiBeatMain.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
