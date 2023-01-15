package ktetris.view;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.logging.Logger;

import javax.swing.JFrame;

import ktetris.controller.KTetrisController;

public class MainFrame extends JFrame implements WindowListener {

	private static final long serialVersionUID = -6582020535286376937L;
	private KTetrisController controller;
	private final static Logger LOG = Logger.getGlobal();

	public MainFrame() {
		super();
		LOG.info("*** Start ***");

		this.setResizable(false);
		this.setBounds(100, 100, 359, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);

		addWindowListener(this);

		LOG.info("*** Finish ***");
	}

	public void setController(KTetrisController controller)	{
		this.controller = controller;
		return;
	}

	@Override
	public void windowOpened(WindowEvent e) {
		LOG.info("*** Start ***");
		LOG.info("*** Finish ***");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		LOG.info("*** Start ***");
		controller.gameOver();
		LOG.info("*** Finish ***");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		LOG.info("*** Start ***");
		LOG.info("*** Finish ***");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		LOG.info("*** Start ***");
		LOG.info("*** Finish ***");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		LOG.info("*** Start ***");
		LOG.info("*** Finish ***");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		LOG.info("*** Start ***");
		LOG.info("*** Finish ***");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		LOG.info("*** Start ***");
		LOG.info("*** Finish ***");
	}

}