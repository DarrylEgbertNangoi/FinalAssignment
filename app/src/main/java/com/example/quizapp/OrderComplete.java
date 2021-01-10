package com.example.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class OrderComplete extends AppCompatActivity {
    String QJApelFinalComplete = "0";
    String QAirMineralFinalComplete = "0";
    String QJManggaFinalComplete = "0";
    String QJAlpukatFinalComplete = "0";

    int QuantAir = 0;
    int QuantJApel = 0;
    int QuantJMangga = 0;
    int QuantJAlpukat = 0;

    int TotalPriceAir=0;
    int TotalPriceApel=0;
    int TotalPriceMangga=0;
    int TotalPriceAlpukat=0;

    String passAir=null;
    String passApel=null;
    String passMangga=null;
    String passAlpukat=null;

    TextView textAir; //Quant Air
    TextView textApel; //Quant Apel
    TextView textMangga; //Quant Mangga
    TextView textAlpukat; //Quant Alpukat
    TextView harga;

    public String totalString;
    public int Grandtotal=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_complete);
        Intent getIntent = getIntent();

        QAirMineralFinalComplete = getIntent.getStringExtra("QAirMineralToPayment");
        QJApelFinalComplete = getIntent.getStringExtra("QJApelToPayment");
        QJManggaFinalComplete = getIntent.getStringExtra("QJManggaToPayment");
        QJAlpukatFinalComplete = getIntent.getStringExtra("QJAlpukatToPayment");

        passAir = getIntent.getStringExtra("TotalPriceAir");
        passApel = getIntent.getStringExtra("TotalPriceApel");
        passMangga = getIntent.getStringExtra("TotalPriceMangga");
        passAlpukat = getIntent.getStringExtra("TotalPriceAlpukat");

        totalString = getIntent.getStringExtra("totalString");

        TotalPriceAir = Integer.parseInt(passAir);
        TotalPriceApel = Integer.parseInt(passApel);
        TotalPriceMangga = Integer.parseInt(passMangga);
        TotalPriceAlpukat = Integer.parseInt(passAlpukat);

        textAir = findViewById(R.id.HasilAir);
        textApel = findViewById(R.id.HasilApel);
        textMangga = findViewById(R.id.HasilMangga);
        textAlpukat = findViewById(R.id.HasilAlpukat);

        harga = findViewById(R.id.textView11);


        //Show quantity & Kalkulasi
        if (QAirMineralFinalComplete != null){
            QuantAir = Integer.parseInt(QAirMineralFinalComplete);
            TotalPriceAir = QuantAir * 4000;
            String TotalPriceAirString = "Air Mineral\n                     Rp      "+ String.valueOf(TotalPriceAir);
            textAir.setText(TotalPriceAirString);
            Grandtotal += TotalPriceAir;
        }else{
            String TotalPriceAirString = "Air Mineral\n                     Rp      0";
            QuantAir = 0;
            textAir.setText(TotalPriceAirString);
            Grandtotal += 0;
        }

        if (QJApelFinalComplete != null){
            QuantJApel = Integer.parseInt(QJApelFinalComplete);
            TotalPriceApel = QuantJApel * 8000;
            String TotalPriceApelString = "Jus Apel\n                     Rp      "+ String.valueOf(TotalPriceApel);
            textApel.setText(TotalPriceApelString);
            Grandtotal += TotalPriceApel;
        }else{
            String TotalPriceApelString = "Jus Apell\n                     Rp      0";
            QuantJApel = 0;
            textApel.setText(TotalPriceApelString);
            Grandtotal += 0;
        }

        if (QJManggaFinalComplete != null){
            QuantJMangga = Integer.parseInt(QJManggaFinalComplete);
            TotalPriceMangga = QuantJMangga * 12000;
            String TotalPriceManggaString = "Jus Mangga\n                     Rp      "+ String.valueOf(TotalPriceMangga);
            textMangga.setText(TotalPriceManggaString);
            Grandtotal += TotalPriceMangga;
        }else{
            String TotalPriceManggaString = "Jus Mangga\n                     Rp      0";
            QuantJMangga = 0;
            textMangga.setText(TotalPriceManggaString);
            Grandtotal += 0;
        }

        if (QJAlpukatFinalComplete != null){
            QuantJAlpukat = Integer.parseInt(QJAlpukatFinalComplete);
            TotalPriceAlpukat = QuantJAlpukat * 15000;
            String TotalPriceAlpukatString = "Jus Alpukat\n                     Rp      "+ String.valueOf(TotalPriceAlpukat);
            textAlpukat.setText(TotalPriceAlpukatString);
            Grandtotal += TotalPriceAlpukat;
        }else{
            String TotalPriceAlpukatString = "Jus Alpukat\n                     Rp      0";
            QuantJAlpukat = 0;
            textAlpukat.setText(TotalPriceAlpukatString);
            Grandtotal += 0;
        }

        harga.setText(totalString);
    }

    public void goHome(View view){
        Intent pulang = new Intent(this,MainActivity.class);
        startActivity(pulang);
    }

}