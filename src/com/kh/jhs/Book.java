package com.kh.jhs;

public class Book {

	private int bookNum;
	private String bookName;
	private String author;
	private String genre;
	private String stockedDate;
	
	public Book() {
		
	}
//	public Book(String bookName) {
//		this.bookName = bookName;
//	}
//	public Book(String bookName, String author) {
//		this.bookName = bookName;
//		this.author = author;
//	}
//	public Book(String bookName, String author, String genre) {
//		this.bookName = bookName;
//		this.author = author;
//		this.genre = genre;
//	}
//	public Book(String bookName, String author, String genre, String stockedDate) {
//		this.bookName = bookName;
//		this.author = author;
//		this.genre = genre;
//		this.stockedDate = stockedDate;
//	}
	
	public int getBookNum() {
		return bookNum;
	}
	public String getBookName() {
		return bookName;
	}
	public String getAuthor() {
		return author;
	}
	public String getGenre() {
		return genre;
	}
	public String getStockedDate() {
		return stockedDate;
	}
	
	
	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public void setStockedDate(String stockedDate) {
		this.stockedDate = stockedDate;
	}
	
	
	
	
	
}
