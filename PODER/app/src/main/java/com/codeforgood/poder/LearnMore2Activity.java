package com.codeforgood.poder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LearnMore2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_more2);
        Button next = (Button) findViewById(R.id.next2);

        next.setVisibility(View.VISIBLE);
        next.setBackgroundColor(Color.TRANSPARENT);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnMore2Activity.this, LearnMore3Activity.class);
                startActivity(intent);
            }
        });
    }
}
