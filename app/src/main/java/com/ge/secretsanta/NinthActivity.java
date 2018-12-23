package com.ge.secretsanta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class NinthActivity extends AppCompatActivity {

    private EditText editText9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninth);
        editText9 = findViewById(R.id.editText9);
    }

    public void next9(View view) {
        if (editText9.getText().toString().equals("174")){
            Toast.makeText(this, "We are Done! Final Question!", Toast.LENGTH_SHORT).show();
            editText9.setText("");
            startActivity(new Intent(this, TenthActivity.class));
            finish();
        }else {
            Toast.makeText(this, "Try Again!", Toast.LENGTH_SHORT).show();
            editText9.setText("");
        }
        SplashScreen.count++;
    }
}
