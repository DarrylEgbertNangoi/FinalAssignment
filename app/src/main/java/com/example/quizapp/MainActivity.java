package com.example.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    String QJApel = "0";
    String QAirMineral = "0";
    String QJMangga = "0";
    String QJAlpukat = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickDrinks(View view){
        Intent DrinkIntent = new Intent(this,Drinks.class);
        startActivity(DrinkIntent);
    }

    public void onClickMyOrder(View view){
        Intent MyOrderIntent = new Intent(this,MyOrder.class);
        MyOrderIntent.putExtra("QAirMineralToMyOrder", "0");
        MyOrderIntent.putExtra("QJApelToMyOrder", "0");
        MyOrderIntent.putExtra("QJManggaToMyOrder", "0");
        MyOrderIntent.putExtra("QJAlpukatToMyOrder", "0");
        startActivity(MyOrderIntent);
    }


}