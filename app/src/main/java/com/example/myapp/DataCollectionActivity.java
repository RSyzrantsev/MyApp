package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class DataCollectionActivity extends AppCompatActivity {
    public static UserData user = new UserData();
    private View screen_collect;
    private Button buttonConfirm;
    private EditText editName, editAge, editHeight, editWeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_collect_layout);
        screen_collect  = findViewById(R.id.screen_collect);
        buttonConfirm = findViewById(R.id.button_confirm);
        editName = findViewById(R.id.edit_name);
        editAge = findViewById(R.id.edit_age);
        editHeight = findViewById(R.id.edit_height);
        editWeight = findViewById(R.id.edit_weight);
    }

    @Override
    protected void onResume(){
        super.onResume();
        buttonConfirm.setOnClickListener(view -> {
            user.name = editName.getText().toString();
            user.age = Integer.parseInt(editAge.getText().toString());
            user.height = Integer.parseInt(editHeight.getText().toString());
            user.weight = Integer.parseInt(editWeight.getText().toString());

            screen_collect.setAlpha(0);
            startActivity(new Intent(DataCollectionActivity.this, WaitingActivity.class));
        });
    }
}
