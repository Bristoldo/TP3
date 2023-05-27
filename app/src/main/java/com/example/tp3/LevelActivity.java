package com.example.tp3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.TestLooperManager;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;

import org.w3c.dom.Text;

public class LevelActivity extends AppCompatActivity {
    TextView textViewLevel;
    TextView textViewCreate;
    static int nbCreate = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
        nbCreate++;
        Intent intent = getIntent();
        int level = intent.getIntExtra(MainActivity.EXTRA_LEVEL,1);
        startActivityForResult(intent, NUMBER_OF_LAUNCHES_REQUEST);
         textViewLevel = (TextView)  findViewById(R.id.textView5);
         textViewCreate = (TextView) findViewById(R.id.textView7);
         textViewLevel.setText("Level: " String.valueOf(level));
        textViewCreate.setText(nbCreate + "  fois ouvert");
    }





    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("La methode onStart() a ete appele dans la classe LevelActivity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("La methode onResume() a ete appele dans la classe LevelActivity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("La methode onRestart() a ete appele dans la classe LevelActivity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("La methode onPause() a ete appele dans la classe LevelActivity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("La methode onStop() a ete appele dans la classe LevelActivity");
    }

        @Override
        protected void onDestroy() {
            super.onDestroy();
            System.out.println("La methode onDelete() a ete appele dans la classe LevelActivity");
        }


        @Override
        public void finish() {
            Intent data = new Intent();
            data.putExtra("numberOfLaunches", NUMBER_OF_LAUNCHES_REQUEST);
            setResult(RESULT_OK, data);
            super.finish();

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

}