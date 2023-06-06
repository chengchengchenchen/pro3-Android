package com.example.bookmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button addFavorButton = findViewById(R.id.add_favor_button);
        Button viewLibraryButton = findViewById(R.id.view_library_button);
        Button viewFavoritesButton = findViewById(R.id.view_favorites_button);

        addFavorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 创建一个Intent对象，指定要跳转到的Activity类
                Intent intent = new Intent(MainActivity.this, AddFavorActivity.class);
                // 启动新的Activity
                startActivity(intent);
            }
        });

        viewLibraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 创建一个Intent对象，指定要跳转到的Activity类
                Intent intent = new Intent(MainActivity.this, LibraryActivity.class);
                // 启动新的Activity
                startActivity(intent);
            }
        });

        viewFavoritesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 创建一个Intent对象，指定要跳转到的Activity类
                Intent intent = new Intent(MainActivity.this, FavoritesActivity.class);
                // 启动新的Activity
                startActivity(intent);
            }
        });
    }
}