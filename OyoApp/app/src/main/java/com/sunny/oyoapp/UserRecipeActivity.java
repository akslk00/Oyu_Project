package com.sunny.oyoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.sunny.oyoapp.model.Follow;

import java.util.ArrayList;

public class UserRecipeActivity extends AppCompatActivity {

    TextView txtNickname;
    TextView txtId;
    TextView txtContentCnt;
    TextView txtFollower;
    TextView txtFollowee;
    Button btnFollow;
    RecyclerView recyclerView;

    Follow follow = new Follow();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_recipe);

        txtNickname = findViewById(R.id.txtNickname);
        txtId = findViewById(R.id.txtId);
        txtContentCnt = findViewById(R.id.txtContentCnt);
        txtFollower = findViewById(R.id.txtFollower);
        txtFollowee = findViewById(R.id.txtFollowee);
        btnFollow = findViewById(R.id.btnFollow);
        recyclerView = findViewById(R.id.recyclerView);



        String nickname = txtNickname.getText().toString().trim();

        getSupportActionBar().setTitle(nickname);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.arrow_back_ios);

        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                 팔로우 처리 네트워크로 DB 가져오기..

                if(btnFollow.equals("팔로우 해제")){
                    btnFollow.setText("팔로우 하기");
                }else{
                    btnFollow.setText("팔로우 해제");

                }

            }
        });




    }
}