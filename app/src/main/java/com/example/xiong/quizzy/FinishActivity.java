package com.example.xiong.quizzy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class FinishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);
        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("score", 0);
        String userString = bundle.getString("user", "user");
        TextView scoreView = findViewById(R.id.score2_tv);
        scoreView.setText(" " + score + " points!");
        TextView nameView = findViewById(R.id.score1_tv);
        nameView.setText(userString + "'s score is: ");
    }

    public void startQuiz(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
