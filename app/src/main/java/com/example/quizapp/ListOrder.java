package com.example.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ListOrder extends AppCompatActivity {
    String QAirMineral = "0";
    String QJApel = "0";
    String QJMangga = "0";
    String QJAlpukat = "0";
    TextView text;
    String Nama_Minuman = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_order);

        Intent takeIntent = getIntent();

        //
        text = findViewById(R.id.TextOrderlist);
        Nama_Minuman = takeIntent.getStringExtra(Drinks.Minuman);
        text.setText(Nama_Minuman);

        QAirMineral = takeIntent.getStringExtra("QAirMineral");
        QJApel = takeIntent.getStringExtra("QJApel");
        QJMangga = takeIntent.getStringExtra("QJMangga");
        QJAlpukat = takeIntent.getStringExtra("QJAlpukat");
    }

    public void onClickToOrderMore(View view){
        Intent ToOrderMore = new Intent(this,Drinks.class);
        ToOrderMore.putExtra("QAirMineral", QAirMineral);
        ToOrderMore.putExtra("QJApel", QJApel);
        ToOrderMore.putExtra("QJMangga", QJMangga);
        ToOrderMore.putExtra("QJAlpukat", QJAlpukat);
        startActivity(ToOrderMore);
    }

    public void onClickToMyOrder(View view){
        Intent ToMyOrder = new Intent(this,MyOrder.class);
        ToMyOrder.putExtra("QAirMineralToMyOrder", QAirMineral);
        ToMyOrder.putExtra("QJApelToMyOrder", QJApel);
        ToMyOrder.putExtra("QJManggaToMyOrder", QJMangga);
        ToMyOrder.putExtra("QJAlpukatToMyOrder", QJAlpukat);
        startActivity(ToMyOrder);
    }

    public void onClickAdditem(View view){
        Intent intent = new Intent(this,ListOrder.class);
        EditText Quantity;
        Quantity = findViewById(R.id.Quantity);
        String Q = Quantity.getText().toString();

            if (Nama_Minuman.equals("Air Mineral\n Rp 4000")){
                intent.putExtra("QAirMineral", Q);
                intent.putExtra("QJApel", QJApel);
                intent.putExtra("QJMangga", QJMangga);
                intent.putExtra("QJAlpukat",QJAlpukat);
                intent.putExtra("Minuman", Nama_Minuman);
            }else if (Nama_Minuman.equals("Jus Apel\n Rp 8000")){
                intent.putExtra("QAirMineral", QAirMineral);
                intent.putExtra("QJApel", Q);
                intent.putExtra("QJMangga", QJMangga);
                intent.putExtra("QJAlpukat", QJAlpukat);
                intent.putExtra("Minuman", Nama_Minuman);
            }else if (Nama_Minuman.equals("Jus Mangga\n Rp 12000")){
                intent.putExtra("QAirMineral", QAirMineral);
                intent.putExtra("QJApel",QJApel);
                intent.putExtra("QJMangga", Q);
                intent.putExtra("QJAlpukat",QJAlpukat);
                intent.putExtra("Minuman", Nama_Minuman);
            }else if (Nama_Minuman.equals("Jus Alpukat\n Rp 15000")){
                intent.putExtra("QAirMineral",QAirMineral);
                intent.putExtra("QJApel",QJApel);
                intent.putExtra("QJMangga",QJMangga);
                intent.putExtra("QJAlpukat", Q);
                intent.putExtra("Minuman", Nama_Minuman);
            }
        startActivity(intent);
    }
}