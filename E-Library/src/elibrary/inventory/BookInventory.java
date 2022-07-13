package elibrary.inventory;

import java.util.ArrayList;

import elibrary.excep.BookAlreadyIssuedException;
import elibrary.excep.ISBNAlreadyExistsException;
import elibrary.excep.ISBNDoesNotExistsException;
import elibrary.model.Book;

public interface BookInventory {
	
	void issuebook(ArrayList<Book> al) throws  ISBNDoesNotExistsException, BookAlreadyIssuedException;
    void addbook(ArrayList<Book> al) throws  ISBNAlreadyExistsException;
}
