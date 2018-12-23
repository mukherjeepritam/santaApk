package com.ge.secretsanta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TenthActivity extends AppCompatActivity {

    private EditText editText10;
    public static String guess;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenth);
        editText10 = findViewById(R.id.editText10);
    }


    public void finish(View view) {
        if (editText10.getText().toString().isEmpty()){
            Toast.makeText(this, "Please Guess a Name!", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Thanks for taking the fun quiz and completing it with sheer patience.", Toast.LENGTH_LONG).show();
            guess = editText10.getText().toString();
            startActivity(new Intent(this, FinalActivity.class));
            finish();
        }
        SplashScreen.count++;
    }
}
