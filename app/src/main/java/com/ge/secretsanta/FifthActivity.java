package com.ge.secretsanta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FifthActivity extends AppCompatActivity {

    private EditText editText5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        editText5 = findViewById(R.id.editText5);
    }

    public void next5(View view) {
        if (editText5.getText().toString().equals("1")){
            Toast.makeText(this, "Great!", Toast.LENGTH_SHORT).show();
            editText5.setText("");
            startActivity(new Intent(this, SixthActivity.class));
            finish();
        }else{
            Toast.makeText(this, "Please check once again! "+SplashScreen.count, Toast.LENGTH_SHORT).show();
            editText5.setText("");
        }
        SplashScreen.count++;
    }
}
