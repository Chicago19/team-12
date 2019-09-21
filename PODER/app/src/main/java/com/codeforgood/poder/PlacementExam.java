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
    private ArrayList<Question> questions;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placement_exam);
        this.initialize();
    }

    private void initialize() {
        //include images
        next_question_button = (Button) findViewById(R.id.next_button);
/*        next_question_button.setOnClickListener( new View.OnClickListener(){
            public void onClick (View v){
                //changing page
                Advance();
            }
        });

*/
        iv_picture = (ImageView) findViewById(R.id.iv_picture);
        rb_choiceA = (RadioButton) findViewById(R.id.a_rb);
        rb_choiceB = (RadioButton) findViewById(R.id.b_rb);
        rb_choiceC = (RadioButton) findViewById(R.id.c_rb);
        rb_choiceD = (RadioButton) findViewById(R.id.d_rb);
        next_question_button = (Button) findViewById(R.id.next_button);
        currentQuestionIndex = 0;
        questions=new ArrayList<Question>();

        questions.add(new Question(0, "Here is question 1!"));
        questions.add(new Question(0, "Here is question 2!"));
        questions.add(new Question(0, "Here is quesiton 3!"));
        this.DisplayQuestion(currentQuestionIndex);
    }

    private void DisplayQuestion(int index) {
        //eventually will display a picture for each question

        tv_questions.setText(questions.get(currentQuestionIndex).getQuestionText());
        rb_choiceA.setText(questions.get(currentQuestionIndex).getChoiceA());
        rb_choiceB.setText(questions.get(currentQuestionIndex).getChoiceB());
        rb_choiceC.setText(questions.get(currentQuestionIndex).getChoiceC());
        rb_choiceD.setText(questions.get(currentQuestionIndex).getChoiceD());
        rg_choices.clearCheck();
    }
    private void Advance() {
        currentQuestionIndex++;

        if(currentQuestionIndex % questions.size() == 0) {
            //end
        }
        DisplayQuestion(currentQuestionIndex);
    }





}
