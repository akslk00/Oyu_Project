package com.sunny.oyoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class UserRecipeActivity extends AppCompatActivity {

    TextView txtNickname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_recipe_all);

        txtNickname = findViewById(R.id.txtNickname);

        String nickname = txtNickname.getText().toString().trim();



        getSupportActionBar().setTitle(nickname);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.arrow_back_ios);


    }
}