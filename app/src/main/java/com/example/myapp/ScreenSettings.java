package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.annotation.Nullable;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ScreenSettings extends AppCompatActivity {

    private View screen_settings;
    private TextView txt_settings_soon;
    private ImageButton ib_to_main_menu2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_settings_layout);
        screen_settings   = findViewById(R.id.screen_settings_layout);
        txt_settings_soon = findViewById(R.id.txt_settings_soon);
        ib_to_main_menu2 = findViewById(R.id.ib_to_main_menu2);

    }

    @Override
    protected void onResume() {
        super.onResume();
        ib_to_main_menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Handler().postDelayed(() ->{
                    screen_settings.setAlpha(0);
                    startActivity(new Intent(ScreenSettings.this, MainMenu.class));
                }, 1000);
            }
        });
    }
    }
