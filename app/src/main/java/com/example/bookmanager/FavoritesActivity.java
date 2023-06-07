package com.example.bookmanager;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/**
 * ⽤户在此界⾯查看已收藏的书籍
 */
public class FavoritesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        RecyclerView bookList = findViewById(R.id.book_list2);
        // 设置布局管理器为线性布局
        bookList.setLayoutManager(new LinearLayoutManager(this));
        // 设置适配器为自定义的BookAdapter
        bookList.setAdapter(new BookAdapter(BookList.favorites));
    }
}
