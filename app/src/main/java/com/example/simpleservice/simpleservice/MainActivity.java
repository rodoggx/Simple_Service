package com.example.simpleservice.simpleservice;

import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //System.out.println("We are in the onCreate of the activity");
        Log.d("TAG", "We are in the onCreate of the activity");

        Intent intent = new Intent(this, MyService.class);
        startService(intent);
    }
    @Override
    protected void onStart() {
        super.onStart();
        //System.out.println("We are in the onStart");
        Log.d("TAG", "We are in the onStart of the activity");
    }
    @Override
    protected void onResume() {
        super.onResume();
        //System.out.println("We are in the onResume");
        Log.d("TAG", "We are in the onResume of the activity");
    }
    @Override
    protected void onPause() {
        super.onPause();
        //System.out.println("We are in the onPause");
        Log.d("TAG", "We are in the onPause of the activity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("TAG", "We are in the onRestart of the activity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        //System.out.println("We are in the onStop");
        Log.d("TAG", "We are in the onStop of the activity");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        //System.out.println("We are in the onDestroy");
        Log.d("TAG", "We are in the onDestroy of the activity");
    }

    public void doMagic(View view) {
        EditText editText = (EditText) findViewById(R.id.a_main_et);
        TextView textView = (TextView) findViewById(R.id.a_main_txt);

        textView.setText(editText.getText());
    }
}