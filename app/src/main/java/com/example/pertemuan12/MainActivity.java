package com.example.pertemuan12;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Food> foodArrayList;
    RecyclerView food_rv;
    FoodAdapter foodAdapter;

    EditText inputNama;
    EditText inputInformation;
    EditText inputHarga;
    Button asBurger;
    Button asRoti;
    Button asMartabak;

    View.OnClickListener saveAsBurger = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String nama = inputNama.getText().toString();
            String informasi = inputInformation.getText().toString();
            String harga = inputHarga.getText().toString();
            Food food = new Food(nama, informasi, harga, R.drawable.burger);
            foodArrayList.add(food);

//            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
            foodAdapter = new FoodAdapter(foodArrayList, MainActivity.this);
//
//            food_rv.setLayoutManager(linearLayoutManager);
            food_rv.setAdapter(foodAdapter);
        }
    };

    View.OnClickListener saveAsRoti = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String nama = inputNama.getText().toString();
            String informasi = inputInformation.getText().toString();
            String harga = inputHarga.getText().toString();
            Food food = new Food(nama, informasi, harga, R.drawable.roti);
            foodArrayList.add(food);

//            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
            foodAdapter = new FoodAdapter(foodArrayList, MainActivity.this);
//
//            food_rv.setLayoutManager(linearLayoutManager);
            food_rv.setAdapter(foodAdapter);
        }
    };
    View.OnClickListener saveAsMartabak = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String nama = inputNama.getText().toString();
            String informasi = inputInformation.getText().toString();
            String harga = inputHarga.getText().toString();
            Food food = new Food(nama, informasi, harga, R.drawable.martabak);
            foodArrayList.add(food);

//            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
            foodAdapter = new FoodAdapter(foodArrayList, MainActivity.this);
//
//            food_rv.setLayoutManager(linearLayoutManager);
            food_rv.setAdapter(foodAdapter);


        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputNama = findViewById(R.id.foodNama_et);
        inputHarga = findViewById(R.id.foodPrice_et);
        inputInformation = findViewById(R.id.foodInformation_et);
        asBurger = findViewById(R.id.input_burger_bt);
        asRoti = findViewById(R.id.input_roti_bt);
        asMartabak = findViewById(R.id.input_martabak_bt);
        food_rv = findViewById(R.id.foodList_rv);

        asMartabak.setOnClickListener(saveAsMartabak);
        asRoti.setOnClickListener(saveAsRoti);
        asBurger.setOnClickListener(saveAsBurger);

        foodArrayList = new ArrayList<>();

//        Food food = new Food("A", "A", "Rp. NULL", R.drawable.martabak);
//        foodArrayList.add(food);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
        foodAdapter = new FoodAdapter(foodArrayList, MainActivity.this);

        food_rv.setLayoutManager(linearLayoutManager);
        food_rv.setAdapter(foodAdapter);

    }
}