package com.sunny.oyoapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecipeActivity extends AppCompatActivity {

    CircleImageView ivProfile;
    TextView txtNickname;
    TextView txtDate;
    TextView txtRecipeTitle;
    TextView txtRating;
    ImageView imageRecipe;
    TextView txtIngredients;
    TextView txtIngredientsView;
    TextView txtRecipe;
    TextView txtRecipeView;
    TextView txtComment;

    RecyclerView recyclerView;

    Spinner spinnerComment;
    EditText editComment;
    ImageView btnSend;

    Double[] items = {0.0,1.0,2.0,3.0,4.0,5.0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        ivProfile = findViewById(R.id.ivProfile);
        txtNickname = findViewById(R.id.txtNickname);
        txtDate = findViewById(R.id.txtDate);
        txtRecipeTitle = findViewById(R.id.txtRecipeTitle);
        txtRating = findViewById(R.id.txtRating);
        imageRecipe = findViewById(R.id.imageRecipe);
        txtIngredients = findViewById(R.id.txtIngredients);
        txtIngredientsView = findViewById(R.id.txtIngredientsView);
        txtRecipe = findViewById(R.id.txtRecipe);
        txtRecipeView = findViewById(R.id.txtRecipeView);
        txtComment = findViewById(R.id.txtComment);
        spinnerComment = findViewById(R.id.spinnerComment);
        editComment = findViewById(R.id.editComment);
        btnSend = findViewById(R.id.btnSend);

        recyclerView = findViewById(R.id.recyclerView);


        String recipeTitle = txtRecipeTitle.getText().toString().trim();

        getSupportActionBar().setTitle(recipeTitle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.arrow_back_ios);

        ArrayAdapter<Double> adapter = new ArrayAdapter<Double>(
                this, android.R.layout.simple_spinner_item,items);
        adapter.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);
        spinnerComment.setAdapter(adapter);

        spinnerComment.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


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

            Intent intent = new Intent(RecipeActivity.this, ScarpActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}