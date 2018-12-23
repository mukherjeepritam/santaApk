package com.ge.secretsanta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FourthActivity extends AppCompatActivity {

    private EditText editText4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        editText4 = findViewById(R.id.editText4);
    }

    public void next4(View view) {
        if (editText4.getText().toString().equals("01/01/2011")){
            Toast.makeText(this, "WOW!", Toast.LENGTH_SHORT).show();
            editText4.setText("");
            startActivity(new Intent(this,FifthActivity.class));
            finish();
        }else {
            Toast.makeText(this, "Is It!! Please recheck which one is visible to friend Hint: Red Dress", Toast.LENGTH_LONG).show();
            editText4.setText("");
        }
        SplashScreen.count++;
    }
}
