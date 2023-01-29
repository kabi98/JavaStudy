package k_beat_04;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class KabiBeat extends JFrame {

	private Image screenImage;
	private Graphics screenGraphic;
	private Image introBackground;
	private JLabel menuBar;
	private JButton exitButton;
	private ImageIcon exitButtonBasicImage, exitButtonEnteredImage;

	private int mouseX, mouseY;

	public KabiBeat() {
		setUndecorated(true);

		setTitle("Kabi Beat");
		setSize(KabiBeatMain.SCREEN_WIDTH, KabiBeatMain.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBackground(new Color(0, 0, 0, 0));
		setLayout(null);

//		introBackground = new ImageIcon("D:/Git/JavaStudy/KabiDynamicBeat/src/images/introbackground_1280_720.jpg").getImage();
//		introBackground = new ImageIcon("D:\\Git\\JavaStudy\\KabiDynamicBeat\\src\\images\\introbackground_1280_720.jpg").getImage();

		Path relativePath = Paths.get("");
		String path = relativePath.toAbsolutePath().toString();
		System.out.println("KabiBeat Directory = " + path);
		introBackground = new ImageIcon(path + "/src/images/introbackground_1280_720.jpg").getImage();

		exitButtonBasicImage = new ImageIcon(path + "/src/menu_images/exit.png");
		exitButtonEnteredImage = new ImageIcon(path + "/src/menu_images/exit_entered.png");
		
		exitButton = new JButton(exitButtonBasicImage);
		exitButton.setBounds(1245, 0, 30, 30);
		exitButton.setBorderPainted(false);
		exitButton.setContentAreaFilled(false);
		exitButton.setFocusPainted(false);

		exitButton.addMouseListener( new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				exitButton.setIcon(exitButtonEnteredImage);
				exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				exitButton.setIcon(exitButtonBasicImage);
				exitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				Music exitMusic = new Music("Sound_Exit.mp3", false);
				exitMusic.start();
				try {
					Thread.sleep(1000);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
				System.exit(0);
			}
			
		});
		
		
		add(exitButton);

		
		
		menuBar = new JLabel(new ImageIcon(path + "/src/menu_images/menuBar.png"));
		menuBar.setBounds(0, 0, 1280, 30);

		menuBar.addMouseListener( new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
			}
		});
		
		menuBar.addMouseMotionListener( new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				setLocation(x-mouseX, y-mouseY);
			}
		});
		

		add(menuBar);

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
		paintComponents(g);
		this.repaint();

	}

}
