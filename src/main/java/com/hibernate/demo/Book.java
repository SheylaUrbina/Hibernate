package com.hibernate.demo;

public class Book {
    int id;
    String bookName;
    String bookAuthor;

    public Book(String bookName,String bookAuthor){
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
}
