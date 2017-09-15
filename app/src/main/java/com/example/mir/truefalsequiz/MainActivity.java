package com.example.mir.truefalsequiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button t, f, next;
    private TextView question;
    private List<Question> questionBank;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wirewidgets();
        setListeners();
        setQuestionBank();
        question.setText(questionBank.get(0).getQuestionText());
    }

    private void setQuestionBank() {
        questionBank = new ArrayList<>();
        questionBank.add(new Question(getString(R.string.jelly), true));
        questionBank.add(new Question(getString(R.string.notes), true));
        questionBank.add(new Question(getString(R.string.ferrets), false));
        questionBank.add(new Question(getString(R.string.tnf), true));
        questionBank.add(new Question(getString(R.string.burgers), true));
        questionBank.add(new Question(getString(R.string.babyHeads), true));
        questionBank.add(new Question("", true));
    }

    private void setListeners() {
        t.setOnClickListener(this);
        f.setOnClickListener(this);
        next.setOnClickListener(this);
    }

    private void wirewidgets() {
        t = (Button) findViewById(R.id.button_true);
        f = (Button) findViewById(R.id.button_false);
        next= (Button) findViewById(R.id.button_next);
        question = (TextView) findViewById(R.id.text_question);
    }


    @Override
    public void onClick(View view) {
    }
}
