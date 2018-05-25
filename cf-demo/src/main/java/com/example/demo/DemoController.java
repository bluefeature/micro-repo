package com.example.demo;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/book")
public class DemoController {

	@Bean
	public BookService bookService() {
		return new BookService();
	}

	@RequestMapping(value = "/allbooks")
	public List<Book> greeting() {

		List<Book> response = bookService().getBookList();

		return response;
	}

}
