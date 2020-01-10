/**
Group						: Application Projects - II
Product / Project			: Test
Module						: Java File
File Name					: BooksController.java
Author						: alok ranjan
Date written (DD/MM/YYYY)	: Apr 19, 2019 12:31:18 PM
Date modified (DD/MM/YYYY)	: Apr 19, 2019 12:31:18 PM
Description					: 
---------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------
CHANGE HISTORY 
---------------------------------------------------------------------------------------------
BUG ID                Date			Change By			Change Description 

---------------------------------------------------------------------------------------------
*/

package com.newgen.SpringBootTest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newgen.SpringBootTest.model.Books;
import com.newgen.SpringBootTest.service.BooksService;

/**
 * @author alok_ranjan Apr 19, 2019
 */
@RestController
@RequestMapping("/books/")
public class BooksController {
	@Autowired
	private BooksService bservice;

	@RequestMapping("addbook")
	public void addBooks(@RequestBody Books book) {
		bservice.addNewBookData(book);
	}

	@RequestMapping("all")
	public List<Books> findAllBooks() {
		return bservice.findAllBooks();
	}
	@RequestMapping("type/{type}")
	public Books findByBookType(@PathVariable("type") String type){
		return bservice.findByBookType(type);
	}
}
