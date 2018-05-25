package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class BookService {
	
	List<Book> list = new ArrayList<Book>();
	public List<Book> getBookList(){
		Book book = new Book("World Peace",1990);
		Book book2 = new Book("Hope",1985);
		Book book3 = new Book("Fulfillmet",2018);
		
		list.add(book);
		list.add(book2);
		list.add(book3);
		return list;
	}

}
