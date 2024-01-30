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
import android.widget.Spinner;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class UserRecipeAllActivity extends AppCompatActivity {

    Spinner spinnerRecipe;
    String[] items = {"최신순","오래된 순","별점순"};

    FloatingActionButton btnAdd;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_recipe_all);


        getSupportActionBar().setTitle("회원님들의 레시피");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.arrow_back_ios);

        spinnerRecipe = findViewById(R.id.spinnerRecipe);
        btnAdd = findViewById(R.id.btnAdd);
        recyclerView = findViewById(R.id.recyclerVeiw);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item,items);
        adapter.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);
        spinnerRecipe.setAdapter(adapter);

        spinnerRecipe.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = items[position]; // 선택된 아이템 가져오기

                // 선택된 아이템에 따라 조건문 추가
                if ("최신순".equals(selectedItem)) {
                    // 최신순에 대한 이벤트 처리
                    // 예: 최신순 정렬 로직 수행
                    // updateRecyclerView("최신순");
                } else if ("오래된 순".equals(selectedItem)) {
                    // 오래된 순에 대한 이벤트 처리
                    // 예: 오래된 순 정렬 로직 수행
                    // updateRecyclerView("오래된 순");
                } else if ("별점순".equals(selectedItem)) {
                    // 별점순에 대한 이벤트 처리
                    // 예: 별점순 정렬 로직 수행
                    // updateRecyclerView("별점순");
                }

                // 추가적으로 필요한 작업을 수행할 수 있습니다.


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // 아무것도 선택되지 않았을 때의 처리

            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: 저장 액티비티로 넘어가서 저장한 데이터 다시 양방향 데이터로 받아 와야함.

                Intent intent = new Intent(UserRecipeAllActivity.this, AddRecipeActivity.class);
                startActivity(intent);
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

            Intent intent = new Intent(UserRecipeAllActivity.this, ScarpActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}