package fa.training.entities;

public class Book {
	private int BookID;
	private String BookTitle,Author,brief,publisher,content,Category;
	public int getBookID() {
		return BookID;
	}
	public void setBookID(int bookID) {
		BookID = bookID;
	}
	public String getBookTitle() {
		return BookTitle;
	}
	public void setBookTitle(String bookTitle) {
		BookTitle = bookTitle;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public Book(int bookID, String bookTitle, String author, String brief, String publisher, String content,
			String category) {
		super();
		this.BookID = bookID;
		this.BookTitle = bookTitle;
		this.Author = author;
		this.brief = brief;
		this.publisher = publisher;
		this.content = content;
		this.Category = category;
	}
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Book [BookID=" + BookID + ", BookTitle=" + BookTitle + ", Author=" + Author + ", brief=" + brief
				+ ", publisher=" + publisher + ", content=" + content + ", Category=" + Category + "]";
	}
	
	
	
	
}
