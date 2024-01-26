package com.sunny.oyoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    TextView btnChatbot;
    TextView btnFridgeRecipe;
    TextView btnYoutube;
    TextView btnThem;
    TextView btnUserRecipe;
    TextView btnMyRecipe;
    TextView btnUserInfo;
    TextView btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        getSupportActionBar().setTitle("전체 메뉴");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.arrow_back_ios);

        btnChatbot = findViewById(R.id.btnChatbot);
        btnFridgeRecipe = findViewById(R.id.btnFridgeRecipe);
        btnYoutube = findViewById(R.id.btnYoutube);
        btnThem = findViewById(R.id.btnThem);
        btnUserRecipe = findViewById(R.id.btnUserRecipe);
        btnMyRecipe = findViewById(R.id.btnMyRecipe);
        btnUserInfo = findViewById(R.id.btnUserInfo);
        btnLogout = findViewById(R.id.btnLogout);

        btnChatbot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, ChatbotActivity.class);
                startActivity(intent);
            }
        });

        btnFridgeRecipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, FridgeRecipeActivity.class);
                startActivity(intent);
            }
        });

        btnYoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, YoutubeActivity.class);
                startActivity(intent);
            }
        });

        btnUserRecipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, UserRecipeActivity.class);
                startActivity(intent);
            }
        });
    }
}