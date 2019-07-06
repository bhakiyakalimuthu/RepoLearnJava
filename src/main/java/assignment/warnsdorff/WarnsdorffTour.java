package assignment.warnsdorff;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author : Bhakiyaraj Kalimuthu
 * @date : 2019-05-31
 */
public class WarnsdorffTour {
	// Dimensions of this chess board.
	public static int COL = 10;
	public static int ROW = 10;

	// Moves of a knight.
	public static int dxKnight[] = { -3,3,0,0,-2,2,-2,2 };
	public static int dyKnight[] = { 0,0,3,-3,2,2,-2,-2 };

//	public static int dxKnight[] = { -2, -2, -1, 1, 2, 2, -1, 1 };
//	public static int dyKnight[] = { 1, -1, 2, 2, 1, -1, -2, -2 };
	private int board[][];

	public int[][] getBoard() {
		return board;
	}

	public void setBoard(int[][] board) {
		this.board = board;
	}

	private void initBoard() {
		board = new int[ROW][COL];
		for (int i = 0; i < ROW; ++i) {
			Arrays.fill(board[i], -1);
		}
//		System.out.println(Arrays.deepToString(board));
	}

	public String performAllTours() {
		JSONObject tours = new JSONObject();
		for (int x = 0; x < ROW; x++) {
			for (int y = 0; y < COL; y++) {
				initBoard();
				int currStep = 1;
				BoardPosition initBoardPosition = new BoardPosition(x, y);
				BoardPosition.visit(initBoardPosition, board, currStep);
				if (!solve(board, initBoardPosition, currStep + 1)) {
					System.out.println("Failed to perform Kinght's Tour starting at: " + "[" + x + ", " + y + "]!");
				} else {
//					System.out.println(x + ", " + y);
					tours.put(x + ", " + y, jsonifyTour(x, y));
				}
			}
		}
		// Pretty print.
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		return gson.toJson(tours);
	}

	// Returns the number of accessible positions.
	private int weight(BoardPosition bp) {
		return getNeighbours(bp).size();
	}

	// Tries to traverse the entire board recursively.
	private boolean solve(int board[][], BoardPosition bp, int currStep) {
		// End of the step sequence.
		if (currStep == ((ROW * COL) + 1)) {
			return true;
		}
		List<BoardPosition> neighbours = getNeighbours(bp);
		BoardPosition chosen = null;
		int minWeight = Integer.MAX_VALUE;
		// Choose the candidate with the min weight.
		for (BoardPosition pos : neighbours) {
			// Not subtracting 1 from this i.e not subtracting the current cell
			// from this weight because
			// it's normalized across all cells.
			int currWeight = weight(pos);
			if (currWeight < minWeight) {
				chosen = pos;
				minWeight = currWeight;
			}
		}
		if (chosen == null) {
			return false;
		}
		BoardPosition.visit(chosen, board, currStep);
		return solve(board, chosen, currStep + 1);
	}

	// Returns accessible neighbours.
	private List<BoardPosition> getNeighbours(BoardPosition bp) {
		List<BoardPosition> candidates = new LinkedList<BoardPosition>();
		for (int i = 0; i < dxKnight.length; ++i) {
			BoardPosition newBoardPosition = new BoardPosition(dxKnight[i]
					+ bp.getX(), dyKnight[i] + bp.getY());
			if (BoardPosition.isInBounds(newBoardPosition, ROW, COL)
					&& !BoardPosition.isVisited(newBoardPosition, board)) {
				candidates.add(newBoardPosition);
			}
		}
		return candidates;
	}

	public JSONObject jsonifyTour(int x, int y) {
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("initPos", x + ", " + y);

		HashMap<Integer, String> posMap = new HashMap<Integer, String>();
		for (int i = 0; i < ROW; ++i) {
			for (int j = 0; j < COL; ++j) {
				posMap.put(board[i][j], i + ", " + j);
			}
		}
		JSONArray jsonArr = new JSONArray();
		for (int seq = 1; seq <= ROW * COL; ++seq) {
			if (posMap.containsKey(seq)) {
				jsonArr.add(posMap.get(seq));
			}
		}
//		System.out.println(jsonArr.size());
		jsonObj.put("seq", jsonArr);
		return jsonObj;
	}

	public static void main(String[] args) {
		WarnsdorffTour k = new WarnsdorffTour();
//		k.performAllTours();
		System.out.println(k.performAllTours());
	}
}
