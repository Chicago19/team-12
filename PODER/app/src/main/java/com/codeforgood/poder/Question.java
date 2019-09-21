package com.codeforgood.poder;

public class Question {
    //Class that will update the view with the new question


    private String questionText;
    private String ChoiceA;
    private String ChoiceB;
    private String ChoiceC;
    private String ChoiceD;
    private int pictureId;

    private static String[] Questions = {

            "1. What’s the mother’s name?",
            "2. There are three ___ on the table.",
            "3. Is Ramona happy?",
            "4. Carmina’s Restaurant is open ___.",
            "5. How many people work at the day-care center?",
            "6. Who works until 8:00 p.m. on Tuesday and Thursday?",
            "7. The post office is ___ the parking lot.",
            "8. A What are Katia and Sara doing?, They ___"

    };

    private static String[][] Answers = {
            { " His name is Pilar.", "Her name is Pilar.", "Their name is Pilar.",
                    "Your name is Pilar."},
            {"cup", "cups", "cake", "plate"},
            {"Yes, she is.", "Yes, we are.", "Yes, he is.", "Yes, they are."},
            {"on Sunday", "on Tuesday", "on Saturday", "on Monday"},
            {"three", "four" , "five", "six"},
            {"Dan", "Juan", "Megan" , "Sally"},
            {"on", "across from", "on the corner of", "next to"},
            { "talking", "are talking", "is talking", "talk"}

    };



    private String CorrectAnswer;
    int CurrentQuestion;
    int[] answers = new int[41];
    //Send question values in an array

    public Question(int id, String question_text) {
        this.questionText = question_text;
        this.pictureId = id;
    }
    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        //Get question text from the question database
        this.questionText = questionText;
    }

    public String getChoiceA() {
        return ChoiceA;
    }

    public void setChoiceA(String choiceA) {
        ChoiceA = choiceA;
    }

    public String getChoiceB() {
        return ChoiceB;
    }

    public void setChoiceB(String choiceB) {
        ChoiceB = choiceB;
    }

    public String getChoiceC() {
        return ChoiceC;
    }

    public void setChoiceC(String choiceC) {
        ChoiceC = choiceC;
    }

    public String getChoiceD() {
        return ChoiceD;
    }

    public void setChoiceD(String choiceD) {
        ChoiceD = choiceD;
    }

    public String getCorrectAnswer() {
        return CorrectAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        CorrectAnswer = correctAnswer;
    }


    public double grade() {
//store an empty string in the first position

        return -1;
    }
}
