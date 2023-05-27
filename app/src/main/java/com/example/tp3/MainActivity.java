package com.example.tp3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;



public class MainActivity extends AppCompatActivity {
     TextView sCRTextView;
     TextView lVLTextView;

     final static String EXTRA_LEVEL = "EXTRA_LEVEL";
      final  static  NUMBER_OF_LAUNCHES_REQUEST;

     int score = 0;
     int level = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sCRTextView = (TextView) findViewById(R.id.textView4);
        lVLTextView = (TextView) findViewById(R.id.textView3);


    }
            public void updateUI(View view) {
                score++;
                if (score % 5 == 0) {
                    level++;

                    Intent intent = new Intent(this, LevelActivity.class);
                    intent.putExtra(EXTRA_LEVEL, level);
                    startActivityForResult(intent, NUMBER_OF_LAUNCHES_REQUEST);

                }
            sCRTextView.setText("" + score);
            lVLTextView.setText("" + level);
            }
            public void init(View view) {
            score = 0;
            level = 1;
            sCRTextView.setText("" + score);
            lVLTextView.setText("" + level);
            }


    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("La methode onStart() a ete appele dans la classe MainActivity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("La methode onResume() a ete appele dans la classe MainActivity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("La methode onRestart() a ete appele dans la classe MainActivity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("La methode onPause() a ete appele dans la classe MainActivity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("La methode onStop() a ete appele dans la classe MainActivity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("La methode onStart() a ete appele dans la classe MainActivity");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == NUMBER_OF_LAUNCHES_REQUEST && resultCode == RESULT_OK) {
            int launches = data.getIntExtra(EXTRA_LAUNCHES, 0);
            lnumberV.setText(launches + "");
        }
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                Intent intent = new Intent(this, SettingActivity.class);
                intent.putExtra("settingsHandling", true);
                startActivityForResult(intent, REQUEST_SETTINGS);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

