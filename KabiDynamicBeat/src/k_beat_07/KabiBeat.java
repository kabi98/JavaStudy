package k_beat_07;

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

	private Graphics screenGraphic;
	private Image screenImage;
	private Image background, selectedImage;
	private JLabel menuBar;
	private JButton exitButton, startButton, quitButton, leftButton, rightButton;
	
	private ImageIcon exitButtonBasicImage, exitButtonEnteredImage;
	private ImageIcon startButtonBasicImage, startButtonEnteredImage;
	private ImageIcon quitButtonBasicImage, quitButtonEnteredImage;
	private ImageIcon leftButtonBasicImage, leftButtonEnteredImage;
	private ImageIcon rightButtonBasicImage, rightButtonEnteredImage;


	private int mouseX, mouseY;

	private boolean isMainScreen = false;

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

//		background = new ImageIcon("D:/Git/JavaStudy/KabiDynamicBeat/src/images/introbackground_1280_720.jpg").getImage();
//		background = new ImageIcon("D:\\Git\\JavaStudy\\KabiDynamicBeat\\src\\images\\introbackground_1280_720.jpg").getImage();

		Path relativePath = Paths.get("");
		String path = relativePath.toAbsolutePath().toString();
		System.out.println("KabiBeat Directory = " + path);
		background = new ImageIcon(path + "/src/images/introbackground_1280_720.jpg").getImage();
		selectedImage = new ImageIcon(path + "/src/images/leaving_earth_600x450.png").getImage();

		exitButtonBasicImage = new ImageIcon(path + "/src/menu_images/exit.png");
		exitButtonEnteredImage = new ImageIcon(path + "/src/menu_images/exit_entered.png");
		startButtonBasicImage = new ImageIcon(path + "/src/menu_images/startButtonBasic.png");
		startButtonEnteredImage = new ImageIcon(path + "/src/menu_images/startButtonEntered.png");
		quitButtonBasicImage = new ImageIcon(path + "/src/menu_images/quitButtonBasic.png");
		quitButtonEnteredImage = new ImageIcon(path + "/src/menu_images/quitButtonEntered.png");

		leftButtonBasicImage = new ImageIcon(path + "/src/menu_images/leftButtonBasic.png");
		leftButtonEnteredImage = new ImageIcon(path + "/src/menu_images/leftButtonEntered.png");
		rightButtonBasicImage = new ImageIcon(path + "/src/menu_images/rightButtonBasic.png");
		rightButtonEnteredImage = new ImageIcon(path + "/src/menu_images/rightButtonEntered.png");
		

		exitButton = new JButton(exitButtonBasicImage);
		exitButton.setBounds(1245, 0, 30, 30);
		exitButton.setBorderPainted(false);
		exitButton.setContentAreaFilled(false);
		exitButton.setFocusPainted(false);

		exitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				exitButton.setIcon(exitButtonEnteredImage);
				exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
				Music enterMusic = new Music("Sound_BtnEnter.mp3", false);
				enterMusic.start();
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


		startButton = new JButton(startButtonBasicImage);
		startButton.setBounds(40, 200, 400, 100);
		startButton.setBorderPainted(false);
		startButton.setContentAreaFilled(false);
		startButton.setFocusPainted(false);

		startButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				startButton.setIcon(startButtonEnteredImage);
				startButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
				Music enterMusic = new Music("Sound_BtnEnter.mp3", false);
				enterMusic.start();
			}

			@Override
			public void mouseExited(MouseEvent e) {
				startButton.setIcon(startButtonBasicImage);
				startButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				Music pressMusic = new Music("Sound_BtnPress.mp3", false);
				pressMusic.start();
				startButton.setVisible(false);
				quitButton.setVisible(false);
				leftButton.setVisible(true);
				rightButton.setVisible(true);
				
				background = new ImageIcon(path + "/src/images/main_back.jpg").getImage();

				isMainScreen = true;
			}

		});
		add(startButton);


		quitButton = new JButton(quitButtonBasicImage);
		quitButton.setBounds(40, 330, 400, 100);
		quitButton.setBorderPainted(false);
		quitButton.setContentAreaFilled(false);
		quitButton.setFocusPainted(false);

		quitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				quitButton.setIcon(quitButtonEnteredImage);
				quitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
				Music enterMusic = new Music("Sound_BtnEnter.mp3", false);
				enterMusic.start();
			}

			@Override
			public void mouseExited(MouseEvent e) {
				quitButton.setIcon(quitButtonBasicImage);
				quitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				Music pressMusic = new Music("Sound_BtnPress.mp3", false);
				pressMusic.start();
				try {
					Thread.sleep(1000);
				} catch (Exception e2) {
					e2.printStackTrace();
				}

				System.exit(0);
			}

		});
		add(quitButton);
		
		
		leftButton = new JButton(leftButtonBasicImage);
		leftButton.setBounds(140, 310, 60, 60);
		leftButton.setBorderPainted(false);
		leftButton.setContentAreaFilled(false);
		leftButton.setFocusPainted(false);

		leftButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				leftButton.setIcon(leftButtonEnteredImage);
				leftButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
				Music enterMusic = new Music("Sound_BtnEnter.mp3", false);
				enterMusic.start();
			}

			@Override
			public void mouseExited(MouseEvent e) {
				leftButton.setIcon(leftButtonBasicImage);
				leftButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				Music pressMusic = new Music("Sound_BtnPress.mp3", false);
				pressMusic.start();
			}

		});
		add(leftButton);
		
		rightButton = new JButton(rightButtonBasicImage);
		rightButton.setBounds(140, 310, 60, 60);
		rightButton.setBorderPainted(false);
		rightButton.setContentAreaFilled(false);
		rightButton.setFocusPainted(false);

		rightButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				rightButton.setIcon(rightButtonEnteredImage);
				rightButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
				Music enterMusic = new Music("Sound_BtnEnter.mp3", false);
				enterMusic.start();
			}

			@Override
			public void mouseExited(MouseEvent e) {
				rightButton.setIcon(quitButtonBasicImage);
				rightButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				Music pressMusic = new Music("Sound_BtnPress.mp3", false);
				pressMusic.start();
			}

		});
		add(rightButton);
		

		menuBar = new JLabel(new ImageIcon(path + "/src/menu_images/menuBar.png"));
		menuBar.setBounds(0, 0, 1280, 30);

		menuBar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
			}
		});

		menuBar.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				setLocation(x - mouseX, y - mouseY);
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
		g.drawImage(background, 0, 0, null);
		if (isMainScreen) {
			g.drawImage(selectedImage, 340, 100, null);
		}

		paintComponents(g);
		this.repaint();

	}

}
