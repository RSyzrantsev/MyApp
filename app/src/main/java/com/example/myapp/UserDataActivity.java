package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class UserDataActivity extends AppCompatActivity {

    private View user_screen;
    private View iv_user;
    private ImageButton ib_to_main_menu;
    private EditText editName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_screen_layout);
        editName = findViewById(R.id.edit_user_name);

        user_screen = findViewById(R.id.user_screen_layout);
        iv_user = findViewById(R.id.iv_user);
        ib_to_main_menu = findViewById(R.id.ib_to_main_menu);
    }

    @Override
    protected void onResume() {
        super.onResume();
        editName.setText(DataCollectionActivity.user.name);

        ib_to_main_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user_screen.setAlpha(0);
                startActivity(new Intent(UserDataActivity.this, MenuActivity.class));
            }
        });
    }
}
