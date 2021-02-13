package iteratorPattern;

public class ComicIterator implements Iterator {

	ComicBook[] comics;
	int position;
	
	public ComicIterator(ComicBook[] comics) {
		this.comics = comics;
	}
	


	@Override
	public ComicBook next() {
		// TODO Auto-generated method stub
		ComicBook comicBook = comics[position];
		position = position +1;
		return comicBook;
		
	}
	
	@Override
	public boolean hasNext() {
		if(position > comics.length || comics[position] == null) {
		return false;}
		
		else {
			return true;
		}
	}

}
