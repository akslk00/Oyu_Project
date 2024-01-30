package com.sunny.oyoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.sunny.oyoapp.model.Follow;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class UpdateUserActivity extends AppCompatActivity {

    CircleImageView ivProfile;
    TextView txtNickname;
    TextView txtId;
    EditText editNickname;
    TextView btnDuplicateCheck;
    TextView btnIdUpdate;
    EditText editPassword;
    EditText editPasswordCheck;
    Button btnUpdateProfile;
    TextView txtDeleteUser;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_user);

        getSupportActionBar().setTitle("회원정보 관리");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.arrow_back_ios);

        ivProfile = findViewById(R.id.ivProfile);
        txtNickname = findViewById(R.id.txtNickname);
        txtId = findViewById(R.id.txtId);
        editNickname = findViewById(R.id.editNickname);
        btnDuplicateCheck = findViewById(R.id.btnDuplicateCheck);
        btnIdUpdate = findViewById(R.id.btnIdUpdate);
        editPassword = findViewById(R.id.editPassword);
        editPasswordCheck = findViewById(R.id.editPasswordCheck);
        btnUpdateProfile = findViewById(R.id.btnUpdateProfile);
        txtDeleteUser = findViewById(R.id.txtDeleteUser);
    }
}