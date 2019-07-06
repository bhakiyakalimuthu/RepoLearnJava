package assignment.warnsdorff;

/**
 * @author : Bhakiyaraj Kalimuthu
 * @date : 2019-05-31
 */
public class BoardPosition {

	private int x;
	private int y;

	public BoardPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}



	static boolean isInBounds(BoardPosition bp, int maxX, int maxY) {
		int x = bp.getX(), y = bp.getY();
		return x >= 0 && x < maxX && y >= 0 && y < maxY;
	}

	static boolean isVisited(BoardPosition bp, int board[][]) {
		return board[bp.getX()][bp.getY()] != -1;
	}

	static void visit(BoardPosition bp, int board[][], int val) {
		board[bp.getX()][bp.getY()] = val;
	}
}
