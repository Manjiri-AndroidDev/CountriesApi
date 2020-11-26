package com.example.countriesapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.countriesapi.ui.DisplayContinentsActivity;

public class MainActivity extends AppCompatActivity {

    Button getButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getButton=findViewById(R.id.get_button);

        getButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), DisplayContinentsActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
