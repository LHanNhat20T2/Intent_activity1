package com.example.profile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_first extends AppCompatActivity {
    Button btnclick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        btnclick = (Button) findViewById(R.id.btnClickMe);
//      Event khi click chuyển sang activity 2
        btnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Activity_first.this, Activity_second.class);
                startActivity(it);
            }
        });
    }
}