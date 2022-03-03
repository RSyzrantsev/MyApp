package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class ScreenCollect extends AppCompatActivity {

    private View screen_collect;
    private Button button_Confirm1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_collect_layout);
        screen_collect  = findViewById(R.id.screen_collect);
        button_Confirm1 = findViewById(R.id.button_confirm1);
    }

    @Override
    protected void onResume(){
        super.onResume();
        button_Confirm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Handler().postDelayed(() ->{
                    screen_collect.setAlpha(0);
                    startActivity(new Intent(ScreenCollect.this, StandbyScreen.class));
                }, 1000);

            }
        });
    }
}
