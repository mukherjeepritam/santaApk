package com.ge.secretsanta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SixthActivity extends AppCompatActivity {

    private EditText editText6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);
        editText6 = findViewById(R.id.editText6);
    }

    public void next6(View view) {
        if (editText6.getText().toString().equalsIgnoreCase("Ramesh D") ||
                editText6.getText().toString().equalsIgnoreCase("Ramesh") ){
            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
            editText6.setText("");
            startActivity(new Intent(this, SeventhActivity.class));
            finish();
        }
        else {
            Toast.makeText(this, "Wrong!! Please check!", Toast.LENGTH_SHORT).show();
            editText6.setText("");
        }
        SplashScreen.count++;
    }
}
