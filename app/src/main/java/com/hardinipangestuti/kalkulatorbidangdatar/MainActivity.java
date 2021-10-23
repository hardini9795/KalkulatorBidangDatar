package com.hardinipangestuti.kalkulator;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}

    Button Lingkaran = (Button) findViewById(R.id.lingkaran);

        Lingkaran.setOnClickListener(new View.OnClickListener() {

        public void onClick(View) {
                Intent lingkaran = new Intent(MainActivity.this, lingkaran.class);
        startActivity(lingkaran);
            });
        Button persegipanjang = (Button) findViewById(R.id.persegipanjang);

        persegipanjang.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view){
                Intent persegipanjang = new Intent(MainActivity.this, persegipanjang.class);
                startActivity(persegipanjang);
            });

            Button segitiga = (Button) findViewById(R.id.segitiga);

        segitiga.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    Intent segitiga = new Intent(MainActivity.this, segitiga.class);
                    startActivity(segitiga);
                }
            });
            Button persegi = (Button) findViewById(R.id.persegi);

        persegi.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    Intent persegi = new Intent(MainActivity.this, persegi.class);
                    startActivity(persegi);
                }
            });

        }
        public void keluar(View view){
            System.exit(0);
        }
    }