package basics.collectionutil;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class ComparableVsComparator {

	public static void main(String[] args) throws JsonProcessingException {

//	ComparableVsComparator.playerOneTest();
	ComparableVsComparator.playerTwoTest();



	}

	private static void playerOneTest() throws JsonProcessingException {
		PlayerOne player1 = new PlayerOne(3,"Kavin", 2);
		PlayerOne player2 = new PlayerOne(2,"Seetha", 32);
		PlayerOne player3 = new PlayerOne(1,"Bhaki", 35);

		ObjectMapper mapper = new ObjectMapper();
		List<PlayerOne> list = new ArrayList<>();

		list.add(player2);
		list.add(player1);
		list.add(player3);

		System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list));
		Collections.sort(list);
		System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list));
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list));
	}

	private static void playerTwoTest() throws JsonProcessingException {
		PlayerTwo player1 = new PlayerTwo(3,"Kavin", 2);
		PlayerTwo player2 = new PlayerTwo(2,"Seetha", 32);
		PlayerTwo player3 = new PlayerTwo(1,"Bhaki", 35);

		ObjectMapper mapper = new ObjectMapper();
		List<PlayerTwo> list = new ArrayList<>();


		list.add(player2);
		list.add(player1);
		list.add(player3);

		System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list));
		Collections.sort(list,new PlayerTwoScoreComparator());

		System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list));
//		Collections.sort(list,Collections.reverseOrder());
//		System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list));

//		System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list));
		Collections.sort(list,new PlayerTwoAgeComparator());

		System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list));
	}
}

class PlayerOne implements Comparable<PlayerOne>{

	private int playerScore;
	private String playerName;
	private int playerAge;

	public PlayerOne(int playerScore, String playerName, int playerAge) {
		this.playerScore = playerScore;
		this.playerName = playerName;
		this.playerAge = playerAge;
	}

	public int getPlayerOneScore() {
		return playerScore;
	}

	public void setPlayerOneScore(int playerScore) {
		this.playerScore = playerScore;
	}

	public String getPlayerOneName() {
		return playerName;
	}

	public void setPlayerOneName(String playerName) {
		this.playerName = playerName;
	}

	public int getPlayerOneAge() {
		return playerAge;
	}

	public void setPlayerOneAge(int playerAge) {
		this.playerAge = playerAge;
	}

	@Override
	public int compareTo(PlayerOne player) {
		return (this.getPlayerOneScore() - player.getPlayerOneScore());
	}

}

class PlayerTwo implements Comparator {
	private int playerScore;
	private String playerName;
	private int playerAge;

	public PlayerTwo(int playerScore, String playerName, int playerAge) {
		this.playerScore = playerScore;
		this.playerName = playerName;
		this.playerAge = playerAge;
	}

	public int getPlayerScore() {
		return playerScore;
	}

	public void setPlayerScore(int playerScore) {
		this.playerScore = playerScore;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getPlayerAge() {
		return playerAge;
	}

	public void setPlayerAge(int playerAge) {
		this.playerAge = playerAge;
	}

	@Override
	public int compare(Object o1, Object o2) {
		return 0;
	}


}

class PlayerTwoScoreComparator implements  Comparator<PlayerTwo> {

	@Override
	public int compare(PlayerTwo o1, PlayerTwo o2) {
		return (o1.getPlayerScore() - o2.getPlayerScore());
	}
}

class PlayerTwoAgeComparator implements  Comparator<PlayerTwo> {

	@Override
	public int compare(PlayerTwo o1, PlayerTwo o2) {
		return (o1.getPlayerAge() - o2.getPlayerAge());
	}
}
