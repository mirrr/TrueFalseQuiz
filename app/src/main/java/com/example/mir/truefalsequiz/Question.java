package com.example.mir.truefalsequiz;

/**
 * Created by per6 on 9/15/17.
 */

public class Question {
    private String questionText;
    private boolean answer;


    public String getQuestionText() {
        return questionText;
    }

    public boolean isAnswer() {
        return answer;
    }

    public Question(String questionText, boolean answer) {
        this.questionText = questionText;
        this.answer = answer;
    }
    public boolean checkAns(Boolean userAns)
    {
        return userAns == answer;
    }
}


