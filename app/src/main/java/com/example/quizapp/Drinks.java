package com.example.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Drinks extends AppCompatActivity {
    String QJApel = "0";
    String QAirMineral = "0";
    String QJMangga = "0";
    String QJAlpukat = "0";

    public static final String Minuman = "Minuman";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);
        Intent passIntent = getIntent();
        QAirMineral = passIntent.getStringExtra("QAirMineral");
        QJApel = passIntent.getStringExtra("QJApel");
        QJMangga = passIntent.getStringExtra("QJMangga");
        QJAlpukat = passIntent.getStringExtra("QJAlpukat");
    }

    // ke MyOrder.java
    public void onClickMyOrder(View view){
        Intent MyOrder = new Intent(this,MyOrder.class);
        MyOrder.putExtra("QAirMineralToMyOrder", QAirMineral);
        MyOrder.putExtra("QJApelToMyOrder", QJApel);
        MyOrder.putExtra("QJManggaToMyOrder", QJMangga);
        MyOrder.putExtra("QJAlpukatToMyOrder", QJAlpukat);
        startActivity(MyOrder);
    }

    // ke ListOrder.java
    public void onClickToOrderListAirMineral(View view){
        Intent OrderList = new Intent(this,ListOrder.class);
        OrderList.putExtra("QAirMineral", QAirMineral);
        OrderList.putExtra("QJApel", QJApel);
        OrderList.putExtra("QJMangga", QJMangga);
        OrderList.putExtra("QJAlpukat", QJAlpukat);
        OrderList.putExtra(Minuman, "Air Mineral\n Rp 4000");
        startActivity(OrderList);
    }

    public void onClickToOrderListQJApel(View view){
        Intent OrderList = new Intent(this,ListOrder.class);
        OrderList.putExtra("QAirMineral", QAirMineral);
        OrderList.putExtra("QJApel", QJApel);
        OrderList.putExtra("QJMangga", QJMangga);
        OrderList.putExtra("QJAlpukat", QJAlpukat);
        OrderList.putExtra(Minuman, "Jus Apel\n Rp 8000");
        startActivity(OrderList);
    }

    public void onClickToOrderListQJMangga(View view){
        Intent OrderList = new Intent(this,ListOrder.class);
        OrderList.putExtra("QAirMineral", QAirMineral);
        OrderList.putExtra("QJApel", QJApel);
        OrderList.putExtra("QJMangga", QJMangga);
        OrderList.putExtra("QJAlpukat", QJAlpukat);
        OrderList.putExtra(Minuman, "Jus Mangga\n Rp 12000");
        startActivity(OrderList);
    }

    public void onClickToOrderListQJAlpukat(View view){
        Intent OrderList = new Intent(this,ListOrder.class);
        OrderList.putExtra("QAirMineral", QAirMineral);
        OrderList.putExtra("QJApel", QJApel);
        OrderList.putExtra("QJMangga", QJMangga);
        OrderList.putExtra("QJAlpukat", QJAlpukat);
        Intent NamaMinuman = OrderList.putExtra(Minuman, "Jus Alpukat\n Rp 15000");
        startActivity(OrderList);
    }

}