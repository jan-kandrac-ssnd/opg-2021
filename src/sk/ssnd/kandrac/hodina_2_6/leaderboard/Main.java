package sk.ssnd.kandrac.hodina_2_6.leaderboard;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		LeaderBoard board = new LeaderBoard();
		
		for (int i = 0; i < n; i++) {
			board.add(new Item(s.next(), s.nextInt()));
		}
		
		board.print();
	}

}
