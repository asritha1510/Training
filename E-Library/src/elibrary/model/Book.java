package elibrary.model;

public class Book {
	private int ISBN;
	private String name;
	public boolean issued=false;
	
	public Book(int iSBN, String name, boolean issued) {
		super();
		ISBN = iSBN;
		this.name = name;
		this.issued = issued;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isIssued() {
		return issued;
	}

	public void setIssued(boolean issued) {
		this.issued = issued;
	}
	
}