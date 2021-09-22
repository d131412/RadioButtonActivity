package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_audio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_audio = findViewById(R.id.btn_audio);
        setOnClickListener();
    }

    private void setOnClickListener(){
        OnClick click = new OnClick();
        btn_audio.setOnClickListener(click);
    }

    private class OnClick implements View.OnClickListener{
        Intent intent = null ;
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btn_audio:
                    intent = new Intent(MainActivity.this,RadioButtonActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}