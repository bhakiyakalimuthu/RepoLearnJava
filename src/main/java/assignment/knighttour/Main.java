package assignment.knighttour;

/**
 * @author : Bhakiyaraj Kalimuthu
 * @date : 2019-05-31
 */
public class Main {
	public static void main(String[] args) {
		long time = System.nanoTime();
		StringBuilder sb = new StringBuilder();
		for (Position p : new KnightTour(Integer.parseInt(args[0]))) {
			sb.append("N-").append(p).append('\n');
		}
		System.out.print(sb);
		System.err.printf("\nTime used to solve: %d nanoseconds\n", System.nanoTime() - time);
	}
}
