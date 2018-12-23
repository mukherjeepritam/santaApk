package com.ge.secretsanta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SeventhActivity extends AppCompatActivity {

    private EditText editText7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);
        editText7 = findViewById(R.id.editText7);
    }

    public void next7(View view) {
        if (editText7.getText().toString().equals("1")){
            Toast.makeText(this, "We are almost done!", Toast.LENGTH_SHORT).show();
            editText7.setText("");
            startActivity(new Intent(this, EightActivity.class));
            finish();
        }else {
            Toast.makeText(this, "Oh No! Try Again!", Toast.LENGTH_SHORT).show();
            editText7.setText("");
        }
        SplashScreen.count++;
    }
}
