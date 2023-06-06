package com.example.bookmanager;

// 一个简单的Book类，用于封装书籍信息
public class Book {
    public String name; // 书名
    public String author; // 作者
    public String publisher; // 出版社
    public int year; // 出版年份

    Book(String name, String author, String publisher, int year){
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.year=year;
    }


}

