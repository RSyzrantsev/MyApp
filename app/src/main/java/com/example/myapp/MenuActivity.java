package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MenuActivity extends AppCompatActivity {

    private View main_menu;
    private Button add_eating_button;
    private Button buttonConfirm;
    private EditText editCalories;
    private EditText editTime;
    private ImageButton ib_user;
    private ImageButton ib_settings;
    boolean toggleForm = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu_layout);
        main_menu         = findViewById(R.id.main_menu_layout);
        add_eating_button = findViewById(R.id.add_eating_button);
        ib_settings       = findViewById(R.id.ib_settings);
        ib_user           = findViewById(R.id.ib_user);
        buttonConfirm = findViewById(R.id.button_confirm3);
        editCalories = findViewById(R.id.edt_add_call);
        editTime = findViewById(R.id.edt_time);

        ConstraintLayout layout = findViewById(R.id.addFormEatView);
        layout.setVisibility(View.INVISIBLE);

    }

    @Override
    protected void onResume(){
        super.onResume();

        ib_user.setOnClickListener(view -> {
            main_menu.setAlpha(0);
            startActivity(new Intent(MenuActivity.this, UserDataActivity.class));
        });

        ib_settings.setOnClickListener(view -> {
            main_menu.setAlpha(0);
            startActivity(new Intent(MenuActivity.this, SettingsActivity.class));
        });

        add_eating_button.setOnClickListener(v -> {
            ConstraintLayout layout = findViewById(R.id.addFormEatView);

            if(!toggleForm){
                layout.setVisibility(View.VISIBLE);

            } else {
                layout.setVisibility(View.INVISIBLE);
            }

            toggleForm = !toggleForm;
        });

        buttonConfirm.setOnClickListener(view -> {
            Eating eating = new Eating();
            eating.calories = Integer.parseInt(editCalories.getText().toString());
            String[] time = editTime.getText().toString().split(" ");
            eating.hour = Integer.parseInt(time[0]);
            eating.minute = Integer.parseInt(time[1]);

            Eating.list.add(eating);
        });
    }
}
