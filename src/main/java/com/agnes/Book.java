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
            Book bi = new Book();
            bi.title = "Mr Bing";
            bi.author = " Agnes Nazie";
            bi.pages = 12;
            bi.bookInfo();


        }
    }
}



