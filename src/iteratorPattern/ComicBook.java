package iteratorPattern;

public class ComicBook {

	String title, publisher;
	int issueNum;
	double cost;
	
	
	public ComicBook(String title, String publisher,
			int issueNum, double cost) {
		this.title = title;
		this.publisher = publisher;
		this.issueNum = issueNum;
		this.cost = cost;
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getIssueNum() {
		return issueNum;
	}
	public void setIssueNum(int issueNum) {
		this.issueNum = issueNum;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	


}
