package com.codeforgood.poder;

import androidx.appcompat.app.AppCompatActivity;

import android.provider.MediaStore;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.os.Bundle;
import android.widget.ImageView;
import java.util.ArrayList;
import android.view.View;

import org.w3c.dom.Text;


public class PlacementExam extends AppCompatActivity {

    private static RadioGroup rg_choices;
    private static RadioButton rb_selected;
    private static ImageView iv_picture;
    private static RadioButton rb_choiceA;
    private static RadioButton rb_choiceB;
    private static RadioButton rb_choiceC;
    private static RadioButton rb_choiceD;

    private static TextView tv_questions;
    private static ImageView question_image;
    private static Button next_question_button;


    private int currentQuestionIndex;
    private Question questions;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placement_exam);
        this.initialize();
    }

    private void initialize() {
        //include images
        next_question_button = (Button) findViewById(R.id.next_button);
        next_question_button.setOnClickListener( new View.OnClickListener(){
            public void onClick (View v){
                //changing page
                Advance();
            }
        });
        tv_questions = (TextView) findViewById(R.id.question_text);
        rg_choices = (RadioGroup) findViewById(R.id.rg);
        iv_picture = (ImageView) findViewById(R.id.iv_picture);
        rb_choiceA = (RadioButton) findViewById(R.id.a_rb);
        rb_choiceB = (RadioButton) findViewById(R.id.b_rb);
        rb_choiceC = (RadioButton) findViewById(R.id.c_rb);
        rb_choiceD = (RadioButton) findViewById(R.id.d_rb);
        next_question_button = (Button) findViewById(R.id.next_button);
        currentQuestionIndex = 0;
        questions=new Question(0, "");


        this.DisplayQuestion(currentQuestionIndex);
    }

    private void DisplayQuestion(int index) {
        //eventually will display a picture for each question

        tv_questions.setText(questions.getQuestionText(currentQuestionIndex));
        rb_choiceA.setText(questions.getChoiceA(currentQuestionIndex));
        rb_choiceB.setText(questions.getChoiceB(currentQuestionIndex));;
        rb_choiceC.setText(questions.getChoiceC(currentQuestionIndex));
        rb_choiceD.setText(questions.getChoiceD(currentQuestionIndex));
        rg_choices.clearCheck();

    }
    private void Advance() {
        currentQuestionIndex++;

        if(currentQuestionIndex >= questions.numQuestions) {
            //change to next page
            //grade
            return;
        }

        DisplayQuestion(currentQuestionIndex);
    }





}
