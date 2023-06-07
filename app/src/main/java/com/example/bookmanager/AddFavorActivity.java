package com.example.bookmanager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * ⽤户在此界⾯添加书籍⾄个⼈收藏
 */
public class AddFavorActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addfavor);

        EditText bookNameEdit = findViewById(R.id.book_name_edit);
        Button queryButton = findViewById(R.id.query_button);

        ImageView bookCoverImage = findViewById(R.id.book_cover_image);
        TextView bookInfoText = findViewById(R.id.book_info_text);

        Button favorButton = findViewById(R.id.favor_button);
        // 初始时禁用收藏按钮
        favorButton.setEnabled(false);

        queryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 获取用户输入的书名
                String bookName = bookNameEdit.getText().toString();
                // 在预先存储的书库中查找相应的书籍信息
                Book book = BookList.findBookByName(bookName);
                // 判断是否找到了书籍信息
                if (book != null) {
                    bookCoverImage.setImageResource(book.id);
                    // 显示书籍信息
                    bookInfoText.setText("书名：" + book.name + "\n作者：" + book.author + "\n出版社：" + book.publisher + "\n出版年份：" + book.year);
                    // 更新当前查询到的书籍信息
                    BookList.currentBook = book;
                    // 激活收藏按钮
                    favorButton.setEnabled(true);
                } else {
                    bookCoverImage.setImageResource(0);
                    // 提示错误信息
                    bookInfoText.setText("没有找到该书籍，请重新输入");
                    // 清空当前查询到的书籍信息
                    BookList.currentBook = null;
                    // 禁用收藏按钮
                    favorButton.setEnabled(false);
                }
            }
        });


        favorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 获取当前查询到的书籍信息
                Book book = BookList.currentBook;
                // 将当前书籍添加至个人收藏
                BookList.addBookToFavorites(book);
                // 提示用户收藏成功
                Toast.makeText(AddFavorActivity.this, "已收藏" + book.name, Toast.LENGTH_SHORT).show();
            }
        });
    }


}


