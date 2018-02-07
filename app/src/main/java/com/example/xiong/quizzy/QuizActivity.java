package com.example.xiong.quizzy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.CheckBox;

public class QuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }

    public void finishQuiz(View view) {
        int score = 0;

        if (((RadioButton)findViewById(R.id.q2_answer1)).isChecked()) score++;
        if (((RadioButton)findViewById(R.id.q3_answer3)).isChecked()) score++;
        if (((RadioButton)findViewById(R.id.q4_answer2)).isChecked()) score++;
        if (((CheckBox)findViewById(R.id.q5_answer1)).isChecked()) score++;
        if (((CheckBox)findViewById(R.id.q5_answer2)).isChecked()) score--;
        if (((CheckBox)findViewById(R.id.q5_answer3)).isChecked()) score--;
        if (((CheckBox)findViewById(R.id.q6_answer1)).isChecked()) score--;
        if (((CheckBox)findViewById(R.id.q6_answer2)).isChecked()) score--;
        if (((CheckBox)findViewById(R.id.q6_answer3)).isChecked()) score++;

        Bundle bundle = getIntent().getExtras();
        String userString = bundle.getString("user","user");
        Intent intent = new Intent(this, FinishActivity.class);
        intent.putExtra("user", userString);
        intent.putExtra("score", score);
        startActivity(intent);
    }
}
