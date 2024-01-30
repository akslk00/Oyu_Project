package com.sunny.oyoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class UpdateUserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_user);

        getSupportActionBar().setTitle("회원정보 관리");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.arrow_back_ios);
    }
}