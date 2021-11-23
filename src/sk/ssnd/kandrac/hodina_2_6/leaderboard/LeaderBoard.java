package sk.ssnd.kandrac.hodina_2_6.leaderboard;

public class LeaderBoard {

	private Item[] items = new Item[10];
	
	public void add(Item item) {
		
		// hladanie prvej pozicie na prepis (10 = neprepisovat)
		int targetPosition = 10;
		for (int i = 0; i < 10; i++) {
			if (items[i] == null || items[i].getScore() < item.getScore()) {
				targetPosition = i;
				break;
			}
		}
		
		// posuvanie poloziek, kym netrafime null / koniec zoznamu
		Item actual = item;
		Item next;
		for (int i = targetPosition; i < 10; i++) {
			if (items[i] == null) { items[i] = actual; break; }
			next = items[i];
			items[i] = actual;
			actual = next;
		}
	}
	
	public void print() {
		for (int i = 0; i < 10; i++) {
			if (items[i] == null) break;
			System.out.println(items[i].getScore() + " -> " + items[i].getName());
		}
	}
}
