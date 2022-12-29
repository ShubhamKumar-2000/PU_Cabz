package com.example.pucabz;

import static com.example.pucabz.R.id.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity<button> extends AppCompatActivity {
    private Button mDriver, mCUSTOMER;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDriver = (Button) findViewById(R.id.driver);
        mCUSTOMER = (Button) findViewById(R.id.driver);

        mDriver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this, DriverLoginActivity.class);
                StartActivity(intent);
                finish();
                return;
            }
        });
    }
}