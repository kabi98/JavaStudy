package ktetris.view;

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Logger;

import javax.swing.JPanel;

import ktetris.controller.KTetrisController;
import ktetris.model.KTetrisBlock;
import ktetris.model.KTetrisBoard;
import ktetris.model.ViewListener;


public class BoardView extends JPanel implements ViewListener{

	private static final long serialVersionUID = -8236763247406460328L;
	private final static Logger LOG = Logger.getGlobal();
	private final static int BOARD_X = 6;
	private final static int BOARD_Y = 58;
	private final static int BOARD_WIDTH = 250;
	private final static int BOARD_HEIGHT = 500;
	
	private KTetrisController controller;
	
	public BoardView(KTetrisController controller) {
		super();
		LOG.info("*** Start ***");
		this.controller = controller;
		controller.addViewListener(this);
		this.setBackground(Color.WHITE);
		this.setBounds(BOARD_X, BOARD_Y, BOARD_WIDTH, BOARD_HEIGHT);
		LOG.info("*** Finish ***");
	}
	
	@Override
	public void paint(Graphics g) {
		LOG.info("*** Start ***");
		super.paint(g);
		
		KTetrisBoard board = controller.getBoard();
		
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, getWidth(), getHeight());
		int height = getHeight() / board.ROW_SIZE;
		int width = getWidth() / board.COL_SIZE;
		Color[] whichColor = { Color.WHITE, Color.BLUE, Color.RED,
				Color.YELLOW, Color.GREEN };

		// draw back.
		for (int i = 0; i < board.COL_SIZE; i++) {
			for (int j = 0; j < board.ROW_SIZE; j++) {
				g.setColor(whichColor[board.Board[j][i]]);
				g.fillRect(width * i, height * j, width, height);
			}
		}
		
		// draw front
		KTetrisBlock lookingBlock = controller.getCurrentBlock();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (lookingBlock.block[j][i] > 0) {
					g.setColor(whichColor[lookingBlock.block[j][i]]);
					g.fillRect(width * (i + lookingBlock.posX), height
							* (j + lookingBlock.posY), width, height);
				}
			}
		}
		LOG.info("*** Finish ***");
	}
	
	@Override
	public void onRePaint() {
		repaint();
	}

}
