package com.example.bookmanager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder> {

    // 一个用于保存要显示的书籍列表的变量
    private List<Book> books;

    // 构造方法，接收一个书籍列表作为参数
    public BookAdapter(List<Book> books) {
        this.books = books;
    }

    // 创建ViewHolder对象，并返回
    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // 从布局文件中加载一个View对象，用于创建ViewHolder对象
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.book_item, parent, false);
        // 创建并返回ViewHolder对象
        return new BookViewHolder(view);
    }

    // 绑定ViewHolder对象，并为其设置数据和视图
    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
        // 获取当前位置对应的书籍对象
        Book book = books.get(position);
        // 为ViewHolder对象中的控件设置数据和视图
        holder.bookNameText.setText(book.name);
        holder.bookAuthorText.setText(book.author);
        holder.bookPublisherText.setText(book.publisher);
        holder.bookYearText.setText(String.valueOf(book.year));
    }

    // 返回要显示的书籍数量
    @Override
    public int getItemCount() {
        return books.size();
    }

    // 定义一个内部类，继承自RecyclerView.ViewHolder，用于封装每个条目的视图和数据
    public static class BookViewHolder extends RecyclerView.ViewHolder {

        // 定义每个条目中需要用到的控件对象
        public TextView bookNameText;
        public TextView bookAuthorText;
        public TextView bookPublisherText;
        public TextView bookYearText;


        // 构造方法，接收一个View对象作为参数，并为控件对象赋值
        public BookViewHolder(@NonNull View itemView) {
            super(itemView);
            bookNameText = itemView.findViewById(R.id.book_name_text);
            bookAuthorText = itemView.findViewById(R.id.book_author_text);
            bookPublisherText = itemView.findViewById(R.id.book_publisher_text);
            bookYearText = itemView.findViewById(R.id.book_year_text);
        }
    }
}
