package iteratorPattern;

public class CashierTest {
	public static void main(String[] args) {
		
		ComicStore store = new ComicStore();
		
		Cashier cashier = new Cashier(store);
		
		cashier.printInventory();
	}
}
