package com.example.xiong.quizzy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startQuiz(View view) {
        EditText username = findViewById(R.id.name_etxt);
        String userString = username.getText().toString();
        Intent intent = new Intent(this, QuizActivity.class);
        intent.putExtra("user", userString);
        if (userString.isEmpty() == false) {
            startActivity(intent);
        }
    }
}
