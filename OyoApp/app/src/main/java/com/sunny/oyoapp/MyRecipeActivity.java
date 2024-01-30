package com.sunny.oyoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class MyRecipeActivity extends AppCompatActivity {

    CircleImageView ivProfile;

    TextView txtNickname;
    TextView txtId;
    TextView txtContentCnt;
    TextView txtFollower;
    TextView txtFollowee;

    Button btnUpdateProfile;

    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_recipe);

        getSupportActionBar().setTitle("나의 레시피");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.arrow_back_ios);


        ivProfile = findViewById(R.id.ivProfile);
        txtNickname = findViewById(R.id.txtNickname);
        txtId = findViewById(R.id.txtId);
        txtContentCnt = findViewById(R.id.txtContentCnt);
        txtFollower = findViewById(R.id.txtFollower);
        txtFollowee = findViewById(R.id.txtFollowee);
        btnUpdateProfile = findViewById(R.id.btnUpdateProfile);
        recyclerView = findViewById(R.id.recyclerView);

        btnUpdateProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyRecipeActivity.this, UpdateUserActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}