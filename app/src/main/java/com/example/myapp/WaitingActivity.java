package com.example.myapp;


import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.TimeUnit;

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
//        new Handler().postDelayed(() -> {
//            WaitingActivity.setAlpha(0);
//            startActivity(new Intent(WaitingActivity.this, AnalysisActivity.class));
//        }, 3000);

        AsyncTask.execute(() -> {
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }

            runOnUiThread(() -> {
                startActivity(new Intent(WaitingActivity.this, AnalysisActivity.class));
            });

        });

//         standby_screen.setAlpha(0);
    }
}
