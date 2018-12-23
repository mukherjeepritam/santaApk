package com.ge.secretsanta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private EditText editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        editText2 = findViewById(R.id.editText2);
    }

    public void next2(View view) {
        if (editText2.getText().toString().equalsIgnoreCase("Today")){
            Toast.makeText(this, "Good!", Toast.LENGTH_SHORT).show();
            editText2.setText("");
            startActivity(new Intent(this, ThirdActivity.class));
            finish();
        }else {
            Toast.makeText(this, "Wrong Answer!! Please try again.", Toast.LENGTH_SHORT).show();
            editText2.setText("");
        }
        SplashScreen.count++;
    }
}
