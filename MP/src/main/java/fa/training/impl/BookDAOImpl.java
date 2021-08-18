package fa.training.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fa.training.common.DBConnection;
import fa.training.common.SQLCommand;
import fa.training.entities.Book;
import fa.training.entities.BookDAO;

public class BookDAOImpl implements BookDAO {
	private Connection connection = null;
	private PreparedStatement preparedStatement = null;
	private CallableStatement caStatement = null;
	private ResultSet results = null;

	public Book findContentByBookID(final int bookID) throws SQLException {
		Book book = null;
		try {
			connection = DBConnection.getInstance().getConnection();
			preparedStatement = connection.prepareStatement(SQLCommand.USER_QUERY_VIEW_CONTENT_BOOK_BY_BOOKID);
			preparedStatement.setInt(1, bookID);
			results = preparedStatement.executeQuery();
			if (results.next()) {
				book = new Book();
				book.setBookTitle(results.getString("BookTitle"));
				book.setContent(results.getNString("content"));
			}

		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return book;
	}

	@Override
	public List<Book> findBookByBookTitle(final String BookTitle) throws SQLException {
		// TODO Auto-generated method stub
		List<Book> books = new ArrayList<>();
		Book book =null;
		try {
			connection = DBConnection.getInstance().getConnection();
			preparedStatement = connection.prepareStatement(SQLCommand.USER_QUERY_FIND_BOOK_BY_BOOKTITLE);
			preparedStatement.setString(1, BookTitle);
			results = preparedStatement.executeQuery();
			if (results.next()) {
				book = new Book();
				book.setBookID(results.getInt("BookID"));
				book.setBookTitle(results.getString("BookTitle"));
				book.setAuthor(results.getString("Author"));
				book.setCategory(results.getString("Category"));
				book.setBrief(results.getString("brief"));
				book.setPublisher(results.getString("publisher"));
//				book.setContent(results.getString("content"));
				books.add(book);
			}

		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return books;
	}

	@Override
	public List<Book> findBookByAuthor(final String Author) throws SQLException {
		// TODO Auto-generated method stub
		List<Book> books = new ArrayList<>();
		Book book =null;
		try {
			connection = DBConnection.getInstance().getConnection();
			preparedStatement = connection.prepareStatement(SQLCommand.USER_QUERY_FIND_BOOK_BY_AUTHOR);
			preparedStatement.setString(1, Author);
			results = preparedStatement.executeQuery();
			if (results.next()) {
				book = new Book();
				book.setBookID(results.getInt("BookID"));
				book.setBookTitle(results.getString("BookTitle"));
				book.setAuthor(results.getString("Author"));
				book.setCategory(results.getString("Category"));
				book.setBrief(results.getString("brief"));
				book.setPublisher(results.getString("publisher"));
				
				books.add(book);
			}

		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return books;
	}

	@Override
	public List<Book> findBookByCategory(final String Category) throws SQLException {
		// TODO Auto-generated method stub
		List<Book> books = new ArrayList<>();
		Book book =null;
		try {
			connection = DBConnection.getInstance().getConnection();
			preparedStatement = connection.prepareStatement(SQLCommand.USER_QUERY_FIND_BOOK_BY_CATEGORY);
			preparedStatement.setString(1, Category);
			results = preparedStatement.executeQuery();
			if (results.next()) {
				book = new Book();
				book.setBookID(results.getInt("BookID"));
				book.setBookTitle(results.getString("BookTitle"));
				book.setAuthor(results.getString("Author"));
				book.setCategory(results.getString("Category"));
				book.setBrief(results.getString("brief"));
				book.setPublisher(results.getString("publisher"));
				
				books.add(book);
			}

		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return books;
	}

}
