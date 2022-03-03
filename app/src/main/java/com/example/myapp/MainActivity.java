package com.example.myapp;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private Button collect_data_button;
    private View mainActivityView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainActivityView    = findViewById(R.id.mainMenuLayout);
        collect_data_button = findViewById(R.id.collect_data_button);
    }

    @Override
    protected void onResume() {
        super.onResume();
        collect_data_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainActivityView.setAlpha(0);
                startActivity(new Intent(MainActivity.this, DataCollectionActivity.class));
            }
        });
    }




}