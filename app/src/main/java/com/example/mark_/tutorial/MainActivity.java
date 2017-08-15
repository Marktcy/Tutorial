package com.example.mark_.tutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.b1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // move from ActivityOne to ActivityTwo
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("dataString", "Hello World");
                //startActivityForResult(intent, 2);
                startActivityForResult(intent, 2);
            }
        });

        int intA = 0;
        int intB = 1;
        Log.d("MyApp","value of A + B =" + (intA+intB));

        Log.d("MyApp","line number =" + 18);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 2 && resultCode == RESULT_OK && data != null){
            String result = data.getStringExtra("result");
            if(result.equals("2good")){
                Log.d("MyApp", "2good received by 1");
            }
        }
    }
}
