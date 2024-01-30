package com.sunny.oyoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.sunny.oyoapp.config.Config;

public class MainActivity extends AppCompatActivity {

    LinearLayout btnHome;
    LinearLayout btnChat;
    LinearLayout btnScrap;
    LinearLayout btnMenu;

    Button btnAi;
    Button btnAi2;

    TextView btnMoreRecipe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHome = findViewById(R.id.btnScrapAt);
        btnChat = findViewById(R.id.btnChat);
        btnScrap = findViewById(R.id.btnScrap);
        btnMenu = findViewById(R.id.btnMenu);
        btnAi = findViewById(R.id.btnAi);
        btnAi2 = findViewById(R.id.btnAi2);
        btnMoreRecipe = findViewById(R.id.btnMoreRecipe);

        btnAi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChatbotActivity.class);
                startActivity(intent);
            }
        });

        btnAi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FridgeRecipeActivity.class);
                startActivity(intent);
            }
        });

        btnMoreRecipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, UserRecipeAllActivity.class);
                startActivity(intent);

            }
        });



        btnChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ChatbotActivity.class);
                startActivity(intent);

            }
        });

        btnScrap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ScarpActivity.class);
                startActivity(intent);

            }
        });

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(intent);

            }
        });




        getSupportActionBar().hide();


        // TODO:토큰 생기면 그때 진행.

        SharedPreferences sp = getSharedPreferences(Config.PREFERENCE_NAME,MODE_PRIVATE);
        String token = sp.getString("token","");

        if(token.isEmpty()){
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
            return;
        }


    }


}