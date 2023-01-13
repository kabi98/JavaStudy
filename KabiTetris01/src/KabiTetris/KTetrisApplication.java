package KabiTetris;

import javax.swing.JFrame;
import javax.swing.JPanel;

import ktetris.view.MainFrame;


//import com.lemonapple.javatetris.TetrisApplication;

public class KTetrisApplication {
	private JFrame frame;

	public static void main(String[] args) {
		System.out.println("*** KTMain main Start ***");
		
//	    // create runnable objects
//	    Runnable runnable1 = new KRunnable();
//	    Runnable runnable2 = new KRunnable();
//
//	    Thread thread3 = new Thread(runnable1);
//	    thread3.setName("Thread #3");
//	    Thread thread4 = new Thread(runnable2);
//	    thread4.setName("Thread #4");
//
//	    // start all threads
//	    thread3.start();
//	    thread4.start();		
		
	    
		KTetrisApplication window = new KTetrisApplication();
		window.frame.setVisible(true);
	    
		
		System.out.println("*** KTMain main Finish ***");
	}
	
	public KTetrisApplication() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new MainFrame();
		
//		TetrisGameController controller = new TetrisGameController(frame);
//		
//		JPanel statusBar = new StatusBar(controller);
//		frame.getContentPane().add(statusBar);
//		
//		JPanel tetrisView = new TetrisView(controller);
//		frame.getContentPane().add(tetrisView);
//		
//		JPanel nextBlocksView = new NextBlockView(controller);
//		frame.getContentPane().add(nextBlocksView);
//		
//		JPanel holdingBlockView = new HoldBlockView(controller);
//		frame.getContentPane().add(holdingBlockView);
	}
	

}
