package iteratorPattern;

public class ComicStore {
	
	int numberOfItems = 0;
	ComicBook[] comicBooks;
	
	public ComicStore(){
	
	comicBooks = new ComicBook[5];
		
	comicBooks[0] = addComic("Batman","DC",2,2.99);
	comicBooks[1] = addComic("Superman","DC",52,2.99);
	comicBooks[2] = addComic("Spiderman","Marvel",616,2.99);


	
	}
	
	public Iterator createIterator() {
		
		return new ComicIterator(comicBooks);
	}
	public ComicBook addComic(String title, String publisher, int issueNum, double cost) {
		ComicBook comic = new ComicBook(title, publisher, issueNum, cost);
		return comic;
	}
		
}
