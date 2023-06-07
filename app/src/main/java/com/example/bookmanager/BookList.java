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
            new Book("算法导论", "Thomas H. Cormen", "机械工业出版社", 2013, R.drawable.p1),
            new Book("Java编程思想", "Bruce Eckel", "机械工业出版社", 2007, R.drawable.p2),
            new Book("离散数学及其应用", "Kenneth H.Rosen", "机械工业出版社", 2015, R.drawable.p3),
            new Book("深入理解计算机系统", "Randal E.Bryant", "机械工业出版社", 2011, R.drawable.p4),
            new Book("计算机组成与设计", "David A.Patterson", "机械工业出版社", 2011, R.drawable.p5),
            new Book("计算机系统概论", "Patt", "机械工业出版社", 2008, R.drawable.p6),
            new Book("数据库系统概念", "Henry F.Korth", "机械工业出版社", 2013, R.drawable.p7),
            new Book("数据结构与算法分析", "Mark Allen Weiss", "机械工业出版社", 2005, R.drawable.p8),
            new Book("解忧杂货铺", "东野圭吾", "南海出版社", 2014, R.drawable.p9),
            new Book("嫌疑人X的献身", "东野圭吾", "南海出版社", 2016, R.drawable.p10),
            new Book("新参者", "东野圭吾", "南海出版社", 2019, R.drawable.p11),

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
