package com.example.mark_.tutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Log.d("MyApp","I am Activity 2");
        String data= getIntent().getStringExtra("dataString");
        Log.d("MyApp","data = "+data);
        Intent output = new Intent();
        output.putExtra("result","2good");
        setResult(RESULT_OK,output);
        finish();
    }
}
