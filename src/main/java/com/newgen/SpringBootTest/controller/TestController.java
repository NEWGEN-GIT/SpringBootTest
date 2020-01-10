/**
Group						: Application Projects - II
Product / Project			: Test
Module						: Java File
File Name					: TestController.java
Author						: alok ranjan
Date written (DD/MM/YYYY)	: Apr 13, 2019 2:20:27 PM
Date modified (DD/MM/YYYY)	: Apr 13, 2019 2:20:27 PM
Description					: 
---------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------
CHANGE HISTORY 
---------------------------------------------------------------------------------------------
BUG ID                Date			Change By			Change Description 

---------------------------------------------------------------------------------------------
*/

package com.newgen.SpringBootTest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author alok_ranjan
 * Apr 13, 2019
 */
@RestController
public class TestController {
	@RequestMapping("/")
	public String Welcome(){
		return "Hello !! Spring Boot";
	}
}
