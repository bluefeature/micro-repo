package com.example.demo;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize
public class Book {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2815270422985235980L;
	String title;

	public void setTitle(String title) {
		this.title = title;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public int getYear() {
		return year;
	}

	int year;

	public Book(String title, int year) {
		this.title = title;
		this.year = year;
	}

}
