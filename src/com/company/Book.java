package com.company;

import java.util.Date;

public class Book {

    int pages;
    Date rel;
    String title;
    String isbn;

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setRel(Date rel){
        this.rel = rel;
    }


    public int getPages(){
        return pages;
    }

    public String getTitle(){
        return title;
    }

    public String getIsbn(){
        return isbn;
    }

    public Date getRel(){
        return rel;
    }


    public Book(int pages, Date rel, String title, String isbn)
    {
        this.pages = pages;
        this.rel = rel;
        this.title = title;
        this.isbn = isbn;
    }
}
