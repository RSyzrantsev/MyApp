package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class AnalysisActivity extends AppCompatActivity {

    private View analysis_screen;
    private Button button_continue;
    private Button button_create_program;

    @Override
     protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.analysis_screen_layout);
        analysis_screen       = findViewById(R.id.analysis_screen_layout);
        button_continue       = findViewById(R.id.button_continue);
        button_create_program = findViewById(R.id.button_create_program);
    }

    @Override
    protected void onResume(){
        super.onResume();
        button_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                analysis_screen.setAlpha(0);
                startActivity(new Intent(AnalysisActivity.this, MenuActivity.class));
            }
        });

        button_create_program.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                analysis_screen.setAlpha(0);
                startActivity(new Intent(AnalysisActivity.this, WaitingActivity.class));
            }
        });
    }

    private void turnOn(){
        button_create_program.setEnabled(true);
        button_continue.setEnabled(true);

    }

    private void turnOff(){
        button_create_program.setEnabled(false);
        button_continue.setEnabled(false);
    }
}
