package com.athuiru.exer.book;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book();
        book.setBookName("哈喽！Java");
        book.setAuthor("hr");
        book.setPrice(30);
        System.out.println(book.showInfo());
    }
}
