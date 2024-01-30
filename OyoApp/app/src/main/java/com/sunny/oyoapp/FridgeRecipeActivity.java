package com.sunny.oyoapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

public class FridgeRecipeActivity extends AppCompatActivity {

    ListView listView;
    EditText editMsg;
    ImageView btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fridge_recipe);

        getSupportActionBar().setTitle("냉파봇");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.arrow_back_ios);

        listView = findViewById(R.id.listView);
        editMsg = findViewById(R.id.editMsg);
        btnSend = findViewById(R.id.btnSend);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    // 눌렀을 때 새로운 액티비티
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int itemId = item.getItemId();

        if(itemId == R.id.btnScrapAt){

            Intent intent = new Intent(FridgeRecipeActivity.this, ScarpActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}