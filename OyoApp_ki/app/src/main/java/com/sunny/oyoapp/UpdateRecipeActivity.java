package com.sunny.oyoapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class UpdateRecipeActivity extends AppCompatActivity {
    TextView txtTitle;
    EditText editTitle;
    TextView btnUploadImg;
    TextView txtImageFile;
    TextView txtIngredients;
    EditText editIngredients;
    TextView txtRecipe;
    EditText editRecipe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_recipe);

        getSupportActionBar().setTitle("레시피 수정");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.arrow_back_ios);

        txtTitle = findViewById(R.id.txtTitle);
        editTitle = findViewById(R.id.editTitle);
        btnUploadImg = findViewById(R.id.btnUploadImg);
        txtImageFile = findViewById(R.id.txtImageFile);
        txtIngredients = findViewById(R.id.txtIngredients);
        editIngredients = findViewById(R.id.editIngredients);
        txtRecipe = findViewById(R.id.txtRecipe);
        editRecipe = findViewById(R.id.editRecipe);



    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.save, menu);
        return true;
    }

    // 눌렀을 때 새로운 액티비티
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int itemId = item.getItemId();

        if(itemId == R.id.btnSave){

            // TODO: 레시피 저장하는 버튼 설정
        }

        return super.onOptionsItemSelected(item);
    }
}