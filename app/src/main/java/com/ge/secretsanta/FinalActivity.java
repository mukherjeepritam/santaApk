package com.ge.secretsanta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FinalActivity extends AppCompatActivity {

    TextView TextGuess, TextQuestion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        TextGuess = findViewById(R.id.textGuess);
        TextQuestion = findViewById(R.id.textQuestion);

        TextGuess.setText("Guess : " + TenthActivity.guess);
        TextQuestion.setText("Question : 10 and Attempts : "+SplashScreen.count);

    }

    public void Done(View view) {
        Toast.makeText(this, "Thanks!!", Toast.LENGTH_SHORT).show();
        finish();
    }
}
