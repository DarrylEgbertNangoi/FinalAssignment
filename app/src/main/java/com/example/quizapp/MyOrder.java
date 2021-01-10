package com.example.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MyOrder extends AppCompatActivity {
    String QJApelFinal = "0";
    String QAirMineralFinal = "0";
    String QJManggaFinal = "0";
    String QJAlpukatFinal = "0";

    int QuantAir = 0;
    int QuantJApel = 0;
    int QuantJMangga = 0;
    int QuantJAlpukat = 0;

    TextView textView7 = null; //Quant Air
    TextView textView8 = null; //Quant Apel
    TextView textView9 = null; //Quant Mangga
    TextView textView10 = null; //Quant Alpukat
    TextView harga;

    int TotalPriceAir=0;
    int TotalPriceApel=0;
    int TotalPriceMangga=0;
    int TotalPriceAlpukat=0;

    public String totalString;

//    Button DeleteAir = null;
//    DeleteAir = (Button)findViewById(R.id.Delete1);


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_order);

        Intent passIntent = getIntent();

        QAirMineralFinal = passIntent.getStringExtra("QAirMineralToMyOrder");
        QJApelFinal = passIntent.getStringExtra("QJApelToMyOrder");
        QJManggaFinal = passIntent.getStringExtra("QJManggaToMyOrder");
        QJAlpukatFinal = passIntent.getStringExtra("QJAlpukatToMyOrder");

        textView7 = findViewById(R.id.textView7);
        textView8 = findViewById(R.id.textView8);
        textView9 = findViewById(R.id.textView9);
        textView10 = findViewById(R.id.textView10);

        // Show Total Price per item
        TextView TotalAir = findViewById(R.id.TotalAir);
        TextView TotalApel = findViewById(R.id.TotalApel);
        TextView TotalMangga = findViewById(R.id.TotalMangga);
        TextView TotalAlpukat = findViewById(R.id.TotalAlpukat);

        harga = findViewById(R.id.harga);
        int Grandtotal=0;

        //Show quantity & Kalkulasi
        if (QAirMineralFinal != null){
            textView7.setText(QAirMineralFinal);
            QuantAir = Integer.parseInt(textView7.getText().toString());
            TotalPriceAir = QuantAir * 4000;
            String TotalPriceAirString = String.valueOf(TotalPriceAir);
            TotalAir.setText(TotalPriceAirString);
            Grandtotal += TotalPriceAir;
        }else{
            textView7.setText("0");
            QuantAir = 0;
            TotalAir.setText("0");
            Grandtotal += 0;
        }

        if (QJApelFinal != null){
            textView8.setText(QJApelFinal);
            QuantJApel = Integer.parseInt(textView8.getText().toString());
            TotalPriceApel = QuantJApel * 8000;
            String TotalPriceApelString = String.valueOf(TotalPriceApel);
            TotalApel.setText(TotalPriceApelString);
            Grandtotal += TotalPriceApel;
        }else{
            textView8.setText("0");
            QuantJApel = 0;
            TotalApel.setText("0");
            Grandtotal += 0;
        }

        if (QJManggaFinal != null){
            textView9.setText(QJManggaFinal);
            QuantJMangga = Integer.parseInt(textView9.getText().toString());
            TotalPriceMangga = QuantJMangga * 12000;
            String TotalPriceManggaString = String.valueOf(TotalPriceMangga);
            TotalMangga.setText(TotalPriceManggaString);
            Grandtotal += TotalPriceMangga;
        }else{
            textView9.setText("0");
            QuantJMangga = 0;
            TotalMangga.setText("0");
            Grandtotal += 0;
        }

        if (QJAlpukatFinal != null){
            textView10.setText(QJAlpukatFinal);
            QuantJAlpukat = Integer.parseInt(textView10.getText().toString());
            TotalPriceAlpukat = QuantJAlpukat * 15000;
            String TotalPriceAlpukatString = String.valueOf(TotalPriceAlpukat);
            TotalAlpukat.setText(TotalPriceAlpukatString);
            Grandtotal += TotalPriceAlpukat;
        }else{
            textView10.setText("0");
            QuantJAlpukat = 0;
            TotalAlpukat.setText("0");
            Grandtotal += 0;
        }

        totalString = String.valueOf(Grandtotal);
        harga.setText(totalString);
    }

        //Delete Quant
        public void onClickDeleteAirMineral(View view){
            Intent getIntent = getIntent();
            QAirMineralFinal = getIntent.getStringExtra("QAirMineralToMyOrder");
            QJApelFinal = getIntent.getStringExtra("QJApelToMyOrder");
            QJManggaFinal = getIntent.getStringExtra("QJManggaToMyOrder");
            QJAlpukatFinal = getIntent.getStringExtra("QJAlpukatToMyOrder");

            if(QuantAir != 0){
                QAirMineralFinal = "0";
                Intent intent = new Intent(this, MyOrder.class);
                intent.putExtra("QJAirMineralToMyOrder", QAirMineralFinal);
                intent.putExtra("QJApelToMyOrder", QJApelFinal);
                intent.putExtra("QJManggaToMyOrder", QJManggaFinal);
                intent.putExtra("QJAlpukatToMyOrder", QJAlpukatFinal);
                startActivity(intent);
            }else {
                Intent intent = new Intent(this, MyOrder.class);
                intent.putExtra("QJAirMineralToMyOrder", QAirMineralFinal);
                intent.putExtra("QJApelToMyOrder", QJApelFinal);
                intent.putExtra("QJManggaToMyOrder", QJManggaFinal);
                intent.putExtra("QJAlpukatToMyOrder", QJAlpukatFinal);
                startActivity(intent);
            }
        }

        public void onClickDeleteQJApel(View view){
            Intent getIntent = getIntent();
            QAirMineralFinal = getIntent.getStringExtra("QAirMineralToMyOrder");
            QJApelFinal = getIntent.getStringExtra("QJApelToMyOrder");
            QJManggaFinal = getIntent.getStringExtra("QJManggaToMyOrder");
            QJAlpukatFinal = getIntent.getStringExtra("QJAlpukatToMyOrder");

            if(QuantJApel != 0){
                QJApelFinal = "0";
                Intent intent = new Intent(this, MyOrder.class);
                intent.putExtra("QAirMineralToMyOrder", QAirMineralFinal);
                intent.putExtra("QJApelToMyOrder", QJApelFinal);
                intent.putExtra("QJManggaToMyOrder", QJManggaFinal);
                intent.putExtra("QJAlpukatToMyOrder", QJAlpukatFinal);
                startActivity(intent);
            }else{
                Intent intent = new Intent(this, MyOrder.class);
                intent.putExtra("QAirMineralToMyOrder", QAirMineralFinal);
                intent.putExtra("QJApelToMyOrder", QJApelFinal);
                intent.putExtra("QJManggaToMyOrder", QJManggaFinal);
                intent.putExtra("QJAlpukatToMyOrder", QJAlpukatFinal);
                startActivity(intent);
            }
        }

        public void onClickDeleteQJMangga(View view){
            Intent getIntent = getIntent();
            QAirMineralFinal = getIntent.getStringExtra("QAirMineralToMyOrder");
            QJApelFinal = getIntent.getStringExtra("QJApelToMyOrder");
            QJManggaFinal = getIntent.getStringExtra("QJManggaFinal");
            QJAlpukatFinal = getIntent.getStringExtra("QJAlpukatToMyOrder");

            if(QuantJMangga != 0){
                QJManggaFinal = "0";
                Intent intent = new Intent(this, MyOrder.class);
                intent.putExtra("QAirMineralToMyOrder", QAirMineralFinal);
                intent.putExtra("QJApelToMyOrder", QJApelFinal);
                intent.putExtra("QJManggaToMyOrder", QJManggaFinal);
                intent.putExtra("QJAlpukatToMyOrder", QJAlpukatFinal);
                startActivity(intent);
            }else{
                Intent intent = new Intent(this, MyOrder.class);
                intent.putExtra("QAirMineralToMyOrder", QAirMineralFinal);
                intent.putExtra("QJApelToMyOrder", QJApelFinal);
                intent.putExtra("QJManggaToMyOrder", QJManggaFinal);
                intent.putExtra("QJAlpukatToMyOrder", QJAlpukatFinal);
                startActivity(intent);
            }
        }

        public void onClickDeleteQJAlpukat(View view){
            Intent getIntent = getIntent();
            QAirMineralFinal = getIntent.getStringExtra("QAirMineralToMyOrder");
            QJApelFinal = getIntent.getStringExtra("QJApelToMyOrder");
            QJManggaFinal = getIntent.getStringExtra("QJManggaToMyOrder");
            QJAlpukatFinal = getIntent.getStringExtra("QJAlpukatToMyOrder");

            if(QuantJAlpukat != 0){
                QJAlpukatFinal = "0";
                Intent intent = new Intent(this, MyOrder.class);
                intent.putExtra("QAirMineralToMyOrder", QAirMineralFinal);
                intent.putExtra("QJApelToMyOrder", QJApelFinal);
                intent.putExtra("QJManggaToMyOrder", QJManggaFinal);
                intent.putExtra("QJAlpukatToMyOrder", QJAlpukatFinal);
                startActivity(intent);
            }else{
                Intent intent = new Intent(this, MyOrder.class);
                intent.putExtra("QAirMineralToMyOrder", QAirMineralFinal);
                intent.putExtra("QJApelToMyOrder", QJApelFinal);
                intent.putExtra("QJManggaToMyOrder", QJManggaFinal);
                intent.putExtra("QJAlpukatToMyOrder", QJAlpukatFinal);
                startActivity(intent);
            }
        }

    public void onClickPayNow(View view){
        String passAir=null;
        String passApel=null;
        String passMangga=null;
        String passAlpukat=null;

        passAir = String.valueOf(TotalPriceAir);
        passApel = String.valueOf(TotalPriceApel);
        passMangga = String.valueOf(TotalPriceMangga);
        passAlpukat = String.valueOf(TotalPriceAlpukat);

        Intent Pay = new Intent(this,OrderComplete.class);
        Pay.putExtra("QAirMineralToPayment", QAirMineralFinal);
        Pay.putExtra("QJApelToPayment", QJApelFinal);
        Pay.putExtra("QJManggaToPayment", QJManggaFinal);
        Pay.putExtra("QJAlpukatToPayment", QJAlpukatFinal);
        Pay.putExtra("TotalPriceAir", passAir);
        Pay.putExtra("TotalPriceApel", passApel);
        Pay.putExtra("TotalPriceMangga", passMangga);
        Pay.putExtra("TotalPriceAlpukat", passAlpukat);
        Pay.putExtra("totalString", totalString);
        startActivity(Pay);
    }

}