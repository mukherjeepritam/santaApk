package com.ge.secretsanta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    EditText editText3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        editText3 = findViewById(R.id.editText3);
    }

    public void next3(View view) {
        if (editText3.getText().toString().equals("2269")){
            Toast.makeText(this, "Well Done!", Toast.LENGTH_SHORT).show();
            editText3.setText("");
            startActivity(new Intent(this, FourthActivity.class));
            finish();
        }else {
            Toast.makeText(this, "Try Again!", Toast.LENGTH_SHORT).show();
            editText3.setText("");
        }
        SplashScreen.count++;
    }
}
