package ktetris.controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.logging.Logger;

import javax.swing.JFrame;

import ktetris.model.ViewListener;


public class KTetrisController implements Runnable, KeyListener {
	
	private final int THREAD_PAINT_SLEEP = 30;
	private final int THREAD_INTERVAL = 2000; // 2000 * 30 / 1000 = 60(sec)
	
	private boolean isThreadAlive;
	private JFrame frame;
	private ArrayList<ViewListener> viewListener;
	
	private final static Logger LOG = Logger.getGlobal();
	
	public KTetrisController(JFrame frame) {
		
		LOG.info("**** Start *****");
		 
		this.isThreadAlive = true;
		this.frame = frame;
		
		this.viewListener = new ArrayList<ViewListener>();
		
		LOG.info("**** Finish *****");
	}
	

	@Override
	public void run() {
		LOG.info("**** Start *****");

		String threadName = Thread.currentThread().getName();
		LOG.info(String.format("- %s has been started", threadName));
		
//		openGame();
		int speed = 20;
		for (int moveTrigger = 0; isThreadAlive; moveTrigger++) {
			// move
			if (moveTrigger % speed == 0) {
//			currBlock.downBlock(board);
				if (moveTrigger % THREAD_INTERVAL == 0)
					speed--;
			}
			// paint
//			reaquestPaint();
			try {
				Thread.sleep(THREAD_PAINT_SLEEP);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		closeGame();
		
		LOG.info(String.format("- %s has been ended", threadName));
		LOG.info("**** Finish *****");
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
///////////////////////////////////////////////////////////////////////////////////////

	public void addViewListener(ViewListener listener) {
		this.viewListener.add(listener);
	}
	
	public void gameStart() {
		LOG.info("**** Start *****");
		Thread t = new Thread(this);
		t.start();
		LOG.info("**** Finish *****");
	}
	
	public void gameOver() {
		LOG.info("**** Start *****");
		isThreadAlive = false;
		System.exit(0);
		LOG.info("**** Finish *****");
	}

	private void closeGame() {
		frame.removeKeyListener(this);
	}


}

