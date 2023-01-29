package k_beat_02;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class KabiBeat extends JFrame {

	private Image screenImage;
	private Graphics screenGraphic;
	private Image introBackground;

	public KabiBeat() {
		setTitle("Kabi Beat");
		setSize(KabiBeatMain.SCREEN_WIDTH, KabiBeatMain.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

//		introBackground = new ImageIcon("D:/Git/JavaStudy/KabiDynamicBeat/src/images/introbackground_1280_720.jpg").getImage();
//		introBackground = new ImageIcon("D:\\Git\\JavaStudy\\KabiDynamicBeat\\src\\images\\introbackground_1280_720.jpg").getImage();

		Path relativePath = Paths.get("");
		String path = relativePath.toAbsolutePath().toString();
		System.out.println("Working Directory = " + path);
		introBackground = new ImageIcon(path + "/src/images/introbackground_1280_720.jpg").getImage();
		
		Music introMusic = new Music("introMusic.mp3", true);
		introMusic.start();
	}

	public void paint(Graphics g) {
		screenImage = createImage(KabiBeatMain.SCREEN_WIDTH, KabiBeatMain.SCREEN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage, 0, 0, null);
	}

	public void screenDraw(Graphics g) {
		g.drawImage(introBackground, 0, 0, null);
		this.repaint();

	}

}
