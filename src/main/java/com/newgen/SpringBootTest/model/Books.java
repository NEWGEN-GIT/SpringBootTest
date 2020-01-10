/**
Group						: Application Projects - II
Product / Project			: Test
Module						: Java File
File Name					: Books.java
Author						: alok ranjan
Date written (DD/MM/YYYY)	: Apr 19, 2019 12:08:40 PM
Date modified (DD/MM/YYYY)	: Apr 19, 2019 12:08:40 PM
Description					: 
---------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------
CHANGE HISTORY 
---------------------------------------------------------------------------------------------
BUG ID                Date			Change By			Change Description 

---------------------------------------------------------------------------------------------
*/

package com.newgen.SpringBootTest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * @author alok_ranjan Apr 19, 2019
 */
@Entity
@Table(name = "Books", uniqueConstraints = { @UniqueConstraint(columnNames = "bookSerialId") })
public class Books {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bookSerialId", nullable = false, unique = true, length = 11)
	private long bookSerialNo;

	@Column(name = "BookName")
	private String bookName;

	@Column(name = "BookType")
	private String bookType;

	@Column(name = "BookLanguage")
	private String bookLanguage;

	/**
	 * 
	 */
	public Books() {
		
	}

	/**
	 * 
	 */
	public Books(long bookSerialNo, String bookName, String bookType, String bookLanguage) {
		this.bookSerialNo = bookSerialNo;
		this.bookName = bookName;
		this.bookType = bookType;
		this.bookLanguage = bookLanguage;
	}

	/**
	 * @return the bookSerialNo
	 */
	public long getBookSerialNo() {
		return bookSerialNo;
	}

	/**
	 * @param bookSerialNo
	 *            the bookSerialNo to set
	 */
	public void setBookSerialNo(long bookSerialNo) {
		this.bookSerialNo = bookSerialNo;
	}

	/**
	 * @return the bookName
	 */
	public String getBookName() {
		return bookName;
	}

	/**
	 * @param bookName
	 *            the bookName to set
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	/**
	 * @return the bookType
	 */
	public String getBookType() {
		return bookType;
	}

	/**
	 * @param bookType
	 *            the bookType to set
	 */
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	/**
	 * @return the bookLanguage
	 */
	public String getBookLanguage() {
		return bookLanguage;
	}

	/**
	 * @param bookLanguage
	 *            the bookLanguage to set
	 */
	public void setBookLanguage(String bookLanguage) {
		this.bookLanguage = bookLanguage;
	}

}
