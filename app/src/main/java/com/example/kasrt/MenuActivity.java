package com.example.kasrt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    private LinearLayout cdMenu1, cdMenu2, cdMenu3, cdMenu4, cdMenu5, cdMenu6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);

        cdMenu1 = findViewById(R.id.cdMenu1);
        cdMenu2 = findViewById(R.id.cdMenu2);
        cdMenu3 = findViewById(R.id.cdMenu3);
        cdMenu4 = findViewById(R.id.cdMenu4);
        cdMenu5 = findViewById(R.id.cdMenu5);
        cdMenu6 = findViewById(R.id.cdMenu6);

        cdMenu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        cdMenu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, LaporanActivity.class);
                startActivity(intent);
            }
        });

        cdMenu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, PengurusRTActivity.class);
                startActivity(intent);
            }
        });

        cdMenu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, KegiatanRTActivity.class);
                startActivity(intent);
            }
        });

        cdMenu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent implisit untuk membagikan informasi
                Intent shareIntent = new Intent();
                shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Bagikan informasi penting di sini!");
                shareIntent.setType("text/plain");
                startActivity(Intent.createChooser(shareIntent, "Bagikan informasi melalui"));
            }
        });

        cdMenu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, InformasiUmumActivity.class);
                startActivity(intent);
            }
        });
    }
}
