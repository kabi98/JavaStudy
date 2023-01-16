package ktetris.model;

import java.util.Random;

import ktetris.controller.KTetrisController;

public class KTetrisBlock {
	public final int BLOCK_TYPE = 7;
	public final int BLOCK_ROW = 4;
	public final int BLOCK_COL = 4;
	
	public int[][] block = new int[BLOCK_ROW][BLOCK_COL];
	public int posX = 0, posY = 0;
	public int c; // color.
	private KTetrisController controller;

	public KTetrisBlock(KTetrisController controller) {
		this.controller = controller;
		Random rand = new Random();
		this.c = 1 + rand.nextInt(4);
		setBlock(rand.nextInt(6), 0);
	}

	private void setBlock(int type, int rotation) {
		if (type == 0) {
			block[0] = new int[] { c, 0, 0, 0 };
			block[1] = new int[] { c, 0, 0, 0 };
			block[2] = new int[] { c, 0, 0, 0 };
			block[3] = new int[] { c, 0, 0, 0 };
		} else if (type == 1) {
			block[0] = new int[] { 0, 0, 0, 0 };
			block[1] = new int[] { 0, 0, 0, 0 };
			block[2] = new int[] { c, 0, 0, 0 };
			block[3] = new int[] { c, c, c, 0 };
		} else if (type == 2) {
			block[0] = new int[] { 0, 0, 0, 0 };
			block[1] = new int[] { c, 0, 0, 0 };
			block[2] = new int[] { c, 0, 0, 0 };
			block[3] = new int[] { c, c, 0, 0 };
		} else if (type == 3) {
			block[0] = new int[] { 0, 0, 0, 0 };
			block[1] = new int[] { 0, 0, 0, 0 };
			block[2] = new int[] { c, c, 0, 0 };
			block[3] = new int[] { c, c, 0, 0 };
		} else if (type == 4) {
			block[0] = new int[] { 0, 0, 0, 0 };
			block[1] = new int[] { c, 0, 0, 0 };
			block[2] = new int[] { c, c, 0, 0 };
			block[3] = new int[] { c, 0, 0, 0 };
		} else if (type == 5) {
			block[0] = new int[] { 0, 0, 0, 0 };
			block[1] = new int[] { c, 0, 0, 0 };
			block[2] = new int[] { c, c, 0, 0 };
			block[3] = new int[] { 0, c, 0, 0 };
		} else if (type >= 6) {
			block[0] = new int[] { 0, 0, 0, 0 };
			block[1] = new int[] { 0, 0, 0, 0 };
			block[2] = new int[] { c, c, 0, 0 };
			block[3] = new int[] { 0, c, c, 0 };
		}
	}

	
}
