package com.sunny.oyoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.kakao.sdk.auth.model.OAuthToken;
import com.kakao.sdk.user.UserApiClient;
import com.kakao.sdk.user.model.User;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public class LoginActivity extends AppCompatActivity {

    TextView txtLogin;

    EditText editEmail;
    EditText editPassword;
    Button btnLogin;
    Button btnNaverLogin;
    Button btnKakaoLogin;
    Button btnGoogleLogin;
    Button btnRegister;

//    카카오 로그인 API
    private static final String TAG = "LoginActivity";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();

        txtLogin = findViewById(R.id.txtLogin);
        editEmail = findViewById(R.id.editEmail);
        editPassword = findViewById(R.id.editPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnNaverLogin = findViewById(R.id.btnNaverLogin);
        btnKakaoLogin = findViewById(R.id.btnKakaoLogin);
        btnGoogleLogin = findViewById(R.id.btnGoogleLogin);
        btnRegister = findViewById(R.id.btnRegister);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

        // 카카오가 설치되어 있는지 확인 하는 메서드또한 카카오에서 제공 콜백 객체를 이용함
        Function2<OAuthToken, Throwable, Unit> callback = new  Function2<OAuthToken, Throwable, Unit>() {
            @Override
            public Unit invoke(OAuthToken oAuthToken, Throwable throwable) {
                // 이때 토큰이 전달이 되면 로그인이 성공한 것이고 토큰이 전달되지 않았다면 로그인 실패
                if(oAuthToken != null) {
                    // 로그인 성공 시 MainActivity로 화면 전환
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish(); // 현재 LoginActivity 종료

                }
                if (throwable != null) {
                    // 로그인 실패 처리
                    Log.e(TAG, "Kakao login failed", throwable);
                    // 실패에 대한 처리 로직 추가

                }
//                updateKakaoLoginUi();
                return null;
            }
        };
        btnKakaoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(UserApiClient.getInstance().isKakaoTalkLoginAvailable(LoginActivity.this)) {
                    UserApiClient.getInstance().loginWithKakaoTalk(LoginActivity.this, callback);
                }else {
                    UserApiClient.getInstance().loginWithKakaoAccount(LoginActivity.this, callback);
                }

            }
        });
    }

    private  void updateKakaoLoginUi(){
        UserApiClient.getInstance().me(new Function2<User, Throwable, Unit>() {
            @Override
            public Unit invoke(User user, Throwable throwable) {
                // 로그인이 되어있으면
                if (user!=null){

                    // 유저의 아이디
                    Log.d(TAG,"invoke: id" + user.getId());
                    // 유저의 어카운트정보에 이메일
                    Log.d(TAG,"invoke: nickname" + user.getKakaoAccount().getEmail());
                    // 유저의 어카운트 정보의 프로파일에 닉네임
                    Log.d(TAG,"invoke: email" + user.getKakaoAccount().getProfile().getNickname());
                    // 유저의 어카운트 파일의 성별
                    Log.d(TAG,"invoke: gerder" + user.getKakaoAccount().getGender());
                    // 유저의 어카운트 정보에 나이
                    Log.d(TAG,"invoke: age" + user.getKakaoAccount().getAgeRange());

//                    nickName.setText(user.getKakaoAccount().getProfile().getNickname());
//
//                    Glide.with(profileImage).load(user.getKakaoAccount().
//                            getProfile().getProfileImageUrl()).circleCrop().into(profileImage);
                    btnKakaoLogin.setVisibility(View.GONE);
//                    logoutButton.setVisibility(View.VISIBLE);
                }else {
                    // 로그인이 되어 있지 않다면 위와 반대로
//                    nickName.setText(null);
//                    profileImage.setImageBitmap(null);
                    btnKakaoLogin.setVisibility(View.VISIBLE);
//                    logoutButton.setVisibility(View.GONE);
                }
                return null;
            }
        });
    }

}