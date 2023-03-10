package ktetris.model;

import java.awt.Color;
import java.util.Random;
import java.util.logging.Logger;

import ktetris.controller.KTetrisController;

public class KTetrisBlock {
	public final int BLOCK_TYPE = 7;
	public final int BLOCK_ROW = 4;
	public final int BLOCK_COL = 4;
	
	// rainbow 7 colors : red, orange, yellow, green, blue, indigo, purple
	public static final Color[] COLORS = { Color.RED, Color.ORANGE,
			Color.YELLOW, Color.GREEN, Color.BLUE, Color.decode("#4B0082"),
			Color.decode("#800080") };
	
	public int[][] block = new int[BLOCK_ROW][BLOCK_COL];
	public int posX = 0, posY = 0;
	public Color color; // color.
	private KTetrisController controller;
	
	private final static Logger LOG = Logger.getGlobal();

	public KTetrisBlock(KTetrisController controller) {
		LOG.info("**** Start *****");
		
		this.controller = controller;
		Random rand = new Random();
		this.color = COLORS[rand.nextInt(COLORS.length)];
		setBlock(rand.nextInt(BLOCK_TYPE));
		
		LOG.info("**** Finish *****");
		
	}
	
	private void setBlock(int type) {
		LOG.info("**** Start *****");
		
		if (type == 0) {
			block[0] = new int[] { 0, 1, 0, 0 };
			block[1] = new int[] { 0, 1, 0, 0 };
			block[2] = new int[] { 0, 1, 0, 0 };
			block[3] = new int[] { 0, 1, 0, 0 };
		} else if (type == 1) {
			block[0] = new int[] { 0, 0, 0, 0 };
			block[1] = new int[] { 0, 1, 0, 0 };
			block[2] = new int[] { 0, 1, 1, 1 };
			block[3] = new int[] { 0, 0, 0, 0 };
		} else if (type == 2) {
			block[0] = new int[] { 0, 0, 0, 0 };
			block[1] = new int[] { 1, 1, 1, 0 };
			block[2] = new int[] { 0, 0, 1, 0 };
			block[3] = new int[] { 0, 0, 0, 0 };
		} else if (type == 3) {
			block[0] = new int[] { 0, 0, 0, 0 };
			block[1] = new int[] { 0, 1, 1, 0 };
			block[2] = new int[] { 0, 1, 1, 0 };
			block[3] = new int[] { 0, 0, 0, 0 };
		} else if (type == 4) {
			block[0] = new int[] { 0, 0, 0, 0 };
			block[1] = new int[] { 0, 1, 0, 0 };
			block[2] = new int[] { 1, 1, 1, 0 };
			block[3] = new int[] { 0, 0, 0, 0 };
		} else if (type == 5) {
			block[0] = new int[] { 0, 0, 0, 0 };
			block[1] = new int[] { 0, 1, 1, 0 };
			block[2] = new int[] { 1, 1, 0, 0 };
			block[3] = new int[] { 0, 0, 0, 0 };
		} else if (type >= 6) {
			block[0] = new int[] { 0, 0, 0, 0 };
			block[1] = new int[] { 1, 1, 0, 0 };
			block[2] = new int[] { 0, 1, 1, 0 };
			block[3] = new int[] { 0, 0, 0, 0 };
		}
		
		LOG.info("**** Finish *****");
		
	}
	
	public void nextBlock(KTetrisBoard board) {
		LOG.info("**** Start *****");
		Random rand = new Random();
		this.color = COLORS[rand.nextInt(COLORS.length)];
		setBlock(rand.nextInt(BLOCK_TYPE));
		
		LOG.info("**** Finish *****");
		return ;
	}	
	
	private static int[][] rotate(int[][] m) {
		LOG.info("**** Start *****");
		int N = m.length;
		int M = m[0].length;
		// ?????? ?????????????????? ???????????????.
		int[][] copyMap = new int[M][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				copyMap[j][N - 1 - i] = m[i][j];
			}
		}

		LOG.info("**** Finish *****");
		// ?????? ?????? ????????? ???????????????.
		return copyMap;
	}

	

	public void rotateBlock(KTetrisBoard board) {
		LOG.info("**** Start *****");
		
		int[][] currentBlock = block.clone();
		int[][] nextBlock = new int[4][4];

//		// ?????? ?????????.
//		for (int i = 0; i < block.length; i++)
//			for (int j = 0; j < block[i].length; j++)
//				nextBlock[i][j] = 0;
//		for (int i = 0; i < block.length; i++)
//			for (int j = 0; j < block[i].length; j++)
//				nextBlock[i][j] = block[j][3 - i];
		
		nextBlock = rotate(currentBlock);

		block = nextBlock;
//		trim(); // ?????? ????????????.
//		int currPOSX = posX;
//		boolean isAbleToRotate = false; // ?????? ??? ????????? ??????.
//		for (int i = 0; i < 4; i++) { // 4??? ?????? ?????????.
//			posX = currPOSX - i; // ????????? ?????????.
//			if (isAbleToMoveAfterCrachCheck(board, 0, 0)) {// ???????????? ?????? ?????? ??????,
//				isAbleToRotate = true; // flag??? ?????????,
//				break; // ?????? ??????.
//			}
//		}
//		if (!isAbleToRotate) { // ??? ???????????? ????????? ????????????,
//			posX = currPOSX;
//			block = currentBlock; // ???????????? ?????? ??????.
//		}
//		if (posX + getRightBorder() > TetrisBoard.x) {
//			// ????????????, ???????????? ???????????? ??????.
//			System.out.println("out" + ""
//					+ (posX + getRightBorder() - TetrisBoard.x)); // ????????????.
//			posX = posX - (posX + getRightBorder() - TetrisBoard.x);
//			// ?????????????????? ???????????? ??????.
//		}
//		trim();
		LOG.info("**** Finish *****");
	}

	private int getLeftBorder() {
		LOG.info("**** Start *****");
		// FIXME temp variables
		int i = 0, j = 0;
		int tmp1 = 3;
		int tmp2 = 3;

		for (j = 0; j < block.length; j++) {
			for (i = 0; i < block[j].length; i++) {
				if (block[j][i] >= 1) {
					tmp1 = i;
					break;
				}
			}
			if (tmp1 < tmp2)
				tmp2 = tmp1;
			tmp1 = 3;
		}

		LOG.info("**** Finish *****");
		return tmp2;
	}
	
}


