package com.codeforgood.poder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LearnMore1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_more1);
        Button next = (Button) findViewById(R.id.next);

        next.setVisibility(View.VISIBLE);
        next.setBackgroundColor(Color.TRANSPARENT);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnMore1Activity.this, LearnMore2Activity.class);
                startActivity(intent);
            }
        });
    }
}
