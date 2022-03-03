package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class WaitingActivity extends AppCompatActivity {
    private View standby_screen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.standby_screen_layout);
        standby_screen = findViewById(R.id.standby_screen);
    }

    @Override
    protected void onResume() {
        super.onResume();
        standby_screen.setAlpha(0);
        startActivity(new Intent(WaitingActivity.this, AnalysisActivity.class));
    }
}
