package com.codeforgood.poder;

public class Question {
    //Class that will update the view with the new question

    private String questionText;
    private String ChoiceA;
    private String ChoiceB;
    private String ChoiceC;
    private String ChoiceD;
    private int pictureId;

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
