package com.example.libraryManagement;

import LibraryService.LibraryService;
import com.example.libraryManagement.model.StudentClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.libraryManagement.model.StudentClass;
import com.example.libraryManagement.LibraryResporsitory.LibraryResipory;

@SpringBootApplication
public class LibraryManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryManagementApplication.class, args);
	}

	   StudentClass student = new StudentClass(1,"Baguma",34,"male");
	   StudentClass student1 = new StudentClass(2,"Brian",33,"male");
	   StudentClass student2 = new StudentClass(3,"Baala",32,"male");
	   StudentClass student4 = new StudentClass(4,"Grace",30,"female");
	   StudentClass student5 = new StudentClass(5,"Nyangoma",29,"female");

         LibraryService libraryService = new LibraryService();




}
