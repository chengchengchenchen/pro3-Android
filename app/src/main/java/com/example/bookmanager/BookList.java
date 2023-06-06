package com.example.bookmanager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookList {
    // 一个用于保存当前查询到的书籍信息的变量
    public static Book currentBook = null;
    // 一个用于保存个人收藏列表的变量
    public static List<Book> favorites = new ArrayList<>();

    // 一个用于将当前书籍添加至个人收藏的方法
    public static void addBookToFavorites(Book book) {
        if (book != null) {
            favorites.add(book);
        }
    }

    public static final Book[] books = new Book[]{
            new Book("Java编程思想", "Bruce Eckel", "机械工业出版社", 2007),
            new Book("Android开发艺术探索", "任玉刚", "电子工业出版社", 2015),
            new Book("算法导论", "Thomas H. Cormen", "机械工业出版社", 2013),
            new Book("深入理解计算机系统", "Randal E. Bryant", "机械工业出版社", 2011),
    };

    // 根据书名在预先存储的书库中查找相应的书籍信息，返回一个Book对象或null
    public static Book findBookByName(String name) {
        for (Book book : books) {
            if (book.name.equals(name)) {
                currentBook = book;
                return book;
            }
        }
        return null;
    }

    public static List<Book> getBooks() {
        return Arrays.asList(books);
    }
}
