package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Book_Instanz {
    public static void main(String[] args) {

        Book first = new Book(223, new Date(), "My Book", "1234564");

        System.out.println("Das Buch hat " + first.getPages() + " Seiten, wurde am " + first.getRel() + " veröffentlicht und hat den Titel " + first.getTitle());

        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(50,new Date(), "My book 1 ", "4562-2315-646"));
        bookList.add(new Book(48,new Date(), "My book 2 ", "4562-2315-545"));
        bookList.add(new Book(50,new Date(), "My book 3 ", "4562-4515-646"));
        bookList.add(new Book(50,new Date(), "My book 4 ", "7852-2315-646"));
        bookList.add(new Book(50,new Date(), "My book 5 ", "4562-4555-646"));

        for (Book book:bookList)
        {
            System.out.println(book.getTitle() + " hat " + book.getPages() + " Seiten und folgende ISBN: " + book.getIsbn());
        }

        }
    }

