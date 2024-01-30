package com.sunny.oyoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class UserRecipeActivity extends AppCompatActivity {

    TextView txtNickname;
    TextView txtId;
    TextView txtContentCnt;
    TextView txtFollower;
    TextView txtFollowee;
    Button btnUpdatePrfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_recipe_all);

        txtNickname = findViewById(R.id.txtNickname);
        txtId = findViewById(R.id.txtId);
        txtContentCnt = findViewById(R.id.txtContentCnt);
        txtFollower = findViewById(R.id.txtFollower);
        txtFollowee = findViewById(R.id.txtFollowee);
        btnUpdatePrfile = findViewById(R.id.btnUpdatePrfile);

        String nickname = txtNickname.getText().toString().trim();

        getSupportActionBar().setTitle(nickname);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.arrow_back_ios);

        btnUpdatePrfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserRecipeActivity.this, UpdateUserActivity.class);
                startActivity(intent);

            }
        });




    }
}