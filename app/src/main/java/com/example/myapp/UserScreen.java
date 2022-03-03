package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class UserScreen extends AppCompatActivity {

    private View user_srcreen;
    private View iv_user;
    private ImageButton ib_to_main_menu;
    private EditText edt_user_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_screen_layout);
        user_srcreen    = findViewById(R.id.user_screen_layout);
        iv_user         = findViewById(R.id.iv_user);
        ib_to_main_menu = findViewById(R.id.ib_to_main_menu);
        edt_user_name   = findViewById(R.id.edt_user_name);
    }

    @Override
    protected void onResume() {
        super.onResume();
        ib_to_main_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Handler().postDelayed(() ->{
                    user_srcreen.setAlpha(0);
                    startActivity(new Intent(UserScreen.this, MainMenu.class));
                }, 1000);
            }
        });
    }
}
