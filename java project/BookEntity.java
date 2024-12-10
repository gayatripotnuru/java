package extraExercises;

class BookEntity{
	String BookTitle;
	String BookAuthor;
	String Zonar;
	int BookID;
	public BookEntity() {
		super();
	}
	public BookEntity(String bookTitle, String bookAuthor, String zonar, int bookID) {
		BookTitle = bookTitle;
		BookAuthor = bookAuthor;
		Zonar = zonar;
		BookID = bookID;
	}
	public String getBookTitle() {
		return BookTitle;
	}
	public void setBookTitle(String bookTitle) {
		BookTitle = bookTitle;
	}
	public String getBookAuthor() {
		return BookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		BookAuthor = bookAuthor;
	}
	public String getZonar() {
		return Zonar;
	}
	public void setZonar(String zonar) {
		Zonar = zonar;
	}
	public int getBookID() {
		return BookID;
	}
	public void setBookID(int bookID) {
		BookID = bookID;
	}
	}

