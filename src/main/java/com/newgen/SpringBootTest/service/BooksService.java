/**
Group						: Application Projects - II
Product / Project			: Test
Module						: Java File
File Name					: BooksService.java
Author						: alok ranjan
Date written (DD/MM/YYYY)	: Apr 19, 2019 12:31:50 PM
Date modified (DD/MM/YYYY)	: Apr 19, 2019 12:31:50 PM
Description					: 
---------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------
CHANGE HISTORY 
---------------------------------------------------------------------------------------------
BUG ID                Date			Change By			Change Description 

---------------------------------------------------------------------------------------------
*/

package com.newgen.SpringBootTest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newgen.SpringBootTest.model.Books;
import com.newgen.SpringBootTest.repository.BookRepository;

/**
 * @author alok_ranjan Apr 19, 2019
 */
@Service
public class BooksService {
	private Books book =  new Books();
	List<Books> bookList = new ArrayList<>();
	@Autowired
	private BookRepository bookRepo;
	/**
	 * @author alok ranjan
	 * Apr 19, 2019
	 * BookDao.java
	 * Books
	 * findAllBooks
	 * @return
	 */
	public List<Books> findAllBooks(){
		return (List<Books>) bookRepo.findAll();
	}
	/**
	 * @author alok ranjan
	 * Apr 19, 2019
	 * BookDao.java
	 * Books
	 * findByBookType
	 * @param bookType
	 * @return
	 */
	public Books findByBookType(String bookType){
		bookList = findAllBooks();
		for(Books b: bookList){
			if(b.getBookType().equalsIgnoreCase(bookType)){
				System.out.println("Inside if");
				return b;
			}
		}
		return null;
	}
	/**
	 * @author alok ranjan
	 * Apr 19, 2019
	 * BookDao.java
	 * Books
	 * findBookDetails
	 * @param bookName
	 * @return
	 */
	public Books findBookDetails(String bookName){
		for(Books b: bookList){
			if(b.getBookName().equalsIgnoreCase(bookName)){
				return book;
			}
		}
		return null;
	}
	/**
	 * @author alok ranjan
	 * Apr 19, 2019
	 * BookDao.java
	 * void
	 * addNewBookData
	 * @param bookSerialNo
	 * @param bookName
	 * @param bookType
	 * @param bookLanguage
	 */
	public void addNewBookData(Books book){
		if(bookList==null)
			bookList = new ArrayList<>();
		//if(book==null)
		/*book = new Books();
		book.setBookSerialNo(10001);
		book.setBookName("RD Sharma");
		book.setBookType("Mathematics");
		book.setBookLanguage("English");*/
		bookList.add(book);
		bookRepo.save(book);
		System.out.println("Book Added:--"+ bookList.get(0).getBookName());
	}

	/*public Books findAllBooks() {
		return dao.findAllBooks();
	}
	
	public void addNewBookData(){
		dao.addNewBookData(10001, "RD Sharma", "Mathematics", "English");
	}*/
}
