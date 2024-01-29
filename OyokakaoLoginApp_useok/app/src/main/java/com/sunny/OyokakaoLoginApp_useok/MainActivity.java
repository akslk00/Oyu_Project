package com.sunny.oyoapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.sunny.oyoapp.config.Config;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MainActivity extends AppCompatActivity {

    LinearLayout btnHome;
    LinearLayout btnChat;
    LinearLayout btnScrap;
    LinearLayout btnMenu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHome = findViewById(R.id.btnHome);
        btnChat = findViewById(R.id.btnChat);
        btnScrap = findViewById(R.id.btnScrap);
        btnMenu = findViewById(R.id.btnMenu);

//        Log.d("getKeyHash", "" + getKeyHash(MainActivity.this));


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

//        SharedPreferences sp = getSharedPreferences(Config.PREFERENCE_NAME,MODE_PRIVATE);
//        String token = sp.getString("token","");
//
//        if(token.isEmpty()){
//            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
//            startActivity(intent);
//            finish();
//            return;
//        }


    }

//    카카오 로그인 API 키 해시값 알아내는 코드

//    public static String getKeyHash(final Context context) {
//        PackageManager pm = context.getPackageManager();
//        try {
//            PackageInfo packageInfo = pm.getPackageInfo(context.getPackageName(), PackageManager.GET_SIGNATURES);
//            if (packageInfo == null)
//                return null;
//
//            for (Signature signature : packageInfo.signatures) {
//                try {
//                    MessageDigest md = MessageDigest.getInstance("SHA");
//                    md.update(signature.toByteArray());
//                    return android.util.Base64.encodeToString(md.digest(), android.util.Base64.NO_WRAP);
//                } catch (NoSuchAlgorithmException e) {
//                    e.printStackTrace();
//                }
//            }
//        } catch (PackageManager.NameNotFoundException e) {
//            e.printStackTrace();
//        }
//        return null;
//
//    }


}