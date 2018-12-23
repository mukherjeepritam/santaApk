package com.ge.secretsanta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);

    }

    public void next1(View view) {
        if (editText1.getText().toString().equals("70")){
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, SecondActivity.class));
            editText1.setText("");
            finish();
        }else {
            Toast.makeText(this, "Wrong Answer!! Please try again.", Toast.LENGTH_SHORT).show();
            editText1.setText("");
        }
        SplashScreen.count++;
    }
}
