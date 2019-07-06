package assignment;

/**
 * @author : Bhakiyaraj Kalimuthu
 * @date : 2019-05-30
 */
public class RecursionTour {
	private static int MAX_MOVES= 10*10;
	private static int MOVES[][] = new int[][] { { 2, 1 }, { 2, -1 }, { 1, 2 }, { 1, -2 }, { -2, 1 }, { -2, -1 }, { -1, 2 }, { -1, -2 } };

	private static boolean placeKnights(int[][] board, int presentRow, int presentCol, int kthMove) {
		if (kthMove >= MAX_MOVES) {
			printBoard(board);
		}

		for (int i = 0; i < MOVES.length; i++) {
			int newRow = presentRow + MOVES[i][0];
			int newCol = presentCol + MOVES[i][1];
			if (isSafe(board, newRow, newCol)) {
				board[newRow][newCol] = kthMove;
				if (placeKnights(board, newRow, newCol, kthMove + 1)) {
					return true;
				} else {
					board[newRow][newCol] = -1;
				}
			}
		}
		return false;
	}

	private static boolean isSafe(int[][] board, int row, int col) {

		if (row < 0 || row > board.length - 1 || col < 0 || col > board.length - 1 || board[row][col] != -1) {
			return false;
		}
		return true;
	}

	private static void printBoard(int[][] board){
		System.out.println(board[0][0]*board[0][1]);
	}

	public static void main(String[] args) {

	}
}
