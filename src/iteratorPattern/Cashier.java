package iteratorPattern;

public class Cashier {
	ComicStore store;
	ComicBook comicBook;
	
	public Cashier(ComicStore store) {
		this.store = store;
		//this.comicBook = comicBook;
}
	
	public void printInventory() {
		
		Iterator inventoryIterator = store.createIterator();
	
		printInventory(inventoryIterator);
	}
	
	private void printInventory(Iterator iterator) {
		
		System.out.println("Current Comic Inventory");
		while (iterator.hasNext()) {
			ComicBook comicBook = iterator.next();
			System.out.print(comicBook.getTitle() + ", ");
			System.out.print(comicBook.getPublisher()+", #");
			System.out.print(comicBook.getIssueNum()+", $");
			System.out.print(comicBook.getCost()+"\n");
		}
	}
}