package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    private View main_menu;
    private Button add_eating_button;
    private ImageButton ib_user;
    private ImageButton ib_settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu_layout);
        main_menu         = findViewById(R.id.main_menu_layout);
        add_eating_button = findViewById(R.id.add_eating_button);
        ib_settings       = findViewById(R.id.ib_settings);
        ib_user           = findViewById(R.id.ib_user);

    }

    @Override
    protected void onResume(){
        super.onResume();
        ib_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                main_menu.setAlpha(0);
                startActivity(new Intent(MenuActivity.this, UserDataActivity.class));
            }
        });

        ib_settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                main_menu.setAlpha(0);
                startActivity(new Intent(MenuActivity.this, SettingsActivity.class));
            }
        });
    }
}
