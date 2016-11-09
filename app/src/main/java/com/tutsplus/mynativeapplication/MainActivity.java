package com.tutsplus.mynativeapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "NATIVE_APP";

    static {
        System.loadLibrary("native-lib");
    }

    private native String calculateArea(double radius);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, calculateArea(5.5f));
    }
}
