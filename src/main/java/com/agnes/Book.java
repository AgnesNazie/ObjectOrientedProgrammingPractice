package com.agnes;

public class Book {
    String title;
    String author;
    int pages;

    void bookInfo() {
        System.out.println("Title: " + title + " Author: " + author + " Pages " + pages);
    }

 public static class Info {
        public static void main(String[] args) {
            Book b1 = new Book();
            b1.title = "Mr Bing";
            b1.author = " Agnes Nazie";
            b1.pages = 12;
            b1.bookInfo();

            Book b2 = new Book();
            b2.title = "My life";
            b2.author = "M & B Key";
            b2.pages = 100;
            b2.bookInfo();

            Book b3 = new Book();
            b3.title = "My wife";
            b3.author = "Fidelis Fuche";
            b3.pages = 500;
            b3.bookInfo();




        }
    }
}



