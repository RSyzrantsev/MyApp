package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class UserDataActivity extends AppCompatActivity {

    private View user_screen;
    private ImageView iv_user;
    private ImageButton ib_to_main_menu;
    private EditText editName;
    private EditText editAge;
    private EditText editHeight;
    private EditText editWeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_screen_layout);
        editName = findViewById(R.id.edit_user_name);
        editAge = findViewById(R.id.edit_user_age);
        editHeight = findViewById(R.id.edit_user_height);
        editWeight = findViewById(R.id.edit_user_weight);

        user_screen = findViewById(R.id.user_screen_layout);
        iv_user = findViewById(R.id.iv_user);
        ib_to_main_menu = findViewById(R.id.ib_to_main_menu);
    }

    @Override
    protected void onResume() {
        super.onResume();
        editName.setText(DataCollectionActivity.user.name);
        editWeight.setText(String.valueOf(DataCollectionActivity.user.weight));
        editHeight.setText(String.valueOf(DataCollectionActivity.user.height));
        editAge.setText(String.valueOf(DataCollectionActivity.user.age));

        ib_to_main_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user_screen.setAlpha(0);
                startActivity(new Intent(UserDataActivity.this, MenuActivity.class));
            }
        });
    }
}
