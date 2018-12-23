package com.ge.secretsanta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class EightActivity extends AppCompatActivity {

    private EditText editText8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight);
        editText8 = findViewById(R.id.editText8);
    }

    public void next8(View view) {
        if (editText8.getText().toString().equalsIgnoreCase("Shruthi Gowda") ||
                editText8.getText().toString().equalsIgnoreCase("Shruthi")){
            Toast.makeText(this, "Great!", Toast.LENGTH_SHORT).show();
            editText8.setText("");
            startActivity(new Intent(this, NinthActivity.class));
            finish();

        }else {
            Toast.makeText(this, "Noooo! ", Toast.LENGTH_SHORT).show();
            editText8.setText("");
        }
        SplashScreen.count++;
    }
}
