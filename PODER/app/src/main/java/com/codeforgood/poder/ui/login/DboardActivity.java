package com.codeforgood.poder.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.codeforgood.poder.R;

public class DboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_dboard);
        Button acc = (Button) findViewById(R.id.AccountButton);
        Button app = (Button) findViewById(R.id.AppointmentButton);
        Button demo = (Button) findViewById(R.id.DemographicsButton);
        Button exam = (Button) findViewById(R.id.ExamButton);

        acc.setVisibility(View.VISIBLE);
        acc.setBackgroundColor(Color.TRANSPARENT);
        app.setVisibility(View.VISIBLE);
        app.setBackgroundColor(Color.TRANSPARENT);
        demo.setVisibility(View.VISIBLE);
        demo.setBackgroundColor(Color.TRANSPARENT);
        exam.setVisibility(View.VISIBLE);
        exam.setBackgroundColor(Color.TRANSPARENT);

    }
}
