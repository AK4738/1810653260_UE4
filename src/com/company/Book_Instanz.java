package com.company;

import java.util.Date;

public class Book_Instanz {
    public static void main(String[] args) {

        Book first = new Book(223, new Date(), "My Book", "1234564");

        System.out.println("Das Buch hat " + first.getPages() + " Seiten, wurde am " + first.getRel() + " veröffentlicht und hat den Titel " + first.getTitle());
    
       /* int[] fav = new int[0];
        for (:
             ) {
       */
        }
    }

