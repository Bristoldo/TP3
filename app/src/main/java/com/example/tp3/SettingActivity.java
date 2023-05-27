package com.example.tp3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        TextView textView = findViewById(R.id.textView6);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            boolean settingsHandling = extras.getBoolean("settingsHandling");
            if (settingsHandling) {
                textView.setText("Vous vous trouvez dans les réglages.");
            }
    }
}