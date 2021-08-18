package fa.training.common;
//STT id name author category title publisher
public class SQLCommand {
	public final static String USER_QUERY_FIND_ALL = "SELECT * FROM [ReadingBook].[dbo].[Users]";
	public final static String USER_QUERY_VIEW_CONTENT_BOOK_BY_BOOKID = "SELECT BookTitle,content FROM [ReadingBook].[dbo].[Book] WHERE BookID=?";
	public final static String USER_QUERY_FIND_BOOK_BY_BOOKTITLE = "SELECT * FROM [ReadingBook].[dbo].[Book] WHERE BookTitle=?";
	public final static String USER_QUERY_FIND_BOOK_BY_AUTHOR = "SELECT * FROM [ReadingBook].[dbo].[Book] WHERE Author=?";
	public final static String USER_QUERY_FIND_BOOK_BY_CATEGORY = "SELECT * FROM [ReadingBook].[dbo].[Book] WHERE Category=?";
	
}
