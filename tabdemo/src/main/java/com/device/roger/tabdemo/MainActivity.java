package com.device.roger.tabdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    final static String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG,"onCreate!!");
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Toast.makeText(this, "dispatchTouchEvent is ok!", Toast.LENGTH_LONG);
        Log.i(TAG, "dispatchTouchEvent!!");

        Intent intent = null;
        intent = new Intent(this, RadioGroupTabActivity.class);
        if (intent != null) {
            startActivity(intent);
        }

        return super.dispatchTouchEvent(ev);
    }
}
