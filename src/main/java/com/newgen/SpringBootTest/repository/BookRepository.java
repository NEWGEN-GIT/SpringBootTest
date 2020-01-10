/**
Group						: Application Projects - II
Product / Project			: Test
Module						: Java File
File Name					: BookRepository.java
Author						: alok ranjan
Date written (DD/MM/YYYY)	: Apr 19, 2019 4:49:53 PM
Date modified (DD/MM/YYYY)	: Apr 19, 2019 4:49:53 PM
Description					: 
---------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------
CHANGE HISTORY 
---------------------------------------------------------------------------------------------
BUG ID                Date			Change By			Change Description 

---------------------------------------------------------------------------------------------
*/

package com.newgen.SpringBootTest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.newgen.SpringBootTest.model.Books;

/**
 * @author alok_ranjan
 * Apr 19, 2019
 */
@Repository
public interface BookRepository extends CrudRepository<Books, Long>{
	/*Books findAllBooks();
	Books findByBookType(String bookType);
	Books findBookDetails(String bookName);*/
	Books findBybookSerialNo(long serialNo);
	//void addNewBookData();
}
