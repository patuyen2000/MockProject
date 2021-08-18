package fa.training.entities;
import java.sql.SQLException;
import java.util.List;

public interface BookDAO {
	Book findContentByBookID(int bookID) throws SQLException;
	
	List<Book> findBookByBookTitle(String BookTitle) throws SQLException;
	
	List<Book> findBookByAuthor(String Author) throws SQLException;
	
	List<Book> findBookByCategory(String Category) throws SQLException;
}
