package fa.training.service;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import fa.training.entities.Book;
import fa.training.entities.BookDAO;
import fa.training.entities.User;
import fa.training.entities.UserDAO;
import fa.training.impl.BookDAOImpl;
import fa.training.impl.UserDAOImpl;


public class UserService {
	
	public void displayAll() {
		UserDAO userDAO = new UserDAOImpl();
		try {
			List<User> users = userDAO.getAll();
			System.out.println("\n------All User---------");
			users.forEach(System.out::println);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void viewContentByBookID(int bookID) {
		BookDAO bookDAO= new BookDAOImpl();
		try {
			Book books= bookDAO.findContentByBookID(bookID);
			if (books==null) {
				System.out.println("No content found!");
			} else {
				System.out.println(books.getBookTitle().toUpperCase());
				System.out.println(books.getContent());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void searchTypeByBookTitle(String BookTitle) {
		BookDAO bookDAO= new BookDAOImpl();
		try {
			List<Book> books = bookDAO.findBookByBookTitle(BookTitle);
			if (books.isEmpty()) {
				System.out.println("No book found!");
			} else {
				
				System.out.println("-About "+ books.size()+ " results:");
				books.forEach(System.out::println);
			}
		} catch (Exception e) {
			// TODO: handle exception
//			System.out.println("Hello");
		}
	}
	
	public void searchTypeByAuthor(String Author) {
		BookDAO bookDAO= new BookDAOImpl();
		try {
			List<Book> books = bookDAO.findBookByAuthor(Author);
			if (books.isEmpty()) {
				System.out.println("No book found!");
			} else {
				
				System.out.println("-About "+ books.size()+ " results:");
				books.forEach(System.out::println);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Hello");
		}
	}
	
	public void searchTypeByCategory(String Category) {
		BookDAO bookDAO= new BookDAOImpl();
		try {
			List<Book> books = bookDAO.findBookByCategory(Category);
			if (books.isEmpty()) {
				System.out.println("No book found!");
			} else {
				
				System.out.println("-About "+ books.size()+ " results:");
				books.forEach(System.out::println);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Hello");
		}
	}
	
	
	
	
	public static void main(String[] args) throws SQLException {
		Scanner scanner = new Scanner(System.in);
		UserService userService = new UserService();
		
		String choice = "";
		do {
			getMenu();
			System.out.println("Enter your choice:");
			choice = scanner.nextLine();

			switch (choice) {
			case "1":
				
				break;
			case "2":
				
				break;

			case "3":
				userService.displayAll();
				break;
			case "4":
				System.out.println("Please enter the book's id: ");
				userService.viewContentByBookID(Integer.parseInt(scanner.nextLine()));
				break;
			case "5":
				System.out.println("Please select search type: \r\n"
						+ "1.By name\r\n"
						+ "2.By author\r\n"
						+ "3.By category");
				int choice2=Integer.parseInt(scanner.nextLine());
				switch (choice2) {
				case 1:
					System.out.println("Please enter book's name: ");
					String BookTitle=scanner.nextLine();
					userService.searchTypeByBookTitle(BookTitle);
					break;
					
				case 2:
					System.out.println("Please enter book's Author: ");
					String Author=scanner.nextLine();
					userService.searchTypeByAuthor(Author);
					break;
					
				case 3:
					System.out.println("Please enter book's Category: ");
					String Category=scanner.nextLine();
					userService.searchTypeByCategory(Category);
					break;
				default:
					System.out.println("Invalid input!");
					break;
				}
				break;
			case "6":
				
				break;
			case "7":
				System.exit(0);
				break;
			default:
				System.out.println("Invalid input!");
				break;
			}
		} while (true);

	}
	
	public static void getMenu() {
		System.out.println("-----Menu-----");
		System.out.println("1. ");
		System.out.println("2. ");
		System.out.println("UC3. Display all User");
		System.out.println("UC4. View Book Detail ");
		System.out.println("UC5: Search Books ");
		System.out.println("6. ");
		System.out.println("7. Exit");
	}

//	public static String getCurrentDate() {
//		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//		return format.format(new Date());
//	}
}
